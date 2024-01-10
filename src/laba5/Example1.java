package laba5;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        forExample1 abc = new forExample1();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char c = in.next().charAt(0);
        abc.allowToStr(c);
        abc.configure();
    }
}
