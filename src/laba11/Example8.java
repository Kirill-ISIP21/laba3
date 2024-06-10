package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальное значение: ");
        int minValue = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(110);
        numbers.add(2);
        numbers.add(25);
        numbers.add(64);
        numbers.add(501);
        numbers.add(911);

        // Фильтруем числа, которые больше minValue
        List<Integer> filteredNumbers = filterNumbersByValue(numbers, minValue);

        // Выводим отфильтрованные числа
        for (int num : filteredNumbers) {
            System.out.println(num);
        }
    }

    // Метод для фильтрации чисел, которые больше заданного значения
    public static List<Integer> filterNumbersByValue(List<Integer> numbers, int minValue) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num > minValue) {
                filteredNumbers.add(num);
            }
        }
        return filteredNumbers;
    }
}
