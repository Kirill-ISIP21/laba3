package laba6;

public class Example6 {
    public static void main(String[] args) {
        int[] arrOld = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrNew = forExample6.method(arrOld, 4);
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
    }
}
