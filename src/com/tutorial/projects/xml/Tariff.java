package com.tutorial.projects.xml;

public class Tariff {
    private int id;
    private String name;
    private String operatorName;
    private int payroll;
    private int callInPrices;
    private int callOutPrices, callStatPrices;
    private int smsPrice;
    private int favoriteQuantities;
    private int favoriteTariffs;
    private int favoritePrices;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public int getPayroll() {
        return payroll;
    }

    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }

    public int getCallInPrices() {
        return callInPrices;
    }

    public void setCallInPrices(int callInPrices) {
        this.callInPrices = callInPrices;
    }

    public int getCallOutPrices() {
        return callOutPrices;
    }

    public void setCallOutPrices(int callOutPrices) {
        this.callOutPrices = callOutPrices;
    }

    public int getCallStatPrices() {
        return callStatPrices;
    }

    public void setCallStatPrices(int callStatPrices) {
        this.callStatPrices = callStatPrices;
    }

    public int getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(int smsPrice) {
        this.smsPrice = smsPrice;
    }

    public int getFavoriteQuantities() {
        return favoriteQuantities;
    }

    public void setFavoriteQuantities(int favoriteQuantities) {
        this.favoriteQuantities = favoriteQuantities;
    }

    public int getFavoriteTariffs() {
        return favoriteTariffs;
    }

    public void setFavoriteTariffs(int favoriteTariffs) {
        this.favoriteTariffs = favoriteTariffs;
    }

    public int getFavoritePrices() {
        return favoritePrices;
    }

    public void setFavoritePrices(int favoritePrices) {
        this.favoritePrices = favoritePrices;
    }

    @Override
    public String toString() {
        return "\nTariff ID = " + this.id + ", name " + this.name + " for operator " + this.operatorName + ", abonplata " +
                this.payroll + "." + "\nIncome calls cost " + this.callInPrices + ", " +
                "outcome calls cost " + this.callOutPrices + ", calls to stationary cost "
                + this.callStatPrices + ". \nFavourite numbers will be " + this.favoriteQuantities
                + ", tariffication from " + this.favoriteTariffs + " seconds"
                + ", cost of service is " + this.favoritePrices + ".";
    }
}
