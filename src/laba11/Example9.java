package laba11;

import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ford911");
        strings.add("phone");
        strings.add("water@");

        // Фильтруем строки, содержащие только буквы
        List<String> filteredStrings = filterAlphabeticStrings(strings);

        // Выводим отфильтрованные строки
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    // Метод для фильтрации строк, содержащих только буквы
    public static List<String> filterAlphabeticStrings(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
}
