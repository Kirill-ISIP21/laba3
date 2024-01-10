package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        String numbers = in.nextLine();
        System.out.println("Наибольшее и наименьшее число: " + Arrays.toString(forExample10.method(numbers)));
    }
}
