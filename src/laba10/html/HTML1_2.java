package laba10.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTML1_2 {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-step";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");

            // Сохранение ссылок в файл
            File file = new File("src/laba10/html/HTML1_2/links.txt");
            FileWriter writer = new FileWriter(file);

            for (Element link : links) {
                // Вывод абсолютного URL
                System.out.println(link.absUrl("href"));

                // Запись абсолютного URL в файл
                writer.write(link.absUrl("href") + "\n");
            }

            writer.close(); // Закрытие FileWriter

            System.out.println("Ссылки сохранены в файл links.txt");
        } catch (IOException e) {
            // Обработка исключения
            e.printStackTrace();
        }
    }
}

