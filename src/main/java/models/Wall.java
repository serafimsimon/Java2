package models;

import interfaces.Activity;

public class Wall extends Trial {
    protected int Wallsize;


    public Wall(int Wallsize) {
        this.Wallsize = Wallsize;
    }

    public int getWallsize() {
        return Wallsize;
    }

    public void doJumping(Activity jumping) {
        System.out.println("Участник перепрыгнул через стену");

    }
}


