package timus;
import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int passcode1 = in.nextInt();
        int passcode2 = in.nextInt();

        if (passcode1 != passcode2 && passcode2 < passcode1){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

}
