package models;

import interfaces.Activity;
import interfaces.Jumping;
import interfaces.Running;

public class Man implements Activity {
    private String name;
    protected int runway;
    protected int jumpway;

    public Man(String name, int runway, int jumpway) {
        this.name = name;
        this.runway = runway;
        this.jumpway = jumpway;

    }

    @Override
    public String toString() {
        return "Человек: " + name + ' ' +
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
