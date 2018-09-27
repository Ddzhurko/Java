package com.tutorial.projects.xml.parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import javax.xml.validation.*;
import java.io.File;


public class XmlParsersSax {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler();

//            @Override
//            public void startElement (
//                    String uri, String localName, String qName, Attributes attributes) throw SAXException{
//if ()
//            }
//
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
    }
}
//    }}