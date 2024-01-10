package laba6;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную String: ");
        String text = in.nextLine();
        int[] answer = forExample7.method(text);
        System.out.println(text);
        System.out.println();
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
