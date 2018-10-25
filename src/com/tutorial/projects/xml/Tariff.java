package com.tutorial.projects.xml;

public class Tariff {

    private String name;
    private String operatorName;
    private int payroll;
    private int callInPrices;
    private int callOutPrices, callStatPrices;
    private int smsPrice;
    private int favoriteQuantities, favoriteTariffs, favoritePrices;

    public String getName() {
        return name;
    }

    public int getPayroll() {
        return payroll;
    }

    public int getCallInPrices() {
        return callInPrices;
    }

    public int getCallOutPrices() {
        return callOutPrices;
    }

    public int getCallStatPrices() {
        return callStatPrices;
    }

    public int getSmsPrice() {
        return smsPrice;
    }

    public int getFavoritePrices() {
        return favoritePrices;
    }

    public int getFavoriteQuantities() {
        return favoriteQuantities;
    }

    public int getFavoriteTariffs() {
        return favoriteTariffs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }

    public void setCallInPrices(int callInPrices) {
        this.callInPrices = callInPrices;
    }

    public void setCallOutPrices(int callOutPrices) {
        this.callOutPrices = callOutPrices;
    }

    public void setCallStatPrices(int callStatPrices) {
        this.callStatPrices = callStatPrices;
    }

    public void setSmsPrice(int smsPrice) {
        this.smsPrice = smsPrice;
    }

    public void setFavoriteQuantities(int favoriteQuantities) {
        this.favoriteQuantities = favoriteQuantities;
    }

    public void setFavoriteTariffs(int favoriteTariffs) {
        this.favoriteTariffs = favoriteTariffs;
    }

    public void setFavoritePrices(int favoritePrices) {
        this.favoritePrices = favoritePrices;
    }
    //    Tariff(String name, String operatorName, int payroll, int callInPrices,
//           int callOutPrices, int callStatPrices, int smsPrice, int favoriteQuantities,
//           int favoriteTariffs, int favoritePrices) {
//        this.name = name;
//        this.operatorName = operatorName;
//        this.payroll = payroll;
//        this.callInPrices = callInPrices;
//        this.callOutPrices = callOutPrices;
//        this.callStatPrices = callStatPrices;
//        this.smsPrice = smsPrice;
//        this.favoriteQuantities = favoriteQuantities;
//        this.favoritePrices = favoritePrices;
//        this.favoriteTariffs = favoriteTariffs;
//
//    }

    @Override
    public String toString() {
        return "\nTariff " + name + " for operator " + operatorName + ", abonplata " +
                payroll + "." + "\nIncome calls cost " + callInPrices + ", " +
                "outcome calls cost " + callOutPrices + ", calls to stationary cost "
                + callStatPrices + ". \nFavourite numbers will be " + favoriteQuantities
                + ", tariffication from " + favoriteTariffs + " seconds"
                + ", cost of service is " + favoritePrices + ".";
    }
}
