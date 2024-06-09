package laba10.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class myFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание нового документа
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Animals");
            doc.appendChild(rootElement);

            // Создание первого элемента "Вид"
            Element form1 = doc.createElement("Form");
            rootElement.appendChild(form1);

            // Создание дочерних элементов для "порода"
            Element breed = doc.createElement("Breed");
            breed.appendChild(doc.createTextNode("Dog"));
            form1.appendChild(breed);
            Element color1 = doc.createElement("Color");
            color1.appendChild(doc.createTextNode("White"));
            form1.appendChild(color1);


            // Создание второго элемента "Вид"
            Element form2 = doc.createElement("Form");
            rootElement.appendChild(form2);

            // Создание дочерних элементов для "порода"
            Element breed2 = doc.createElement("Breed");
            breed2.appendChild(doc.createTextNode("Cat"));
            form2.appendChild(breed2);

            Element color2 = doc.createElement("Color");
            color2.appendChild(doc.createTextNode("Red"));
            form2.appendChild(color2);


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
            StreamResult result = new StreamResult("src/laba10/xml/myFile.xml");
            transformer.transform(source, result);

            System.out.println("XML-документ успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
