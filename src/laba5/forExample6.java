package laba5;

public class forExample6 {
    private int min = 0;
    private int max = 0;
    void allowToInt(int a, int b){
        if(a > b){
            max = a;
            min = b;
        }
        else {
            min = a;
            max = b;
        }
    }
    void allowToInt(int a){
        if (a > max) max = a;
        if (a < min) min = a;
    }
    forExample6(int a, int b){
        if(a > b){
            max = a;
            min = b;
        }
        else {
            min = a;
            max = b;
        }
    }
    forExample6(int a){
        max = a;
    }
    void show(){
        System.out.println("Max = " + max + " Min = " + min);
    }
}
