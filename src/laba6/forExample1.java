package laba6;

public class forExample1 {
    String text;
    char l;
    void assignTo(char l){
        this.l = l;
    }
    void assignTo(String text){
        this.text = text;
    }
    void assignTo(char[] ar){
        if(ar.length > 1){
            text = new String(ar);
        }
        else l = ar[0];
    }

    void show(){
        System.out.println("Char - "+ l + "\nString - " + text);
    }
}
