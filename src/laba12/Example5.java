package laba12;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example5 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Получаем количество доступных ядер
        int numCores = Runtime.getRuntime().availableProcessors();

        // Создаем пул потоков фиксированного размера, равного количеству ядер
        ExecutorService executorService = Executors.newFixedThreadPool(numCores);

        // Вычисляем размер части массива для каждого потока
        int chunkSize = numbers.length / numCores;
        int[][] chunks = new int[numCores][];
        for (int i = 0; i < numCores; i++) {
            chunks[i] = Arrays.copyOfRange(numbers, i * chunkSize, (i == numCores - 1) ? numbers.length : (i + 1) * chunkSize);
        }

        // Создаем массив для хранения результатов выполнения каждого потока
        Future<Integer>[] results = new Future[numCores];

        // Запускаем потоки для поиска максимума в каждой части массива
        for (int i = 0; i < numCores; i++) {
            int finalI = i;
            results[i] = executorService.submit(() -> findMax(chunks[finalI]));
        }

        // Находим максимум среди результатов каждого потока
        int max = Integer.MIN_VALUE;
        for (Future<Integer> result : results) {
            try {
                int localMax = result.get();
                if (localMax > max) {
                    max = localMax;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Выводим результат
        System.out.println("Максимальное значение: " + max);

        // Останавливаем пул потоков
        executorService.shutdown();
    }

    // Метод для нахождения максимального значения в массиве
    private static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
