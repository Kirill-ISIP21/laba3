package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1079 {
    public static void main(String[] args) {
        //a0 = 0, a1 = 1, a2 = 1, a3 = 2, a4 = 1, a5 = 3, a6 = 2, a7 = 3, a8 = 1, a9 = 4
        List<Integer> a = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        a.add(0);
        a.add(1);
        m.add(0);
        m.add(1);
        int mx = 1;
        for(int i = 2; i < 100000; ++i){
            if(i % 2 == 0){
                a.add(a.get(i/2));
                m.add(mx);
            }
            else{
                a.add(a.get(i/2) + a.get(i/2 + 1));
                mx = Math.max(mx, a.get(i));
                m.add(mx);
            }
        }
        Scanner scanner = new Scanner(System.in);
        int t;
        while(scanner.hasNextInt()){
            t = scanner.nextInt();
            if(t == 0)
                break;
            System.out.println(m.get(t));
        }
    }
}
