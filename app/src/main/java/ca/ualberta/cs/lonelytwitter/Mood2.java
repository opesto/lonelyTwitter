package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by opreston on 1/17/17.
 */

public class Mood2 extends CurrentMood {
    private String mood = "sad";

    public Mood2(Date date) {
        super(date);
        this.setMood(mood);
    }

    public Mood2() {
        this.setMood(mood);
    }

    public String returnMood(){
        return new String(this.getMood(mood) + ":(");
    }
}
