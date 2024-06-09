package laba10.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JSON1_4 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/laba10/json/JSON1.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Название файла: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nНазвание книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("autor"));
                System.out.println("Год издания: " + book.get("year"));
            }

            deleteBookByTitle(jsonArray, "Война и мир");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBookByTitle(JSONArray jsonArray, String title) {
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject book = (JSONObject) jsonArray.get(i);
            if (book.get("title").equals(title)) {
                jsonArray.remove(i);
                System.out.println("Книга с названием '" + title + "' удалена.");
                return;
            }
        }
        System.out.println("Книга с названием '" + title + "' не найдена.");
    }
}

