package com.codecool;

public class MercedesPlus extends Car implements MercedesPlusRep, MercedesRepository{

    public MercedesPlus(String name, int hp, int speed) {
        super(name, hp, speed);
    }

    public MercedesPlus(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void gradualBrake() {

    }

    @Override
    public void startTurbo() {

    }

    @Override
    public void superBrake() {

    }
}
