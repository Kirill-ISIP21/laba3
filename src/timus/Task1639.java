package timus;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        int result = (m * n) % 2;

        if (result != 0) {
            out.println("[second]=:]");
        } else {
            out.println("[:=[first]");
        }
        out.flush();

    }
}