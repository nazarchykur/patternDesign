package com.company.structural.decorator.example_2;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
