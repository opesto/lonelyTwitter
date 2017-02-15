package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Calendar;

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
        Tweet tweet2 = new NormalTweet("test tweet1");
        tweets.addTweet(tweet2);
        assertEquals(tweets.getCount(), 1);
    }



    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetTweets(){

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
        tweets.add(tweet);
        Tweet tweet2 = new NormalTweet("test tweet");
        tweets.add(tweet2);
        assertTrue(tweets.hasTweet2());
        tweets.delete(tweet2);
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
