package com.example.andriod.task_1_sprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
final EditText bTitle=(EditText)findViewById(R.id.bTitle);
final Button cID=(Button)findViewById(R.id.conditionID);
final Button ListB=(Button)findViewById(R.id.list); }




public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu1);
        popup.show();
        }
        @Override

        public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.location1:
        Toast.makeText(this, "Wilfred Brown", Toast.LENGTH_SHORT).show();
        return true;
        case R.id.location2:
        Toast.makeText(this, "Library", Toast.LENGTH_SHORT).show();
        return true;
        case R.id.location3:
        Toast.makeText(this, "Student Union", Toast.LENGTH_SHORT).show();
        return true;

default:
        return false;
        }
        }
        }