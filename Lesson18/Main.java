package Lesson18;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Main {
    public static void main(String[] args) {
        try {

            File sourceFile = new File("D:\\IT\\LocalRepo\\Lesson18\\file.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(sourceFile);
            doc.getDocumentElement().normalize();

            String tagName = "line";
            List<String> lines = new ArrayList<>();

            NodeList nodeList = doc.getElementsByTagName(tagName);
            for (int i = 0; i < nodeList.getLength(); i++) {
                lines.add(nodeList.toString());
            }

            Document newDoc = dBuilder.newDocument();

            /*for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                Element copy = (Element) newDoc.importNode(element, true);
                newDoc.appendChild(copy);
            }*/

            File outputFile = new File("newDoc.xml");
            FileWriter writer = new FileWriter(outputFile);


            for (int i = 0; i < nodeList.getLength(); i++)
   //             writer.write();

            System.out.println("Tag '" + tagName + "' has been successfully written to 'newDoc.xml'.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
