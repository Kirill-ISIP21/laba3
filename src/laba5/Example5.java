package laba5;

public class Example5 {
    public static void main(String[] args) {
        forExample5 a = new forExample5();
        a.show();
        a.forInt(150);
        a.show();
        forExample5 b = new forExample5(150);
        b.show();
        b.forInt();
        b.show();
        b.forInt(15);
        b.show();
    }
}
