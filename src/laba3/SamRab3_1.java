package laba3;
import java.util.Scanner;
public class SamRab3_1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество чисел: ");
            int size = in.nextInt();
            int[] array = new int[size];
            array[0] = 1;
            array[1] = 1;
            int i = 2;
            while (i < array.length) {
                array[i] += array[i - 1] + array[i - 2];
                i++;
            }
            for (int j : array)
                System.out.print(j + " ");
    }
}
