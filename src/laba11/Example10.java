package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальное значение: ");
        int maxValue = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(8);
        numbers.add(22);
        numbers.add(10);
        numbers.add(911);

        // Фильтруем числа, которые меньше maxValue
        List<Integer> filteredNumbers = filterNumbersLessThanValue(numbers, maxValue);

        // Выводим отфильтрованные числа
        for (int num : filteredNumbers) {
            System.out.println(num);
        }
    }

    // Метод для фильтрации чисел, которые меньше заданного значения
    public static List<Integer> filterNumbersLessThanValue(List<Integer> numbers, int maxValue) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num < maxValue) {
                filteredNumbers.add(num);
            }
        }
        return filteredNumbers;
    }
}
