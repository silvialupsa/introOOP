package com.codecool;

public class Mercedes extends Car implements MercedesRepository{
    private String interior;

    public Mercedes(String name, int hp, int speed, String interior) {
        super(name, hp, speed);
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", speed=" + getSpeed() +
                ", location='" + getLocation() + '\'' +
                "interior='" + interior + '\'' +
                '}';
    }

    @Override
    public void startTurbo() {

    }

    @Override
    public void superBrake() {

    }

}
