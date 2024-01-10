package laba5;

public class forExample4 {
    private char a;
    private int b;

    forExample4(char a, int b){
        this.a = a;
        this.b = b;
    }

    forExample4(double n){
        a = (char) n;
        b =(int) ((n%1)*100);
    }

    void result(){
        System.out.println("Символ - "+ a + " число - " + b);
    }
}

