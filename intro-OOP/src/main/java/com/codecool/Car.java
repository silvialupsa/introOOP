package com.codecool;

public abstract class Car {

    private String name;
    private int hp;
    private int speed;
    private String location;

    public Car(String name, int hp, int speed) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.location = "home";
    }

    public Car(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.speed = 0;
    }

    public void accelerate (){
        speed+= 10;
        System.out.println("Current speed is " + speed);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", speed=" + speed +
                ", location='" + location + '\'' +
                '}';
    }
}
