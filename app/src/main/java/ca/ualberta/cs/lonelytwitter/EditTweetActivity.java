package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        String tweetString = intent.getStringExtra("tweet");
        TextView myTweetTextView = (TextView)findViewById(R.id.textView);
        myTweetTextView.setText(tweetString);
    }



}
