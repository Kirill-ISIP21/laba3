package laba3;
import java.util.Scanner;
public class SamRab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
}