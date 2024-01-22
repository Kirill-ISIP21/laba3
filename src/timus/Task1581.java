package timus;
import java.util.Scanner;
public class Task1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 1 && n <= 1000) {
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            int value = 1;
            for (int i = 0; i < n; i++) {
                if (i + 1 < n && (ar[i] == ar[i + 1])) {
                    value++;
                } else {
                    System.out.print(value + " " + ar[i] + " ");
                    value = 1;
                }
            }
        }
        else System.out.println("Не корректное число");
    }
}
