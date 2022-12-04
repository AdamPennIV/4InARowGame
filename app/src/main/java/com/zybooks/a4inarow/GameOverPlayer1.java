package com.zybooks.a4inarow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GameOverPlayer1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover_player1);

        Button button = (Button) findViewById(R.id.playAgain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAgain();
            }
        });
    }
    public void playAgain() {
        Intent intent = new Intent(this, NewGame.class);
        startActivity(intent);
    }
}