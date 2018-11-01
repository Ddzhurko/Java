package com.tutorial.projects.xml.parsers.xmlparser;


import com.tutorial.projects.xml.Tariff;
import com.tutorial.projects.xml.parsers.MyHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlParsersSax {

    public static void main(String[] args) {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {

            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandler handler = new MyHandler();
            saxParser.parse(new File("D:/JavaProjects/GitHub/Java/src/com/tutorial/projects/xml/Tariffs.xml"), handler);

            //get Tariffs list
            List<Tariff> tariffList = handler.getTariffList();

            //print tariff information
            for (Tariff tariff : tariffList)
                System.out.println(tariff);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}