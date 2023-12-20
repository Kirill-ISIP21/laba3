package laba3;
import java.util.Scanner;
public class SamRab4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2){
            int n = num1;
            num1 = num2;
            num2 = n;
        }
        else if (num1 == num2){
            System.out.println("Числа одинаковые");
            return;
        }
        int[] array = new int[num2 - num1 + 1];
        array[0] = num1;
        int i = 1;
        while (i < array.length){
            array[i] = array[i-1] + 1;
            i++;
        }

        for (int j : array)
            System.out.print(j + " ");
    }
}
