package timus;
import java.util.Scanner;
import java.util.Arrays;

public class Task1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] mass = new String[n];
        mass[0] = in.nextLine();

        for (int i = 0; i < n; i++){
            mass[i] = in.nextLine();
        }
        int ep = 0;
        int lp = 0;
        int mp = 0;
        for (String ping : mass){
            switch (ping){
                case ("Emperor Penguin"):
                ep++;
                break;
                case  ("Little Penguin"):
                lp++;
                break;
                case  ("Macaroni Penguin"):
                mp++;
                break;
            }
        }
        if (ep > lp && ep > mp) System.out.println("Emperor Penguin");
        else if (lp > mp && lp > ep) System.out.println("Little Penguin");
        else System.out.println("Macaroni Penguin");


    }
}
