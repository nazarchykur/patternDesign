package com.company.structural.decorator.example_2;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic car");
    }
}