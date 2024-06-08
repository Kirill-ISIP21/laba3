package laba9.MainExamples.Example7;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int N = 10;  // количество человек
        ArrayList<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size(); // перемещение на следующего человека
            circle.remove(index);               // вычеркивание человека
        }

        System.out.println("Оставшийся человек: " + circle.get(0));
    }
}

