package laba13;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int sum = 0;
        int count = 0;

        // Вводим и проверяем размер массива
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();

        int[] array = new int[size];

        // Заполняем массив элементами, проверяя ввод
        for (int i = 0; i < size; i++) {
            try {
                System.out.print("Введите элемент массива: ");
                array[i] = Integer.parseInt(scanner.next());

                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректный ввод!");
                i--; // Возвращаемся на один шаг назад
            }
        }

        // Выводим, если есть положительные числа в массиве
        if (count == 0) {
            System.out.println("Ошибка: введены отрицательные числа");
        } else {
            double average = (double) sum / count;
            System.out.println("Среднее значение положительных чисел: " + average);
        }
    }
}
