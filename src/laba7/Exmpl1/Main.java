package laba7.Exmpl1;

public class Main {
    public static void main(String[] args) {
        SuperClass A = new SuperClass("test1");
        SubClass B = new SubClass("test2");
        SubClass C = new SubClass("text3", "test4");

        System.out.printf(A.toString());
        System.out.print("\n");
        System.out.printf(B.toString());
        System.out.print("\n");
        System.out.printf(C.toString());
    }
}
