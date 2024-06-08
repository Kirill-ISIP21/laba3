package laba9.MainExamples;

public class Example8 {
    public static void main(String[] args) {
        Node linkedList = new Node();

        linkedList.createHead(new int[]{0, 1, 2});
        System.out.println(linkedList.toString());

        linkedList.createTail(new int[]{3, 2, 1});
        System.out.println(linkedList.toString());

        linkedList.addFirst(-1);
        System.out.println(linkedList.toString());

        linkedList.addLast(17);
        System.out.println(linkedList.toString());

        linkedList.insert(100, 3);
        System.out.println(linkedList.toString());

        linkedList.removeFirst();
        System.out.println(linkedList.toString());

        linkedList.removeLast();
        System.out.println(linkedList.toString());

        linkedList.remove(2);
        System.out.println(linkedList.toString());

        linkedList.createHeadRec(5);
        System.out.println(linkedList.toStringRec(linkedList.head));

        linkedList.createTailRec(4);
        System.out.println(linkedList.toStringRec(linkedList.head));
    }
}

class Node {
    protected int value;
    protected Node next;
    protected Node head;

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node() {
    }

    protected void createHead(int[] values) {
        Node head = new Node(values[0], null);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
        this.head = head;
        System.out.println("Список создан с головы:");
    }

    protected void createTail(int[] values) {
        Node head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
        this.head = head;
        System.out.println("Список создан с хвоста:");
    }

    public String toString() {
        Node ref = head;
        System.out.println("Текущий список:");
        StringBuilder toString = new StringBuilder();
        while (ref != null) {
            toString.append(" ").append(ref.value);
            ref = ref.next;
        }
        return toString.toString();
    }

    protected void addFirst(int head) {
        this.head = new Node(head, this.head);
        System.out.println("Добавление элемента в начало списка:");
    }

    protected void addLast(int tail) {
        Node newTail = new Node(tail, null);
        Node ref = this.head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
        System.out.println("Добавление элемента в конец списка:");
    }

    protected void insert(int middle, int queue) {
        Node newNode = new Node(middle, null);
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        System.out.println("Вставка элемента на " + queue + " позицию:");
    }

    protected void removeFirst() {
        this.head = this.head.next;
        System.out.println("Удаление первого элемента списка:");
    }

    protected void removeLast() {
        Node ref = this.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        System.out.println("Удаление последнего элемента списка:");
    }

    protected void remove(int queue) {
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        System.out.println("Удаление элемента на " + queue + " позиции:");
    }

    Node createHeadRec(int value) {
        if (value == 0) {
            System.out.println("Рекурсивное создание списка с головы завершено:");
            return null;
        }
        return this.head = new Node(value, createHeadRec(value - 1));
    }

    int createTailRec(int value) {
        if (value == 0) {
            System.out.println("Рекурсивное создание списка с хвоста завершено:");
            this.head = null;
            return 0;
        }
        head = new Node(createTailRec(value - 1), head);
        return value;
    }

    public String toStringRec(Node head) {
        if (head == null) {
            return " Рекурсивный список завершен.";
        }
        return head.getValue() + " " + toStringRec(head.getNext());
    }
}

