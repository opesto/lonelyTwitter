package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by opreston on 1/17/17.
 *
 * Tweet class is a super class that implements Tweetable
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private ArrayList<CurrentMood> MoodList = new ArrayList<CurrentMood>();

    public Date getDate() {
        return date;
    }
    public void addMood(String mood) {
        if (mood.equals("happy")) {
            this.MoodList.add(new Mood1());
        }
        if (mood.equals("sad")) {
            this.MoodList.add(new Mood2());
        }
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length()> 144){
            throw new TweetTooLongException();
        } else {
            this.message=message;
        }
    }

    public Tweet(Date date, String message) throws TweetTooLongException{
        this.date = date;
        this.setMessage(message);
    }
    public Tweet(String message) throws TweetTooLongException{
        this.setMessage(message);
        this.date = new Date();
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;

    }

}
