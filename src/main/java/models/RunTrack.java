package models;

import interfaces.Activity;


public class RunTrack extends Trial {

    protected int RunTracksize;


    public RunTrack(int RunTracksize) {
        this.RunTracksize = RunTracksize;
    }

    public int getRunTracksize() {
        return RunTracksize;
    }

    public void doRunning(Activity running) {
        System.out.println("Участник пробежал дистанцию");

    }
}
