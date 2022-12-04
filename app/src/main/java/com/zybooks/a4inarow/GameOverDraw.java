package com.zybooks.a4inarow;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class GameOverDraw extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover_draw);

        Button button = findViewById(R.id.playAgain);
        button.setOnClickListener(view -> playAgain());
        Button button2 = findViewById(R.id.mainMenu);
        button2.setOnClickListener(view -> returnToMainMenu());
    }

    public void playAgain() {
        Intent intent = new Intent(this, NewGame.class);
        startActivity(intent);
    }
    public void returnToMainMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}