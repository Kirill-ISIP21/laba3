package laba5;

public class forExample3 {
    private int a;
    private int b;

    forExample3(int l){
        a = b = l;
    }

    forExample3(int l, int m){
        a = l;
        b = m;
    }

    void result(){
        System.out.println("A - " + a + " B - " + b);
    }

}
