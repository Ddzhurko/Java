package com.tutorial.tasks.xml;

public class MobileCompany {

    private int abonplata;
    private String client;

    MobileCompany(int abonplata, String clients){
        this.abonplata = abonplata;
        this.client = clients;
    }

    public int getAbonplata() {
        return abonplata;
    }
    public  String getClients(){
        return client;
    }
    public String toString(){
        return "\nClient: " + client + ", tarif: " + abonplata;
    }
}
