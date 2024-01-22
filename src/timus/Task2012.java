package timus;
import java.util.Scanner;
public class Task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        if (f>=7 && f<=11){
            System.out.println("YES");
        }else if (f<7 && f>=1){
            System.out.println("NO");
        }
    }

}
