package laba4;
import java.util.Random;
public class Examole6 {
    public static void main(String[] args) {
        int size = 5;
        int[][] arrFull = new int[size][size];
        Random rnd = new Random();
        int numI = rnd.nextInt(size-1);
        int numJ = rnd.nextInt(size-1);
        int[][] arrDowned = new int[size-1][size-1];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                arrFull[i][j] = rnd.nextInt(9);
                System.out.print(arrFull[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nИндекс i = " + numI + " Индекс j = " + numJ + "\n");
        for (int i = 0; i < size-1; i++)
        {
            for (int j = 0; j < size-1; j++)
            {

                if (i >= numI && j >= numJ) arrDowned[i][j] = arrFull[i+1][j+1];
                else{
                    if (i < numI && j >= numJ) arrDowned[i][j] = arrFull[i][j+1];
                    else
                    {
                        if (i >= numI) arrDowned[i][j] = arrFull[i+1][j];
                        else arrDowned[i][j] = arrFull[i][j];
                    }
                }

                System.out.print(arrDowned[i][j] + " ");
            }
            System.out.println();
        }
    }
}
