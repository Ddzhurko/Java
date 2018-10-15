package com.tutorial.projects.patterns.adaptors;

public class Demo {

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {

        switch (i) {
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            case 120:
                return socketAdapter.get120Volt();
            default:
                return socketAdapter.get120Volt();
        }
    }

    public static void testClassAdapter() {

        SocketAdapter socketAdapter = new SocketClassAdapter();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v3 volts adapter using Class Adapter = " + v3.getVolts());
        System.out.println("v12 volts adapter using Class Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter = " + v120.getVolts());
    }

    public static void testObjectAdapter() {

        SocketAdapter socketAdapter = new SocketObjectAdapter();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println("v3 volts adapter using Object Adapter = " + v3.getVolts());
        System.out.println("v12 volts adapter using Object Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Object Adapter = " + v120.getVolts());
    }

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }
}
