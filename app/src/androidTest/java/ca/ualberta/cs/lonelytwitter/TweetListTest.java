package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.Calendar;
import java.util.List;

/**
 * Created by opreston on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){

        super(LonelyTwitterActivity.class);
    }

    public void testAdd(){


        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet1(tweet));

    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet1");
        tweets.addTweet(tweet);

        try {
            tweets.addTweet(tweet);
            assertEquals(tweets.getCount(), 1);
        } catch (IllegalArgumentException e){
            Log.i("Error", "tweet already added");
        }
    }



    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Calendar cal = Calendar.getInstance();

        cal.set(2016, 2, 5);
        Tweet tweet = new NormalTweet("test1");
        tweet.setDate(cal.getTime());

        cal.set(2014,2,5);
        Tweet tweet2 = new NormalTweet("test2");
        tweet2.setDate(cal.getTime());

        cal.set(2010,2,5);
        Tweet tweet3 = new NormalTweet("test3");
        tweet3.setDate(cal.getTime());

        tweets.add(tweet2);
        tweets.add(tweet);
        tweets.add(tweet3);

        List<Tweet> sortedTweets = tweets.getTweets();

        for (int x = 0; x < sortedTweets.size() - 1 ; x++) {
            Tweet first = sortedTweets.get(x);
            Tweet second = sortedTweets.get(x+1);

            assertTrue(first.getDate().compareTo(second.getDate()) < 0);
        }
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet1");
        tweets.add(tweet);
        Tweet tweet2 = new NormalTweet("test tweet2");
        tweets.add(tweet2);
        Tweet tweet3 = new NormalTweet("test tweet3");
        tweets.add(tweet3);
        assertEquals(tweets.getCount(), 3);
    }

    public void testHasTweet2(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        Tweet tweet2 = new NormalTweet("test tweet2");
        tweets.add(tweet);
        tweets.add(tweet);
        assertTrue(tweets.hasTweet2());
        tweets.delete(tweet);
        tweets.delete(tweet);
        tweets.add(tweet2);
        tweets.add(tweet);
        assertFalse(tweets.hasTweet2());
    }

    public void testDeleteTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet1(tweet));
    }

    public void testString(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

}
