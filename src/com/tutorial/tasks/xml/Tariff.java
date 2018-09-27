package com.tutorial.tasks.xml;

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

    Tariff(String name, String operatorName, int payroll, int callInPrices,
           int callOutPrices, int callStatPrices, int smsPrice, int favoriteQuantities,
           int favoriteTariffs, int favoritePrices) {
        this.name = name;
        this.operatorName = operatorName;
        this.payroll = payroll;
        this.callInPrices = callInPrices;
        this.callOutPrices = callOutPrices;
        this.callStatPrices = callStatPrices;
        this.smsPrice = smsPrice;
        this.favoriteQuantities = favoriteQuantities;
        this.favoritePrices = favoritePrices;
        this.favoriteTariffs = favoriteTariffs;

    }

    @Override
    public String toString() {
        return "\nTariff " + name + " for operator " + operatorName + " abonplata " +
                payroll + "." + "\nIncome calls cost " + callInPrices + ", " +
                "outcome calls cost " + callOutPrices + ", calls to stationary cost "
                + callStatPrices + ". \n Favourite numbers will be " + favoriteQuantities
                + "tariffication from " + favoriteTariffs + " seconds"
                + " cost of service is " + favoritePrices + ".";
    }
}
