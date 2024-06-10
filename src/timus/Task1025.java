package timus;
import java.util.Scanner;

public class Task1025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int answer = 0, result = 0, k = 0, min = 9999;
        int groups = (size / 2) + 1;
        for (int i = 0; i < groups; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[j] < min && arr[j] != 0) {
                    min = arr[j];
                    k = j;
                    result = (min / 2) + 1;
                }
            }
            min = 9999;
            arr[k] = 0;
            answer += result;
        }
        System.out.println(answer);
    }
}
