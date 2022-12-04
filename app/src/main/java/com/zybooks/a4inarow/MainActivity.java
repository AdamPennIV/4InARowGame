package com.zybooks.a4inarow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //new game listener
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // establish first button
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> openNewGame());

        button = findViewById(R.id.button2);
        button.setOnClickListener(view -> openHelp());

    }


    public void openNewGame() {
        Intent intent = new Intent(this, NewGame.class);
        startActivity(intent);
        // code to open 2nd activity
    }

    public void openHelp(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
        //code to open help page
    }

}