package laba5;

public class forExample1 {
    private char letter;
    void allowToStr(char word){
        this.letter = word;
    }

    int numOfChar(char c){
        int n = c;
        return n;
    }

    void configure() {
        System.out.println("Код символа " + this.letter + " - "
                + numOfChar(this.letter));
    }
}
