package com.company.structural.adapter.example_2;

//Adapter Design Pattern – Object Adapter Implementation
//Here is the Object adapter implementation of our adapter.

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
