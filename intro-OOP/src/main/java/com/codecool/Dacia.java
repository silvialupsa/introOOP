package com.codecool;

public class Dacia extends Car {
    private String handle;

    public Dacia(String name, int hp, int speed, String handle) {
        super(name, hp, speed);
        this.handle = handle;
    }

    public Dacia(String name, int hp, String handle){
        super(name, hp);
        this.handle = handle;
    }

    public Dacia(String name, int hp, int speed){
        super(name, hp, speed);
        this.handle = "implicit";
    }
}
