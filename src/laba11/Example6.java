package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(14);
        numbers.add(21);
        numbers.add(10);
        numbers.add(0);
        numbers.add(20);
        numbers.add(30);
        numbers.add(110);

        // Фильтруем числа, которые делятся на numb без остатка
        List<Integer> filteredNumbers = filterNumbersDivisibleBy(numbers, numb);

        // Выводим отфильтрованные числа
        for (int num : filteredNumbers) {
            System.out.println(num);
        }
    }

    // Метод для фильтрации чисел, которые делятся на заданное число без остатка
    public static List<Integer> filterNumbersDivisibleBy(List<Integer> numbers, int numb) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % numb == 0) {
                filteredNumbers.add(num);
            }
        }

        return filteredNumbers;
    }
}
