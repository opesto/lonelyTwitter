package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by opreston on 2/14/17.
 */

public class TweetList  {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){


        tweets.add(tweet);
    }

    public void addTweet(Tweet tweet){

        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);

    }

    public boolean hasTweet1 (Tweet tweet){

        return tweets.contains(tweet);
    }

    public boolean hasTweet2 (){
        int index1 = 0;
        int index2 = 0;
        while (index1 < tweets.size()){
            while (index2 < tweets.size()){
                if (tweets.get(index1) == tweets.get(index2)){
                    return TRUE;
                }
            }
        }
        return FALSE;
    }

    public void delete(Tweet tweet){

        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){

        return tweets.get(index);
    }

    public static Comparator<Tweet> dateOrdering = new Comparator<Tweet>() {

        public int compare(Tweet t1, Tweet t2) {
            return t1.getDate().compareTo(t2.getDate());
        }};


    public List<Tweet> getTweets(){
        Collections.sort(tweets, dateOrdering);
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }



}
