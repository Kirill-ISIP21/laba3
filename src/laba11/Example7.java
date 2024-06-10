package laba11;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальную длину строки: ");
        int minLength = in.nextInt();

        List<String> strings = new ArrayList<>();
        strings.add("sdcdsf");
        strings.add("asd");
        strings.add("sdasdfasfas");

        // Фильтруем строки по длине
        List<String> filteredStrings = filterStringsByLength(strings, minLength);

        // Выводим отфильтрованные строки
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }

    // Метод для фильтрации строк по длине
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (str.length() > minLength) {
                filteredStrings.add(str);
            }
        }
        return filteredStrings;
    }
}
