package laba5;

public class forExample5 {
    private int n;
    void forInt(){
        n = 0;
    }
    void forInt(int n){
        if (n > 100) this.n = 100;
        else this.n = n;
    }
    forExample5(){
        n = 0;
    }
    forExample5(int n){
        if (n > 100) this.n = 100;
        else this.n = n;
    }
    void show(){
        System.out.println("Числовое поле равно: " + n);
    }
}
