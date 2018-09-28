package com.tutorial.projects.xml.parsers;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class XmlParserDom {
    private static void printNote(NodeList nodeList) {

        for (int count = 0; count < nodeList.getLength(); count++) {
            Node tempNode = nodeList.item(count);

            //check for node

            if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

                //get node and value

                System.out.println("\nNode name = " + tempNode.getNodeName() + " [OPEN]");
                System.out.println("Node value = " + tempNode.getTextContent());

                if (tempNode.hasAttributes()) {

                    //get attributes names and values

                    NamedNodeMap nodeMap = tempNode.getAttributes();
                    for (int i = 0; i < nodeMap.getLength(); i++) {
                        Node node = nodeMap.item(i);
                        System.out.println("Attribute name = " + node.getNodeName());
                        System.out.println("Attribute value = " + node.getNodeValue());
                    }
                }
                if (tempNode.hasChildNodes()) {

                    //searching for nodes
                    printNote(tempNode.getChildNodes());
                }
                System.out.println("Node name = " + tempNode.getNodeName() + " [ CLOSE]");
            }
        }
    }

    public static void main(String[] args) {

        try {
            File xmlFile = new File(
                    "D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\xml\\Tariffs.xml");

//String line = reader.readLine();
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            if (doc.hasChildNodes()) {
                printNote(doc.getChildNodes());
            }
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (SAXException se) {
            se.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
