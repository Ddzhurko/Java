package com.tutorial.tasks.xml.parsers;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParserDom {
    public static void main(String[] args) {
        File file = new File("D:\\JavaProjects\\labs\\src\\com\\tutorial\\tasks\\task12","Tariffs.xml");
try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(file);
    Element root = document.getDocumentElement();
    Element message = (Element) root.getElementsByTagName("message").item(0);
//    String textContent = message.getTextContent();
//    System.out.println(textContent);
    System.out.println(document);
    }
    catch (ParserConfigurationException pce){
    pce.printStackTrace();
    }
    catch (SAXException se){
    se.printStackTrace();
    }
    catch (IOException io){
    io.printStackTrace();
    }
    }

}
