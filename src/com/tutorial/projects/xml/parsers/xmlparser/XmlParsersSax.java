package com.tutorial.projects.xml.parsers.xmlparser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class XmlParsersSax {



    public static void main(String[] args) {
        {
            //Locate the file
            File xmlFile = new File("D:\\JavaProjects\\GitHub\\Java\\src\\com\\tutorial\\projects\\xml\\Tariffs.xml");

//            Create the parser instance
//            UsersXmlParser parser = new UsersXmlParser();

            //Parse the file
//            ArrayList users = parser.parseXml(new FileInputStream(xmlFile));

            //Verify the result
//            System.out.println(users);
        }
    }

}