package timus;
import java.util.Scanner;
public class Task2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int count = size + 2;
        String[] arr = new String[size];
        String plus = "+one";
        int indexAr;
        in.nextLine();
        for (int i = 0; i < size; i++){
            arr[i] = in.nextLine();
            indexAr = arr[i].indexOf(plus);
            if (indexAr != -1) count++;
        }
        System.out.println((count == 13 ? count+1 : count) * 100);
    }
}
