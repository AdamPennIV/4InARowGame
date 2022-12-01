package com.zybooks.a4inarow;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class NewGame extends AppCompatActivity {
    private int gameTurn = 1;
    private int p1Color;
    private int p2Color;
    private Button button1, button2, button3, button4, button5, button6;
    private Button button7, button8, button9, button10, button11, button12;
    private Button button13, button14, button15, button16, button17, button18;
    private Button button19, button20, button21, button22, button23, button24;
    private Button button25, button26, button27, button28, button29, button30;
    private Button button31, button32, button33, button34, button35, button36;
    private Button button37, button38, button39, button40, button41, button42;
    private boolean one1isClicked, one2isClicked, one3isClicked, one4isClicked, one5isClicked, one6isClicked;
    private boolean two1isClicked, two2isClicked, two3isClicked, two4isClicked, two5isClicked, two6isClicked;
    private boolean three1isClicked, three2isClicked, three3isClicked, three4isClicked, three5isClicked, three6isClicked;
    private boolean four1isClicked, four2isClicked, four3isClicked, four4isClicked, four5isClicked, four6isClicked;
    private boolean five1isClicked, five2isClicked, five3isClicked, five4isClicked, five5isClicked, five6isClicked;
    private boolean six1isClicked, six2isClicked, six3isClicked, six4isClicked, six5isClicked, six6isClicked;
    private boolean seven1isClicked, seven2isClicked, seven3isClicked, seven4isClicked, seven5isClicked, seven6isClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        p1Color = ContextCompat.getColor(this, R.color.red);
        p2Color = ContextCompat.getColor(this, R.color.blue);
        gameClick();


    }




    /*@Override
    public void onClick(View view) {

        Button one1 = (Button) findViewById(R.id.one1);
        one1.setOnClickListener(new View.OnClickListener());

        switch (view.getId()) {
            case R.id.one1:
                one1.setBackgroundColor(p1Color);
                break;
        }

    }

    public void gameClick(View view) {

        Button[] buttons = new Button[6];
        buttons[0] = (Button) findViewById(R.id.one1);
        buttons[1] = (Button) findViewById(R.id.one2);
        buttons[2] = (Button) findViewById(R.id.one3);
        buttons[3] = (Button) findViewById(R.id.one4);
        buttons[4] = (Button) findViewById(R.id.one5);
        buttons[5] = (Button) findViewById(R.id.one6);

        int[] ids = new int[6];
        ids[0] = R.id.one1;
        ids[1] = R.id.one2;
        ids[2] = R.id.one3;
        ids[3] = R.id.one4;
        ids[4] = R.id.one5;
        ids[5] = R.id.one6;

        String[] buttonName = new String[6];
        buttonName[0] = "button1";
        buttonName[1] = "button2";
        buttonName[2] = "button3";
        buttonName[3] = "button4";
        buttonName[4] = "button5";
        buttonName[5] = "button6";


        for (int i = -1; i < buttons.length; i++) {
            for (int j = -1; j < buttons.length; j++) {
                for (int k = -1; k < buttons.length; k++) {
                    buttonName[k] = String.valueOf((Button) findViewById(ids[0]));
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (gameTurn % 2 != 0 && !isClicked) {
                                button1.setBackgroundColor(p1Color);
                                isClicked = true;
                                gameTurn++;

                            } else if (gameTurn % 2 == 0 && !isClicked) {
                                button1.setBackgroundColor(p2Color);
                                isClicked = true;
                                gameTurn++;

                            }
                        }

                    });
                }
            }
        }
    }
} */

    public void gameClick() {




        button1 = findViewById(R.id.one1);
        button1.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !one1isClicked)  {
                button1.setBackgroundColor(p1Color);
                one1isClicked = true;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !one1isClicked) {
                button1.setBackgroundColor(p2Color);
                one1isClicked = true;
                gameTurn++;

            }

        });

        button2 = findViewById(R.id.one2);
        button2.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one2isClicked) && one1isClicked) {
                button2.setBackgroundColor(p1Color);
                one2isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one2isClicked) && one1isClicked){
                button2.setBackgroundColor(p2Color);
                one2isClicked = true;
                gameTurn++;

            }

        });

        button3 = findViewById(R.id.one3);
        button3.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one3isClicked) && one2isClicked) {
                button3.setBackgroundColor(p1Color);
                one3isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one3isClicked) && one2isClicked) {
                button3.setBackgroundColor(p2Color);
                one3isClicked = true;
                gameTurn++;

            }

        });

        button4 = findViewById(R.id.one4);
        button4.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one4isClicked) && one3isClicked){
                button4.setBackgroundColor(p1Color);
                one4isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one4isClicked) && one3isClicked) {
                button4.setBackgroundColor(p2Color);
                one4isClicked = true;
                gameTurn++;

            }

        });

        button5 = findViewById(R.id.one5);
        button5.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one5isClicked) && one4isClicked) {
                button5.setBackgroundColor(p1Color);
                one5isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one5isClicked) && one4isClicked) {
                button5.setBackgroundColor(p2Color);
                one5isClicked = true;
                gameTurn++;

            }

        });

        button6 = findViewById(R.id.one6);
        button6.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one6isClicked) && one5isClicked) {
                button6.setBackgroundColor(p1Color);
                one6isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one6isClicked) && one5isClicked) {
                button6.setBackgroundColor(p2Color);
                one6isClicked = true;
                gameTurn++;

            }

        });

        button7 = findViewById(R.id.two1);
        button7.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !two1isClicked) {
                button7.setBackgroundColor(p1Color);
                two1isClicked = true;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !two1isClicked) {
                button7.setBackgroundColor(p2Color);
                two1isClicked = true;
                gameTurn++;

            }

        });

        button8 = findViewById(R.id.two2);
        button8.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two2isClicked) && two1isClicked) {
                button8.setBackgroundColor(p1Color);
                two2isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two2isClicked) && two1isClicked) {
                button8.setBackgroundColor(p2Color);
                two2isClicked = true;
                gameTurn++;

            }

        });

        button9 = findViewById(R.id.two3);
        button9.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two3isClicked) && two2isClicked) {
                button9.setBackgroundColor(p1Color);
                two3isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two3isClicked) && two2isClicked) {
                button9.setBackgroundColor(p2Color);
                two3isClicked = true;
                gameTurn++;

            }

        });

        button10 = findViewById(R.id.two4);
        button10.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two4isClicked) && two3isClicked) {
                button10.setBackgroundColor(p1Color);
                two4isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two4isClicked) && two3isClicked) {
                button10.setBackgroundColor(p2Color);
                two4isClicked = true;
                gameTurn++;

            }

        });

        button11 = findViewById(R.id.two5);
        button11.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two5isClicked) && two4isClicked) {
                button11.setBackgroundColor(p1Color);
                two5isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two5isClicked) && two4isClicked) {
                button11.setBackgroundColor(p2Color);
                two5isClicked = true;
                gameTurn++;

            }

        });

        button12 = findViewById(R.id.two6);
        button12.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two6isClicked) && two5isClicked) {
                button12.setBackgroundColor(p1Color);
                two6isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two6isClicked) && two5isClicked) {
                button12.setBackgroundColor(p2Color);
                two6isClicked = true;
                gameTurn++;

            }

        });

        button13 = findViewById(R.id.three1);
        button13.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !three1isClicked)  {
                button13.setBackgroundColor(p1Color);
                three1isClicked = true;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !three1isClicked) {
                button13.setBackgroundColor(p2Color);
                three1isClicked = true;
                gameTurn++;

            }

        });

        button14 = findViewById(R.id.three2);
        button14.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three2isClicked) && three1isClicked) {
                button14.setBackgroundColor(p1Color);
                three2isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three2isClicked) && three1isClicked) {
                button14.setBackgroundColor(p2Color);
                three2isClicked = true;
                gameTurn++;

            }

        });

        button15 = findViewById(R.id.three3);
        button15.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three3isClicked) && three2isClicked) {
                button15.setBackgroundColor(p1Color);
                three3isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three3isClicked) && three2isClicked) {
                button15.setBackgroundColor(p2Color);
                three3isClicked = true;
                gameTurn++;

            }

        });

        button16 = findViewById(R.id.three4);
        button16.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three4isClicked) && three3isClicked) {
                button16.setBackgroundColor(p1Color);
                three4isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three4isClicked) && three3isClicked) {
                button16.setBackgroundColor(p2Color);
                three4isClicked = true;
                gameTurn++;

            }

        });

        button17 = findViewById(R.id.three5);
        button17.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three5isClicked) && three4isClicked) {
                button17.setBackgroundColor(p1Color);
                three5isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three5isClicked) && three4isClicked) {
                button17.setBackgroundColor(p2Color);
                three5isClicked = true;
                gameTurn++;

            }

        });

        button18 = findViewById(R.id.three6);
        button18.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three6isClicked) && three5isClicked) {
                button18.setBackgroundColor(p1Color);
                three6isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three6isClicked) && three5isClicked) {
                button18.setBackgroundColor(p2Color);
                three6isClicked = true;
                gameTurn++;

            }

        });

        button19 = findViewById(R.id.four1);
        button19.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !four1isClicked) {
                button19.setBackgroundColor(p1Color);
                four1isClicked = true;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !four1isClicked) {
                button19.setBackgroundColor(p2Color);
                four1isClicked = true;
                gameTurn++;

            }

        });

        button20 = findViewById(R.id.four2);
        button20.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four2isClicked) && four1isClicked) {
                button20.setBackgroundColor(p1Color);
                four2isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four2isClicked) && four1isClicked) {
                button20.setBackgroundColor(p2Color);
                four2isClicked = true;
                gameTurn++;

            }

        });

        button21 = findViewById(R.id.four3);
        button21.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four3isClicked) && four2isClicked) {
                button21.setBackgroundColor(p1Color);
                four3isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four3isClicked) && four2isClicked) {
                button21.setBackgroundColor(p2Color);
                four3isClicked = true;
                gameTurn++;

            }

        });

        button22 = findViewById(R.id.four4);
        button22.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four4isClicked) && four3isClicked) {
                button22.setBackgroundColor(p1Color);
                four4isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four4isClicked) && four3isClicked) {
                button22.setBackgroundColor(p2Color);
                four4isClicked = true;
                gameTurn++;

            }

        });

        button23 = findViewById(R.id.four5);
        button23.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four5isClicked) && four4isClicked) {
                button23.setBackgroundColor(p1Color);
                four5isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four5isClicked) && four4isClicked) {
                button23.setBackgroundColor(p2Color);
                four5isClicked = true;
                gameTurn++;

            }

        });

        button24 = findViewById(R.id.four6);
        button24.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four6isClicked) && four5isClicked) {
                button24.setBackgroundColor(p1Color);
                four6isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four6isClicked) && four5isClicked) {
                button24.setBackgroundColor(p2Color);
                four6isClicked = true;
                gameTurn++;

            }

        });

        button25 = findViewById(R.id.five1);
        button25.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !five1isClicked){
                button25.setBackgroundColor(p1Color);
                five1isClicked = true;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !five1isClicked)  {
                button25.setBackgroundColor(p2Color);
                five1isClicked = true;
                gameTurn++;

            }

        });

        button26 = findViewById(R.id.five2);
        button26.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five2isClicked) && five1isClicked){
                button26.setBackgroundColor(p1Color);
                five2isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five2isClicked) && five1isClicked) {
                button26.setBackgroundColor(p2Color);
                five2isClicked = true;
                gameTurn++;

            }

        });

        button27 = findViewById(R.id.five3);
        button27.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five3isClicked) && five2isClicked){
                button27.setBackgroundColor(p1Color);
                five3isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five3isClicked) && five2isClicked) {
                button27.setBackgroundColor(p2Color);
                five3isClicked = true;
                gameTurn++;

            }

        });

        button28 = findViewById(R.id.five4);
        button28.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five4isClicked) && five3isClicked){
                button28.setBackgroundColor(p1Color);
                five4isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five4isClicked) && five3isClicked) {
                button28.setBackgroundColor(p2Color);
                five4isClicked = true;
                gameTurn++;

            }

        });

        button29 = findViewById(R.id.five5);
        button29.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five5isClicked) && five4isClicked){
                button29.setBackgroundColor(p1Color);
                five5isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five5isClicked) && five4isClicked) {
                button29.setBackgroundColor(p2Color);
                five5isClicked = true;
                gameTurn++;

            }

        });

        button30 = findViewById(R.id.five6);
        button30.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five6isClicked) && five5isClicked){
                button30.setBackgroundColor(p1Color);
                five6isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five6isClicked) && five5isClicked) {
                button30.setBackgroundColor(p2Color);
                five6isClicked = true;
                gameTurn++;

            }

        });

        button31 = findViewById(R.id.six1);
        button31.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !six1isClicked) {
                button31.setBackgroundColor(p1Color);
                six1isClicked = true;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !six1isClicked) {
                button31.setBackgroundColor(p2Color);
                six1isClicked = true;
                gameTurn++;

            }

        });

        button32 = findViewById(R.id.six2);
        button32.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six2isClicked) && six1isClicked){
                button32.setBackgroundColor(p1Color);
                six2isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six2isClicked) && six1isClicked) {
                button32.setBackgroundColor(p2Color);
                six2isClicked = true;
                gameTurn++;

            }

        });

        button33 = findViewById(R.id.six3);
        button33.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six3isClicked) && six2isClicked){
                button33.setBackgroundColor(p1Color);
                six3isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six3isClicked) && six2isClicked) {
                button33.setBackgroundColor(p2Color);
                six3isClicked = true;
                gameTurn++;

            }

        });

        button34 = findViewById(R.id.six4);
        button34.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six4isClicked) && six3isClicked){
                button34.setBackgroundColor(p1Color);
                six4isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six4isClicked) && six3isClicked) {
                button34.setBackgroundColor(p2Color);
                six4isClicked = true;
                gameTurn++;

            }

        });

        button35 = findViewById(R.id.six5);
        button35.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six5isClicked) && six4isClicked){
                button35.setBackgroundColor(p1Color);
                six5isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six5isClicked) && six4isClicked) {
                button35.setBackgroundColor(p2Color);
                six5isClicked = true;
                gameTurn++;

            }

        });

        button36 = findViewById(R.id.six6);
        button36.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six6isClicked) && six5isClicked){
                button36.setBackgroundColor(p1Color);
                six6isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six6isClicked) && six5isClicked) {
                button36.setBackgroundColor(p2Color);
                six6isClicked = true;
                gameTurn++;

            }

        });

        button37 = findViewById(R.id.seven1);
        button37.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !seven1isClicked) {
                button37.setBackgroundColor(p1Color);
                seven1isClicked = true;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !seven1isClicked) {
                button37.setBackgroundColor(p2Color);
                seven1isClicked = true;
                gameTurn++;

            }

        });

        button38 = findViewById(R.id.seven2);
        button38.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven2isClicked) && seven1isClicked){
                button38.setBackgroundColor(p1Color);
                seven2isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven2isClicked) && seven1isClicked) {
                button38.setBackgroundColor(p2Color);
                seven2isClicked = true;
                gameTurn++;

            }

        });

        button39 = findViewById(R.id.seven3);
        button39.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven3isClicked) && seven2isClicked){
                button39.setBackgroundColor(p1Color);
                seven3isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven3isClicked) && seven2isClicked) {
                button39.setBackgroundColor(p2Color);
                seven3isClicked = true;
                gameTurn++;

            }

        });

        button40 = findViewById(R.id.seven4);
        button40.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven4isClicked) && seven3isClicked){
                button40.setBackgroundColor(p1Color);
                seven4isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven4isClicked) && seven3isClicked) {
                button40.setBackgroundColor(p2Color);
                seven4isClicked = true;
                gameTurn++;

            }

        });

        button41 = findViewById(R.id.seven5);
        button41.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven5isClicked) && seven4isClicked){
                button41.setBackgroundColor(p1Color);
                seven5isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven5isClicked) && seven4isClicked) {
                button41.setBackgroundColor(p2Color);
                seven5isClicked = true;
                gameTurn++;

            }

        });

        button42 = findViewById(R.id.seven6);
        button42.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven6isClicked) && seven5isClicked){
                button42.setBackgroundColor(p1Color);
                seven6isClicked = true;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven6isClicked) && seven5isClicked) {
                button42.setBackgroundColor(p2Color);
                seven6isClicked = true;
                gameTurn++;

            }

        });
    }
}

