package laba10.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HTML1 {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-step";
        try {
            if (isOnline()) {
                Document doc = Jsoup.connect(url).get();
                Elements links = doc.select("a[href]");
                for (Element link : links) {
                    System.out.println(link.attr("abs:href"));
                }
            } else {
                System.out.println("Вы не подключены к интернету. Проверьте соединение и попробуйте снова.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isOnline() {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            return inetAddress.equals(InetAddress.getByName("www.google.com")) ? true : false;
        } catch (UnknownHostException e) {
            return false;
        }
    }
}

