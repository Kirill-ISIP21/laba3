package laba6;

public class forExample3 {
    static void myMethod(int max, int min){
        int k;
        if(max < min){
            k = max;
            max = min;
            min = k;
        }
        System.out.println("Наибольшее значение: " + max);
        System.out.println("Наименьшее значение: " + min);
    }
    static void myMethod(int[] arr){
        double k = 0;
        int max = 0;
        int min = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (min > j) {
                min = j;
            }
            k += j;
        }
        k /= arr.length;
        System.out.println("Наибольшее значение: " + max);
        System.out.println("Наименьшее значение: " + min);
        System.out.println("Среднее значение массива: " + k);
    }
}
