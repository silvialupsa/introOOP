package com.codecool;

public class Tesla extends Car{
    private String ai;

    public Tesla(String name, int hp, int speed, String ai) {
        super(name, hp, speed);
        this.ai = ai;
    }

    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 40);
        System.out.println("Current speed is " + getSpeed());
    }
}
