package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by opreston on 1/17/17.
 */

public class Mood1 extends CurrentMood {
    private String mood = "happy";

    public Mood1(Date date) {
        super(date);
        this.setMood(mood);
    }

    public Mood1() {
        this.setMood(mood);
    }

    public String returnMood(){
        return new String(this.getMood(mood) + ":)");
    }
}
