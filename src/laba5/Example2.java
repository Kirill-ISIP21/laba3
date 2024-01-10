package laba5;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        forExample2 abc = new forExample2();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый символ: ");
        abc.a = in.next().charAt(0);
        System.out.print("Введите второй символ: ");
        abc.b = in.next().charAt(0);
        abc.MyMethod();
    }
}
