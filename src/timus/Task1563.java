package timus;

import java.util.HashSet;
import java.util.Scanner;

public class Task1563 {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        for (int i = 0; i < n; i++) {
            String tempStr = scanner.nextLine();
            strSet.add(tempStr);
        }
        System.out.println(n - strSet.size());
    }
}
