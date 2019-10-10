package com.company.creational.abstract_method.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("created Mac OS Button");
    }
}
