package laba9.MainExamples;

import java.util.Scanner;

public class Example3 {
    public static Scanner in = new Scanner(System.in);

    public static void toArray(int n, int[] arr){
        if (n != 0) toArray(n-1, arr);
        System.out.print(n + ": ");
        arr[n] = in.nextInt();
    }

    public static void returnArray(int n, int[] arr){
        if (n != 0) returnArray(n-1, arr);
        System.out.print(arr[n] + " ");
    }

    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        toArray(num-1, arr);
        returnArray(num-1, arr);
    }
}
