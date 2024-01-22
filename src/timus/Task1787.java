package timus;
import java.util.Scanner;
public class Task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, min;
        size = in.nextInt();
        min = in.nextInt();
        int sum = 0;
        for (int i = 0; i < min; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum % (size * min));
    }
}
