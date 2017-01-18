package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by opreston on 1/17/17.
 */

public abstract class CurrentMood {
    private Date date;
    private String mood;

    public abstract String returnMood();

    public Date getDate() {
        return date;
    }

    public void setMood(String mood){
        this.mood = mood;
    }

    public String getMood(String mood){
        return mood;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CurrentMood(Date date){
        this.date = date;
    }
    public CurrentMood(){
        this.date = new Date();
    }

}
