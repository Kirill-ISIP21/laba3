package timus;

import java.util.Scanner;

public class Task2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t, s = 0;
        for(int i = 0; i < n; ++i){
            t = scanner.nextInt();
            s += t;
            if(t == 3){
                System.out.println("None");
                return;
            }
        }
        if(s == n * 5)
            System.out.println("Named");
        else if(1.0 * s / n >= 4.5)
            System.out.println("High");
        else
            System.out.println("Common");
    }
}
