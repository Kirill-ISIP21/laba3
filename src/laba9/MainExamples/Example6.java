package laba9.MainExamples;
import java.util.HashMap;
import java.util.Map;

public class Example6 {
    public static void main(String[] args) {
        // Заполняем HashMap 10 объектами <Integer, String>
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        // Найти строки у которых ключ > 5
        System.out.println("Strings with keys > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // Если ключ = 0, вывести строки через запятую
        System.out.println("Strings with key = 0:");
        if (map.containsKey(0)) {
            System.out.println(map.get(0));
        }

        // Перемножить все ключи, где длина строки > 5
        int product = 1;
        boolean found = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }

        if (found) {
            System.out.println("Product of keys where string length > 5: " + product);
        } else {
            System.out.println("No strings with length > 5 found.");
        }
    }
}
