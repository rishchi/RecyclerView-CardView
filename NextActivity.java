package com.example.rishabh.lastone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity {
    private RecyclerViewModel pName;


@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_next);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    //getSupportActionBar().setTitle();
 }

@Override
    public void onBackPressed() {
        finish();
    }
}