package com.example.andriod.task_1_sprint;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PickActivity extends AppCompatActivity {

    public void ListActivity(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
    public void PriceActivity(View view) {
        Intent intent = new Intent(this, PriceActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);
    }
}
