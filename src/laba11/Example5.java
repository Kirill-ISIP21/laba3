package laba11;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hehe");
        strings.add("xd");
        strings.add("sometext");

        // Фильтруем строки, содержащие подстроку "o"
        List<String> filteredStrings = filterStringsContainingSubstring(strings, "o");

        // Выводим отфильтрованные строки
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    // Метод для фильтрации строк, содержащих заданную подстроку
    public static List<String> filterStringsContainingSubstring(List<String> strings, String subString) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.contains(subString)) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }
}
