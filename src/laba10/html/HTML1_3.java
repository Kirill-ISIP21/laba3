package laba10.html;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTML1_3 {
    public static void main(String[] args) {
        // URL для загрузки веб-страницы
        String websiteUrl = "https://itlearn.ru/first-step";

        // Попытка загрузить веб-страницу
        try {
            URL url = new URL(websiteUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();

            // Проверка статуса ответа
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Загрузка страницы прошла успешно. Начинаем парсинг HTML...");
                // Здесь можно добавить код для парсинга HTML
            } else {
                System.out.println("Ошибка загрузки страницы. Код ответа: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке страницы: " + e.getMessage());
        }
    }
}

