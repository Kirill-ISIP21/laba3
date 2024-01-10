package laba6;

public class forExample9 {
    public static void method(char[] arr){
        char l;
        for (int i = 0; i < arr.length/2; i++) {
            l = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = l;
        }
    }
}
