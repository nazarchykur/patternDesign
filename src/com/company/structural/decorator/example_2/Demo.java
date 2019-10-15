package com.company.structural.decorator.example_2;

public class Demo {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n**********");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

        //PRINT:

        //Basic car
        // Adding features of Sports Car.
        //**********
        //Basic car
        // Adding features of Luxury Car. Adding features of Sports Car.



    }


}
