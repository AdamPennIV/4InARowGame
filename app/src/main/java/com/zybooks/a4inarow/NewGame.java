package com.zybooks.a4inarow;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.Random;

public class NewGame extends AppCompatActivity {
    public static final int GRID_SIZE = 7;
    private GridLayout mConnectGrid;
    private int gameTurn = 1;
    private Button button1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);


    }

    public void newGame() {

    }

    public void gameClick(View view) {
        if (gameTurn == 1){


            button1 = (Button) findViewById(R.id.one1);
            button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    button1.setBackgroundColor(Color.RED);
                    gameTurn++;

                }
            });

         } else if (gameTurn % 2 ==0) {
            button1.setBackgroundColor(Color.BLUE);
        }
    }
}
