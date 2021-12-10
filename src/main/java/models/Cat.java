package models;

import interfaces.Activity;

public class Cat implements Activity {

    private String name;
    protected int runway;
    protected int jumpway;

    public Cat(String name, int runway, int jumpway) {
        this.name = name;
        this.runway = runway;
        this.jumpway = jumpway;

    }

    @Override
    public String toString() {
        return "Кот: " + name + ' ' +
                ", (бег " + runway +
                ", прыжок " + jumpway + ")";
    }

    public String getName() {
        return name;
    }

    public int getRunway() {
        return runway;
    }

    public int getJumpway() {
        return jumpway;
    }


    public void run() {
    }

    public void jump() {
    }
}
