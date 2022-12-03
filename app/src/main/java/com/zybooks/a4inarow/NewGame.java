package com.zybooks.a4inarow;

import android.content.Intent;
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
    private int button1Player, button2Player, button3Player, button4Player, button5Player, button6Player;
    private int button7Player, button8Player, button9Player, button10Player, button11Player, button12Player;
    private int button13Player, button14Player, button15Player, button16Player, button17Player, button18Player;
    private int button19Player, button20Player, button21Player, button22Player, button23Player, button24Player;
    private int button25Player, button26Player, button27Player, button28Player, button29Player, button30Player;
    private int button31Player, button32Player, button33Player, button34Player, button35Player, button36Player;
    private int button37Player, button38Player, button39Player, button40Player, button41Player, button42Player;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        p1Color = ContextCompat.getColor(this, R.color.red);
        p2Color = ContextCompat.getColor(this, R.color.blue);
        gameClick();




    }


    public void gameClick() {


        button1 = findViewById(R.id.one1);
        button1.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !one1isClicked) {
                button1.setBackgroundColor(p1Color);
                button1Player = 1;
                one1isClicked = true;
                gameTurn++;


            } else if (gameTurn % 2 == 0 && !one1isClicked) {
                button1.setBackgroundColor(p2Color);
                one1isClicked = true;
                button1Player = 2;
                gameTurn++;


            }


        });

        button2 = findViewById(R.id.one2);
        button2.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one2isClicked) && one1isClicked) {
                button2.setBackgroundColor(p1Color);
                one2isClicked = true;
                button2Player = 1;
                gameTurn++;


            } else if ((gameTurn % 2 == 0 && !one2isClicked) && one1isClicked) {
                button2.setBackgroundColor(p2Color);
                one2isClicked = true;
                button2Player = 2;
                gameTurn++;


            }
            checkWinner();

        });

        button3 = findViewById(R.id.one3);
        button3.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one3isClicked) && one2isClicked) {
                button3.setBackgroundColor(p1Color);
                one3isClicked = true;
                button3Player = 1;
                gameTurn++;


            } else if ((gameTurn % 2 == 0 && !one3isClicked) && one2isClicked) {
                button3.setBackgroundColor(p2Color);
                one3isClicked = true;
                button3Player = 2;
                gameTurn++;

            }

        });

        button4 = findViewById(R.id.one4);
        button4.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one4isClicked) && one3isClicked) {
                button4.setBackgroundColor(p1Color);
                one4isClicked = true;
                button4Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one4isClicked) && one3isClicked) {
                button4.setBackgroundColor(p2Color);
                one4isClicked = true;
                button4Player = 2;
                gameTurn++;

            }

        });

        button5 = findViewById(R.id.one5);
        button5.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one5isClicked) && one4isClicked) {
                button5.setBackgroundColor(p1Color);
                one5isClicked = true;
                button5Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one5isClicked) && one4isClicked) {
                button5.setBackgroundColor(p2Color);
                one5isClicked = true;
                button5Player = 2;
                gameTurn++;

            }

        });

        button6 = findViewById(R.id.one6);
        button6.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !one6isClicked) && one5isClicked) {
                button6.setBackgroundColor(p1Color);
                one6isClicked = true;
                button6Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !one6isClicked) && one5isClicked) {
                button6.setBackgroundColor(p2Color);
                one6isClicked = true;
                button6Player = 2;
                gameTurn++;

            }

        });

        button7 = findViewById(R.id.two1);
        button7.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !two1isClicked) {
                button7.setBackgroundColor(p1Color);
                two1isClicked = true;
                button7Player = 1;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !two1isClicked) {
                button7.setBackgroundColor(p2Color);
                two1isClicked = true;
                button7Player = 2;
                gameTurn++;

            }

        });

        button8 = findViewById(R.id.two2);
        button8.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two2isClicked) && two1isClicked) {
                button8.setBackgroundColor(p1Color);
                two2isClicked = true;
                button8Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two2isClicked) && two1isClicked) {
                button8.setBackgroundColor(p2Color);
                two2isClicked = true;
                button8Player = 2;
                gameTurn++;

            }

        });

        button9 = findViewById(R.id.two3);
        button9.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two3isClicked) && two2isClicked) {
                button9.setBackgroundColor(p1Color);
                two3isClicked = true;
                button9Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two3isClicked) && two2isClicked) {
                button9.setBackgroundColor(p2Color);
                two3isClicked = true;
                button9Player = 2;
                gameTurn++;

            }

        });

        button10 = findViewById(R.id.two4);
        button10.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two4isClicked) && two3isClicked) {
                button10.setBackgroundColor(p1Color);
                two4isClicked = true;
                button10Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two4isClicked) && two3isClicked) {
                button10.setBackgroundColor(p2Color);
                two4isClicked = true;
                button10Player = 2;
                gameTurn++;

            }

        });

        button11 = findViewById(R.id.two5);
        button11.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two5isClicked) && two4isClicked) {
                button11.setBackgroundColor(p1Color);
                two5isClicked = true;
                button11Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two5isClicked) && two4isClicked) {
                button11.setBackgroundColor(p2Color);
                two5isClicked = true;
                button11Player = 2;
                gameTurn++;

            }

        });

        button12 = findViewById(R.id.two6);
        button12.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !two6isClicked) && two5isClicked) {
                button12.setBackgroundColor(p1Color);
                two6isClicked = true;
                button12Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !two6isClicked) && two5isClicked) {
                button12.setBackgroundColor(p2Color);
                two6isClicked = true;
                button12Player = 2;
                gameTurn++;

            }

        });

        button13 = findViewById(R.id.three1);
        button13.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !three1isClicked) {
                button13.setBackgroundColor(p1Color);
                three1isClicked = true;
                button13Player = 1;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !three1isClicked) {
                button13.setBackgroundColor(p2Color);
                three1isClicked = true;
                button13Player = 2;
                gameTurn++;

            }

        });

        button14 = findViewById(R.id.three2);
        button14.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three2isClicked) && three1isClicked) {
                button14.setBackgroundColor(p1Color);
                three2isClicked = true;
                button14Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three2isClicked) && three1isClicked) {
                button14.setBackgroundColor(p2Color);
                three2isClicked = true;
                button14Player = 2;
                gameTurn++;

            }

        });

        button15 = findViewById(R.id.three3);
        button15.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three3isClicked) && three2isClicked) {
                button15.setBackgroundColor(p1Color);
                three3isClicked = true;
                button15Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three3isClicked) && three2isClicked) {
                button15.setBackgroundColor(p2Color);
                three3isClicked = true;
                button15Player = 2;
                gameTurn++;

            }

        });

        button16 = findViewById(R.id.three4);
        button16.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three4isClicked) && three3isClicked) {
                button16.setBackgroundColor(p1Color);
                three4isClicked = true;
                button16Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three4isClicked) && three3isClicked) {
                button16.setBackgroundColor(p2Color);
                three4isClicked = true;
                button16Player = 2;
                gameTurn++;

            }

        });

        button17 = findViewById(R.id.three5);
        button17.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three5isClicked) && three4isClicked) {
                button17.setBackgroundColor(p1Color);
                three5isClicked = true;
                button17Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three5isClicked) && three4isClicked) {
                button17.setBackgroundColor(p2Color);
                three5isClicked = true;
                button17Player = 2;
                gameTurn++;

            }

        });

        button18 = findViewById(R.id.three6);
        button18.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !three6isClicked) && three5isClicked) {
                button18.setBackgroundColor(p1Color);
                three6isClicked = true;
                button18Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !three6isClicked) && three5isClicked) {
                button18.setBackgroundColor(p2Color);
                three6isClicked = true;
                button18Player = 2;
                gameTurn++;

            }

        });

        button19 = findViewById(R.id.four1);
        button19.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !four1isClicked) {
                button19.setBackgroundColor(p1Color);
                four1isClicked = true;
                button19Player = 1;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !four1isClicked) {
                button19.setBackgroundColor(p2Color);
                four1isClicked = true;
                button19Player = 2;
                gameTurn++;

            }

        });

        button20 = findViewById(R.id.four2);
        button20.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four2isClicked) && four1isClicked) {
                button20.setBackgroundColor(p1Color);
                four2isClicked = true;
                button20Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four2isClicked) && four1isClicked) {
                button20.setBackgroundColor(p2Color);
                four2isClicked = true;
                button20Player = 2;
                gameTurn++;

            }

        });

        button21 = findViewById(R.id.four3);
        button21.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four3isClicked) && four2isClicked) {
                button21.setBackgroundColor(p1Color);
                four3isClicked = true;
                button21Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four3isClicked) && four2isClicked) {
                button21.setBackgroundColor(p2Color);
                four3isClicked = true;
                button21Player = 1;
                gameTurn++;

            }

        });

        button22 = findViewById(R.id.four4);
        button22.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four4isClicked) && four3isClicked) {
                button22.setBackgroundColor(p1Color);
                four4isClicked = true;
                button22Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four4isClicked) && four3isClicked) {
                button22.setBackgroundColor(p2Color);
                four4isClicked = true;
                button22Player = 2;
                gameTurn++;

            }

        });

        button23 = findViewById(R.id.four5);
        button23.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four5isClicked) && four4isClicked) {
                button23.setBackgroundColor(p1Color);
                four5isClicked = true;
                button23Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four5isClicked) && four4isClicked) {
                button23.setBackgroundColor(p2Color);
                four5isClicked = true;
                button23Player = 2;
                gameTurn++;

            }

        });

        button24 = findViewById(R.id.four6);
        button24.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four6isClicked) && four5isClicked) {
                button24.setBackgroundColor(p1Color);
                four6isClicked = true;
                button24Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four6isClicked) && four5isClicked) {
                button24.setBackgroundColor(p2Color);
                four6isClicked = true;
                button24Player = 2;
                gameTurn++;

            }

        });

        button25 = findViewById(R.id.five1);
        button25.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !five1isClicked) {
                button25.setBackgroundColor(p1Color);
                five1isClicked = true;
                button25Player = 1;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !five1isClicked) {
                button25.setBackgroundColor(p2Color);
                five1isClicked = true;
                button25Player = 2;
                gameTurn++;

            }

        });

        button26 = findViewById(R.id.five2);
        button26.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five2isClicked) && five1isClicked) {
                button26.setBackgroundColor(p1Color);
                five2isClicked = true;
                button26Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five2isClicked) && five1isClicked) {
                button26.setBackgroundColor(p2Color);
                five2isClicked = true;
                button26Player = 2;
                gameTurn++;

            }

        });

        button27 = findViewById(R.id.five3);
        button27.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five3isClicked) && five2isClicked) {
                button27.setBackgroundColor(p1Color);
                five3isClicked = true;
                button27Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five3isClicked) && five2isClicked) {
                button27.setBackgroundColor(p2Color);
                five3isClicked = true;
                button27Player = 2;
                gameTurn++;

            }

        });

        button28 = findViewById(R.id.five4);
        button28.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five4isClicked) && five3isClicked) {
                button28.setBackgroundColor(p1Color);
                five4isClicked = true;
                button28Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five4isClicked) && five3isClicked) {
                button28.setBackgroundColor(p2Color);
                five4isClicked = true;
                button28Player = 2;
                gameTurn++;

            }

        });

        button29 = findViewById(R.id.five5);
        button29.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five5isClicked) && five4isClicked) {
                button29.setBackgroundColor(p1Color);
                five5isClicked = true;
                button29Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five5isClicked) && five4isClicked) {
                button29.setBackgroundColor(p2Color);
                five5isClicked = true;
                button29Player = 2;
                gameTurn++;

            }

        });

        button30 = findViewById(R.id.five6);
        button30.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !five6isClicked) && five5isClicked) {
                button30.setBackgroundColor(p1Color);
                five6isClicked = true;
                button30Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !five6isClicked) && five5isClicked) {
                button30.setBackgroundColor(p2Color);
                five6isClicked = true;
                button30Player = 2;
                gameTurn++;

            }

        });

        button31 = findViewById(R.id.six1);
        button31.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !six1isClicked) {
                button31.setBackgroundColor(p1Color);
                six1isClicked = true;
                button31Player = 1;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !six1isClicked) {
                button31.setBackgroundColor(p2Color);
                six1isClicked = true;
                button31Player = 2;
                gameTurn++;

            }

        });

        button32 = findViewById(R.id.six2);
        button32.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six2isClicked) && six1isClicked) {
                button32.setBackgroundColor(p1Color);
                six2isClicked = true;
                button32Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six2isClicked) && six1isClicked) {
                button32.setBackgroundColor(p2Color);
                six2isClicked = true;
                button32Player = 2;
                gameTurn++;

            }

        });

        button33 = findViewById(R.id.six3);
        button33.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six3isClicked) && six2isClicked) {
                button33.setBackgroundColor(p1Color);
                six3isClicked = true;
                button33Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six3isClicked) && six2isClicked) {
                button33.setBackgroundColor(p2Color);
                six3isClicked = true;
                button33Player = 2;
                gameTurn++;

            }

        });

        button34 = findViewById(R.id.six4);
        button34.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six4isClicked) && six3isClicked) {
                button34.setBackgroundColor(p1Color);
                six4isClicked = true;
                button34Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six4isClicked) && six3isClicked) {
                button34.setBackgroundColor(p2Color);
                six4isClicked = true;
                button34Player = 2;
                gameTurn++;

            }

        });

        button35 = findViewById(R.id.six5);
        button35.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six5isClicked) && six4isClicked) {
                button35.setBackgroundColor(p1Color);
                six5isClicked = true;
                button35Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six5isClicked) && six4isClicked) {
                button35.setBackgroundColor(p2Color);
                six5isClicked = true;
                button35Player = 2;
                gameTurn++;

            }

        });

        button36 = findViewById(R.id.six6);
        button36.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !six6isClicked) && six5isClicked) {
                button36.setBackgroundColor(p1Color);
                six6isClicked = true;
                button36Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !six6isClicked) && six5isClicked) {
                button36.setBackgroundColor(p2Color);
                six6isClicked = true;
                button36Player = 2;
                gameTurn++;

            }

        });

        button37 = findViewById(R.id.seven1);
        button37.setOnClickListener(view -> {


            if (gameTurn % 2 != 0 && !seven1isClicked) {
                button37.setBackgroundColor(p1Color);
                seven1isClicked = true;
                button37Player = 1;
                gameTurn++;

            } else if (gameTurn % 2 == 0 && !seven1isClicked) {
                button37.setBackgroundColor(p2Color);
                seven1isClicked = true;
                button37Player = 2;
                gameTurn++;

            }

        });

        button38 = findViewById(R.id.seven2);
        button38.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven2isClicked) && seven1isClicked) {
                button38.setBackgroundColor(p1Color);
                seven2isClicked = true;
                button38Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven2isClicked) && seven1isClicked) {
                button38.setBackgroundColor(p2Color);
                seven2isClicked = true;
                button38Player = 2;
                gameTurn++;

            }

        });

        button39 = findViewById(R.id.seven3);
        button39.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven3isClicked) && seven2isClicked) {
                button39.setBackgroundColor(p1Color);
                seven3isClicked = true;
                button39Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven3isClicked) && seven2isClicked) {
                button39.setBackgroundColor(p2Color);
                seven3isClicked = true;
                button39Player = 2;
                gameTurn++;

            }

        });

        button40 = findViewById(R.id.seven4);
        button40.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven4isClicked) && seven3isClicked) {
                button40.setBackgroundColor(p1Color);
                seven4isClicked = true;
                button40Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven4isClicked) && seven3isClicked) {
                button40.setBackgroundColor(p2Color);
                seven4isClicked = true;
                button40Player = 2;
                gameTurn++;

            }

        });

        button41 = findViewById(R.id.seven5);
        button41.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven5isClicked) && seven4isClicked) {
                button41.setBackgroundColor(p1Color);
                seven5isClicked = true;
                button41Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven5isClicked) && seven4isClicked) {
                button41.setBackgroundColor(p2Color);
                seven5isClicked = true;
                button41Player = 2;
                gameTurn++;

            }

        });

        button42 = findViewById(R.id.seven6);
        button42.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !seven6isClicked) && seven5isClicked) {
                button42.setBackgroundColor(p1Color);
                seven6isClicked = true;
                button42Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !seven6isClicked) && seven5isClicked) {
                button42.setBackgroundColor(p2Color);
                seven6isClicked = true;
                button42Player = 2;
                gameTurn++;

            }

        });

    }

    public void checkWinner() {
        int testColor = ContextCompat.getColor(this, R.color.black);

        int winner;
        int[] playerToken = new int[42]; // Create Array of integers

        playerToken[0] = button1Player; // Assign button values to the array for comparison in checks below
        playerToken[1] = button2Player;
        playerToken[2] = button3Player;
        playerToken[3] = button4Player;
        playerToken[4] = button5Player;
        playerToken[5] = button6Player;
        playerToken[6] = button7Player;
        playerToken[7] = button8Player;
        playerToken[8] = button9Player;
        playerToken[9] = button10Player;
        playerToken[10] = button11Player;
        playerToken[11] = button12Player;
        playerToken[12] = button13Player;
        playerToken[13] = button14Player;
        playerToken[14] = button15Player;
        playerToken[15] = button16Player;
        playerToken[16] = button17Player;
        playerToken[17] = button18Player;
        playerToken[18] = button19Player;
        playerToken[19] = button20Player;
        playerToken[20] = button21Player;
        playerToken[21] = button22Player;
        playerToken[22] = button23Player;
        playerToken[23] = button24Player;
        playerToken[24] = button25Player;
        playerToken[25] = button26Player;
        playerToken[26] = button27Player;
        playerToken[27] = button28Player;
        playerToken[28] = button29Player;
        playerToken[29] = button30Player;
        playerToken[30] = button31Player;
        playerToken[31] = button32Player;
        playerToken[32] = button33Player;
        playerToken[33] = button34Player;
        playerToken[34] = button35Player;
        playerToken[35] = button36Player;
        playerToken[36] = button37Player;
        playerToken[37] = button38Player;
        playerToken[38] = button39Player;
        playerToken[39] = button40Player;
        playerToken[40] = button41Player;
        playerToken[41] = button42Player;



        if (gameTurn >= 7) { // Vertical Checks, playerTokens = 1 for Red/P1, = 2 for Blue/P2
            for (int i = 0; i < playerToken.length-3; i++) {
                if (playerToken[i] == 1 && playerToken[i+1] == 1 && playerToken[i+2] == 1 && playerToken[i+3] == 1) {
                    winner = 1;
                    gameOver(winner);
                } else if (playerToken[i] == 2 && playerToken[i+1] == 2 && playerToken[i+2] == 2 && playerToken[i+3] == 2) {
                    winner = 2;
                    gameOver(winner);
                }
            }
        }

        if (gameTurn >= 7) { // Horizontal Checks, playerTokens == 1 for Red/P1, == 2 for Blue/P2
            for (int i = 0; i < playerToken.length-18; i++) {
                if (playerToken[i] == 1 && playerToken[i+6] == 1 && playerToken[i+12] == 1 && playerToken[i+18] == 1) {
                    winner = 1;
                    gameOver(winner);
                } else if (playerToken[i] == 2 && playerToken[i+6] == 2 && playerToken[i+12] == 2 && playerToken[i+18] == 2) {
                    winner = 2;
                    gameOver(winner);
                }
            }
        }

        if (gameTurn >= 7) { // Vertical Upwards Checks, playerTokens == 1 for Red/P1, == 2 for Blue/P2
            for (int i = 0; i < playerToken.length-21; i++) {
                if (playerToken[i] == 1 && playerToken[i+7] == 1 && playerToken[i+14] == 1 && playerToken[i+21] == 1) {
                    winner = 1;
                    gameOver(winner);
                } else if (playerToken[i] == 2 && playerToken[i+7] == 2 && playerToken[i+14] == 2 && playerToken[i+21] == 2) {
                    winner = 2;
                    gameOver(winner);
                }
            }
        }

        if (gameTurn >= 7) { // Vertical Downwards Checks, playerTokens == 1 for Red/P1, == 2 for Blue/P2
            for (int i = 0; i < playerToken.length-15; i++) {
                if (playerToken[i] == 1 && playerToken[i+5] == 1 && playerToken[i+10] == 1 && playerToken[i+15] == 1) {
                    winner = 1;
                    gameOver(winner);
                } else if (playerToken[i] == 2 && playerToken[i+5] == 2 && playerToken[i+10] == 2 && playerToken[i+15] == 2) {
                    winner = 2;
                    gameOver(winner);
                }
            }
        }




    }

    public void gameOver(int winner) {
        if (winner == 1){
            Intent intent = new Intent(this, GameOverPlayer1.class);
            startActivity(intent);
        } else if (winner == 2) {
            Intent intent = new Intent(this, GameOverPlayer2.class);
            startActivity(intent);
        }


    }
}







