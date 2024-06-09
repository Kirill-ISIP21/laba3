package laba10.xml;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

// Удаление книги из XML-документа по названию

public class XML1_4 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/laba10/xml/XML1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги для удаления: ");
            String bookTitleToDelete = scanner.nextLine();

            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String title = element.getElementsByTagName("title").item(0).getTextContent();
                    if (title.equalsIgnoreCase(bookTitleToDelete)) {
                        node.getParentNode().removeChild(node);
                        System.out.println("Книга удалена из библиотеки.");
                    }
                }
            }

            // Сохранение изменений в XML-документе
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/laba10/xml/XML1.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

