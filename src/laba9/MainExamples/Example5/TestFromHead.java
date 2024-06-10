package laba9.MainExamples.Example5;

public class TestFromHead {
    public static void main(String[] args) {
        ExampleList head = null;
        for (int i = 10; i > 0; i--) {
            head = new ExampleList(i, head);
        }

        ExampleList ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
