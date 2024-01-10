package laba6;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word: ");
        String text = in.nextLine();
        char[] textChar = text.toCharArray();
        forExample9.method(textChar);
        text = new String(textChar);
        System.out.println(text);
    }
}
