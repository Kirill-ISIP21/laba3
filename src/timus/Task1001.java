package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> arrL = new ArrayList<>();
        String line;
        Long ref;

        while (!(line = in.nextLine()).trim().equals("")){
            ref = Long.parseLong(line);
            arrL.add(ref);
        }

        in.close();
        for (int i = arrL.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", Math.sqrt((double) arrL.get(i)));
        }
    }
}
