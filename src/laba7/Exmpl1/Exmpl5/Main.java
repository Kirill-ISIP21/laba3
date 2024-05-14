package laba7.Exmpl1.Exmpl5;

public class Main {
    public static void main(String[] args) {
        SuperClass Supertest = new SuperClass("supertest1");
        SubAClass subA = new SubAClass("sub1", 21);
        SubBClass subB = new SubBClass("sub2", "testSub2");

        Supertest.toConsole();
        System.out.print("\n");
        subA.toConsole();
        System.out.print("\n");
        subB.toConsole();
        System.out.print("\n");

        Supertest = subA;
        Supertest.toConsole();
    }
}
