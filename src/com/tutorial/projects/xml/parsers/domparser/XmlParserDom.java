package com.tutorial.projects.xml.parsers.domparser;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class XmlParserDom {
    public static void main(String[] args) {

        try {
            File xmlFile = new File(
                    "D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\xml\\Tariffs.xml"
            );

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

    private static void printNote(NodeList nodeList) {
        for (int count = 0; count < nodeList.getLength(); count++) {
            Node currentNode = nodeList.item(count);

            //check for node
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {

                //get node and value

                System.out.println("\nNode name = " + currentNode.getNodeName() + " [OPEN]");
                System.out.println("Node value = " + currentNode.getTextContent());

                if (currentNode.hasAttributes()) {

//                    get attributes names and values

                    NamedNodeMap nodeMap = currentNode.getAttributes();
                    for (int i = 0; i < nodeMap.getLength(); i++) {
                        Node node = nodeMap.item(i);
                        System.out.println("Attribute name = " + node.getNodeName());
                        System.out.println("Attribute value = " + node.getNodeValue());
                    }
                }
                if (currentNode.hasChildNodes()) {

                    //searching for nodes
                    printNote(currentNode.getChildNodes());
                }
                System.out.println("Node name = " + currentNode.getNodeName() + " [CLOSE]");
            }
        }
    }

}
