package com.example.yanvydra.backendhw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ArtistArrayLoader().execute(MainActivity.this);
        //new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Jan Wydra"));
    }
}
