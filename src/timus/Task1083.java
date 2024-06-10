package timus;

import java.util.Scanner;

public class Task1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String line = in.nextLine();
        long count = line.chars().filter(ch -> ch == '!').count();
        int buf = num;
        while (buf > 1){
            num *= (int) (buf - count);
            buf = (int) (buf - count);
        }
        System.out.println(num);
    }
}
