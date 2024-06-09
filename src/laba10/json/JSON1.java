package laba10.json;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON1 {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("autor", "Лев Толстой");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("title", "Создание Советского Союза");
        book2.put("autor", "Ричард Пайпс");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try {
            FileWriter file = new FileWriter("src/laba10/json/JSON1.json");
            file.write(library.toJSONString());
            System.out.println("JSON файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

