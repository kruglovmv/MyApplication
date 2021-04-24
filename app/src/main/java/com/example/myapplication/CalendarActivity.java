package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalendarActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calendar);
    }

    public void back(View view) {
        Intent intent = new Intent(CalendarActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
