package com.example.andriod.task_1_sprint;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class PriceActivity extends AppCompatActivity {

    private TextSwitcher textSwitcher;
    private Button nextButton;
    private int stringIndex = 0;
    private String[] row = {"Fixed", "Auction"};
    private TextView textView;

    public void FindActivity(View view) {
        Intent intent = new Intent(this, FindActivity.class);
        startActivity(intent);
    }
    public void PickActivity(View view) {
        Intent intent = new Intent(this, PickActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        textSwitcher = findViewById(R.id.TextSwitcher);
        nextButton = findViewById(R.id.listType);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stringIndex == row.length - 1) {
                    stringIndex = 0;
                    textSwitcher.setText(row[stringIndex]);
                } else {
                    textSwitcher.setText(row[++stringIndex]);
                }
            }
        });

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                textView = new TextView(PriceActivity.this);
                textView.setTextColor(Color.BLACK);
                textView.setTextSize(60);
                textView.setGravity(Gravity.CENTER_HORIZONTAL);
                return textView;
            }
        });

        textSwitcher.setText(row[stringIndex]);
    }
}
