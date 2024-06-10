package laba9.MainExamples.Example5;

public class TestFromTail {
    public static void main(String[] args) {
        ExampleList tail = new ExampleList(0, null);
        ExampleList ref = tail;
        for (int i = 0; i < 15; i++) {
            tail.value = i;
            tail.next = new ExampleList(i+1, null);
            tail = tail.next;
        }

        while (ref.next != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
