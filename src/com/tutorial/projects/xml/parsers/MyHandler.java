package com.tutorial.projects.xml.parsers;

import com.tutorial.projects.xml.Tariff;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyHandler extends DefaultHandler {

// List to hold Tariffs objects

    private List<Tariff> tariffList = null;
    private Tariff tariff = null;

    //getter

    public List<Tariff> getTariffList() {
        return tariffList;
    }

    boolean bName = false;
    boolean bOperatorName = false;
    boolean bPayroll = false;
    boolean bCallPrices = false;
    boolean bPriceInCell = false;
    boolean bPriseOutCell = false;
    boolean bPriceStationary = false;
    boolean bSmsPrice = false;
    boolean bFavourite = false;
    boolean bFavouriteNumber = false;
    boolean bTariffication = false;
    boolean bPriceForApply = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("tariffs")) {

            //Create new tariff and put it in Map
            String name = attributes.getValue("name");

            //initialize Tariffs object and set name attribute
            tariff = new Tariff();
            tariff.setName(name);

            //initialize list
            if (tariffList == null) {
                tariffList = new ArrayList<>();
            } else if (qName.equalsIgnoreCase("name")) {

                //set boolean variables for fields, will be used in setting Employee variables
                bName = true;
            } else if (qName.equalsIgnoreCase("operatorname")) {
                bOperatorName = true;
            } else if (qName.equalsIgnoreCase("payroll")) {
                bPayroll = true;
            } else if (qName.equalsIgnoreCase("callprices")) {
                bCallPrices = true;
            } else if (qName.equalsIgnoreCase("priceinsell")) {
                bPriceInCell = true;
            } else if (qName.equalsIgnoreCase("priceoutcell")) {
                bPriseOutCell = true;
            } else if (qName.equalsIgnoreCase("pricstationary")) {
                bPriceStationary = true;
            } else if (qName.equalsIgnoreCase("smsprice")) {
                bSmsPrice = true;
            } else if (qName.equalsIgnoreCase("favourite")) {
                bFavourite = true;
            } else if (qName.equalsIgnoreCase("favouritenumber")) {
                bFavouriteNumber = true;
            } else if (qName.equalsIgnoreCase("tariffication")) {
                bTariffication = true;
            } else if (qName.equalsIgnoreCase("priceforapply")) {
                bPriceForApply = true;
            }
        }


    }

    @Override
    public void endElement(String uri, String localName, String qName) {

        if (qName.equalsIgnoreCase("tariffs")) {
            //add Tariff ti list
            tariffList.add(tariff);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (bName) {
//            tariff.setName(new String(ch, start, length));
            System.out.println("Tariff name: " + new String(ch, start, length));
            bName = false;

        } else if (bOperatorName) {
            tariff.setName(new String(ch, start, length));
            bOperatorName = false;
        } else if (bPayroll) {
            tariff.setName(new String(ch, start, length));
            bPayroll = false;
        } else if (bCallPrices) {
            tariff.setName(new String(ch, start, length));
            bCallPrices = false;
        } else if (bPriceInCell) {
            tariff.setName(new String(ch, start, length));
            bPriceInCell = false;
        } else if (bPriseOutCell) {
            tariff.setName(new String(ch, start, length));
            bPriseOutCell = false;
        } else if (bPriceStationary) {
            tariff.setName(new String(ch, start, length));
            bPriceStationary = false;
        } else if (bSmsPrice) {
            tariff.setName(new String(ch, start, length));
            bSmsPrice = false;
        } else if (bFavourite) {
            tariff.setName(new String(ch, start, length));
            bFavourite = false;
        } else if (bFavouriteNumber) {
            tariff.setName(new String(ch, start, length));
            bFavouriteNumber = false;
        } else if (bTariffication) {
            tariff.setName(new String(ch, start, length));
            bTariffication = false;
        } else if (bPriceForApply) {
            tariff.setName(new String(ch, start, length));
            bPriceForApply = false;
        }

    }
}

