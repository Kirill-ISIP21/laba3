package laba9.MainExamples;

public class Example2 {
    public static void toBinary(int x){
        if (x > 1) toBinary(x/2);
        System.out.print(x % 2);
    }

    public static void main(String[] args) {
        toBinary(31);
    }
}
