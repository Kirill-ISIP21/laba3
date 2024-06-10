package laba12;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example6 {

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
            chunks[i] = Arrays.copyOfRange(numbers, i * chunkSize, (i + 1) * chunkSize);
        }

        // Создаем массив для хранения результатов выполнения каждого потока
        Future<Integer>[] results = new Future[numCores];

        // Запускаем потоки для вычисления суммы в каждой части массива
        for (int i = 0; i < numCores; i++) {
            int finalI = i;
            results[i] = executorService.submit(() -> sum(chunks[finalI]));
        }

        // Вычисляем общую сумму из результатов каждого потока
        int sum = 0;
        for (Future<Integer> result : results) {
            try {
                sum += result.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Выводим общую сумму элементов массива
        System.out.println("Сумма элементов массива: " + sum);

        // Останавливаем пул потоков
        executorService.shutdown();
    }

    // Метод для вычисления суммы элементов в массиве
    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
