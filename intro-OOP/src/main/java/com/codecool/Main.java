package com.codecool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Mercedes myCar = new Mercedes ("Mercedes Benz", 360, 150, "luxury");
        System.out.println(myCar.getName());
        Tesla myTesla = new Tesla("Tesla", 500, 450, "ai");
        myCar.accelerate();
        myTesla.accelerate();
        Dacia dacia = new Dacia("1310", 120, "handle");
        Driver me = new Driver (myTesla, "Silvia");
        me.moveCar("Bucharest");
        System.out.println(myTesla.getLocation());
        MercedesRepository car = new Mercedes ("Benz", 48, 22, "super");
        System.out.println(car);
    }
}