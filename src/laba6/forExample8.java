package laba6;

public class forExample8 {
    public static double method(int[] arr){
        double k = 0;
        for (int i = 0; i < arr.length; i++) {
            k += arr[i];
        }
        k /= arr.length;
        return k;
    }
}
