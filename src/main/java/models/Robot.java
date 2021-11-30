package models;

import interfaces.Activity;

public class Robot implements Activity {

    private String name;
    protected int runway;
    protected int jumpway;

    public Robot(String name, int runway, int jumpway) {
        this.name = name;
        this.runway = runway;
        this.jumpway = jumpway;
    }


    @Override
    public String toString() {
        return "Робот: " + name + ' ' +
                ", (бег " + runway +
                ", прыжок " + jumpway + ")";
    }

    public void run() {
    }

    public void jump() {
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
}

