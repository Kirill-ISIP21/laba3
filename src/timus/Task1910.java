package timus;
import java.util.Scanner;
public class Task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int max = 0;
        int buff;
        for (int i = 1; i < arr.length - 1; i++) {
            buff = arr[i - 1] + arr[i] + arr[i + 1];
            if (buff > max) {
                max = buff;
                size = i + 1;
            }
        }
        System.out.println(max + " " + size);
    }
}
