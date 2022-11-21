package com.zybooks.a4inarow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private NewGame mGame; // establish mGame variable
        private Button button; // establish first button





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewGame();
            }
        });
    }


    public void openNewGame() {
        Intent intent = new Intent(this, NewGame.class);
        startActivity(intent);
        // code to open 2nd activity
    }





}
