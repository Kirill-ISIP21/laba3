package laba10.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XML1 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание нового документа
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            // Создание первого элемента "book"
            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            // Создание дочерних элементов для "book1"
            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и мир"));
            book1.appendChild(title1);

            Element autor1 = doc.createElement("autor");
            autor1.appendChild(doc.createTextNode("Лев Толстой"));
            book1.appendChild(autor1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);

            // Создание второго элемента "book"
            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            // Создание дочерних элементов для "book2"
            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Создание Советского Союза"));
            book2.appendChild(title2);

            Element autor2 = doc.createElement("autor");
            autor2.appendChild(doc.createTextNode("Ричард Пайпс"));
            book2.appendChild(autor2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1967"));
            book2.appendChild(year2);

            // Настройка документа как самостоятельного
            doc.setXmlStandalone(true);
            doc.normalizeDocument();

            // Трансформация документа в XML
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "YES");
            transformer.setOutputProperty(OutputKeys.INDENT, "YES");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/laba10/xml/XML1.xml");
            transformer.transform(source, result);

            System.out.println("XML-документ успешно создан!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}

