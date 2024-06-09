package laba10.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.Scanner;

// Создание XML-документа с книгами в библиотеке
public class XML1_2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание нового документа
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            // Добавление книг в библиотеку
            addBook(doc, "Война и мир", "Лев Толстой", "1869");
            addBook(doc, "Создание Советского Союза", "Ричард Пайпс", "1967");

            // Добавление книги по введенным данным пользователя
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги:");
            String newTitle = scanner.nextLine();
            System.out.println("Введите автора книги:");
            String newAuthor = scanner.nextLine();
            System.out.println("Введите год издания книги:");
            String newYear = scanner.nextLine();
            addBook(doc, newTitle, newAuthor, newYear);

            // Трансформация документа в XML
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "YES");
            transformer.setOutputProperty(OutputKeys.INDENT, "YES");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/laba10/xml/XML1.xml");
            transformer.transform(source, result);

            System.out.println("XML-документ успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для добавления книги в XML-документ
    private static void addBook(Document doc, String title, String author, String year) {
        Element book = doc.createElement("book");
        Element bookTitle = doc.createElement("title");
        bookTitle.appendChild(doc.createTextNode(title));
        book.appendChild(bookTitle);
        Element bookAuthor = doc.createElement("author");
        bookAuthor.appendChild(doc.createTextNode(author));
        book.appendChild(bookAuthor);
        Element bookYear = doc.createElement("year");
        bookYear.appendChild(doc.createTextNode(year));
        book.appendChild(bookYear);
        doc.getDocumentElement().appendChild(book);
    }
}

