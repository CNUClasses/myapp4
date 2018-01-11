package com.example.keith.myapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity1 extends AppCompatActivity {

    private static final String TAG1 = "tag1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Log.d(TAG1, "onCreate: got here");
    }
}
