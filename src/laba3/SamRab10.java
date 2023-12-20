package laba3;
import java.util.Arrays;
import java.util.Random;
public class SamRab10 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            Random n = new Random();
            array[i] = n.nextInt(200);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[20 - 1 - i];
            array[20 - i - 1] = temp;
        }
        for (int j : array) System.out.print(j + " ");
    }
}
