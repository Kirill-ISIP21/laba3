package laba10.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.util.List;

public class XML1_3 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/laba10/xml/XML1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите критерий поиска: ");
            String searchCriteria = scanner.nextLine();

            NodeList nodeList = doc.getElementsByTagName("book");

            // Сохраняем элементы, соответствующие критерию поиска
            List<Element> books = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String author = element.getElementsByTagName("author").item(0).getTextContent();
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    if (author.equalsIgnoreCase(searchCriteria) || year.equals(searchCriteria)) {
                        books.add(element);
                    }
                }
            }

            // Выводим информацию о найденных книгах
            for (Element book : books) {
                System.out.println("\nНазвание книги: " + book.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Год издания: " + book.getElementsByTagName("year").item(0).getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

