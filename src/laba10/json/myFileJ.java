package laba10.json;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class myFileJ {
    public static void main(String[] args) {

        JSONObject animals = new JSONObject();
        JSONArray forms = new JSONArray();

        JSONObject form1 = new JSONObject();
        form1.put("breed", "dog");
        form1.put("color", "white");

        JSONObject form2 = new JSONObject();
        form2.put("breed", "cat");
        form2.put("color", "red");

        forms.add(form1);
        forms.add(form2);

        animals.put("anmals", forms);

        try (FileWriter file = new FileWriter("src/laba10/json/myFileJ.json")) {
            file.write(animals.toJSONString());
            System.out.println("Json успешно сохранен.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

