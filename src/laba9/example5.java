package laba9;

public class example5 {
    public static int fact(int x){
        System.out.print(x + " -> ");
        if (x == 0) return 0;
        else if (x == 1) return 1;
        else return fact(x - 2) + fact(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(10));
    }
}
