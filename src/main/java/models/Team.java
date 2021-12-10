package models;

import interfaces.Activity;

import java.util.Arrays;


public class Team {
    private String Name;
    protected final Activity[] teamMembers;


    public Team(String Name, Activity[] teamMembers) {
        this.Name = Name;
        this.teamMembers = teamMembers;
    }

    public String getName() {
        return Name;
    }

    public Activity[] getTeamMembers() {
        return teamMembers;
    }

    @Override
    public String toString() {
        return "Команда: '" + Name + '\'' +
                ". Участники команды: " + Arrays.toString(teamMembers);
    }



}



