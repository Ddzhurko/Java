package com.tutorial.projects.xml.parsers;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class XmlParserDom {
    public static void main(String[] args) {

        try {
            File xmlFile = new File(
                    "D:\\JavaProjects\\GitHub\\OOP\\src\\com\\tutorial\\projects\\xml\\Tariffs.xml");

//String line = reader.readLine();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
//    InputSource is = new InputSource(new StringReader(line));
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("name");
            System.out.println("-------------------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent element " + nNode.getNodeName() + ": " + nNode.getNodeValue());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("name: " + eElement.getAttribute("name"));
                    System.out.println("payroll: " + eElement.getElementsByTagName("payroll").item(0).getTextContent());

                    System.out.println();

                }
            }
//            NodeList nList = document.getElementsByTagName("tariff");
//            Node namedItem = nList.item(0).getAttributes().getNamedItem("operatorname");
//            System.out.println(namedItem.getNodeValue());
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (SAXException se) {
            se.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
