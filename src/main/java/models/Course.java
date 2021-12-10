package models;


public class Course {
    public Course(Trial[] barriers) {
        this.barriers = barriers;
    }

    private final Trial[] barriers;

    public Trial[] getBarriers() {
        return barriers;
    }
}
