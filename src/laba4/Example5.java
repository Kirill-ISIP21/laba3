package laba4;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) {
        int size = 5;
        int temp;
        int[][] arr = new int[size][size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                arr[i][j] = rnd.nextInt(9);
            }
        }
        for(int[] x: arr)
        {
            for (int y: x) System.out.print(y + " ");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < size; i++)
        {
            for (int j = i; j < size; j++)
            {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] x: arr)
        {
            for (int y: x) System.out.print(y + " ");
            System.out.println();
        }
    }
}
