package com.company.structural.adapter.example_2;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
