package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by opreston on 1/17/17.
 */

public class importantTweet extends Tweet {
    public importantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    public importantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    @Override
    public String getMessage(){
        return super.getMessage() + " !!!!";
    }
}
