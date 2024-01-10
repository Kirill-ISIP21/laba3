package laba6;

public class Example1 {
    public static void main(String[] args) {
        forExample1 a = new forExample1();
        a.assignTo('l');
        a.assignTo("Some text");
        a.show();
        char[] test1 = {'H','e','l','l','o'};
        char[] test2 = {'F'};
        a.assignTo(test1);
        a.assignTo(test2);
        a.show();
    }
}
