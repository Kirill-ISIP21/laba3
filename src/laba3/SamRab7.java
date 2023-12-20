package laba3;
public class SamRab7 {
    public static void main(String[] args) {
        char ch1 = 97;
        char []array = new char[10];
        for (int i = 0; i < 10; i++){
            array[i]=ch1;
            ch1+=2;
        }
        for (int i = 0; i < 10; i++) System.out.print(array[i]);
        for (int i = 10 - 1; i >= 0; i--) System.out.print(array[i]);
    }
}
