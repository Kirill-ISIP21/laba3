package laba10.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HTML2 {
    public static void main(String[] args) {
        try {
            // Загрузка HTML-страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Выборка элементов страницы
            Elements newsParser = doc
                    .select("body > table > tbody > tr > td > div > table > "
                            + "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > "
                            + "tr > td:nth-child(1)");

            // Перебор элементов и вывод информации
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    Element node = (Element) newsParser.get(0).childNodes().get(i);
                    System.out.println("Заголовок: " + node
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0));
                    System.out.println("Дата: " + node
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0) +
                            "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

