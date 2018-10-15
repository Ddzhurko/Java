package com.tutorial.projects.patterns.adaptors;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
