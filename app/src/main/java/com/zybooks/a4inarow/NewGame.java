package com.zybooks.a4inarow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewGame extends AppCompatActivity {
    public static final int GRID_SIZE = 7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
    }
}