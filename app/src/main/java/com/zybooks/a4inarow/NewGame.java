package com.zybooks.a4inarow;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class NewGame extends AppCompatActivity {
    private int gameTurn = 1;
    private int p1Color; // Player 1 Color
    private int p2Color; // Player 2 Color
    private Button button1, button2, button3, button4, button5, button6; // Column 1 Buttons
    private Button button7, button8, button9, button10, button11, button12; // Column 2 Buttons
    private Button button13, button14, button15, button16, button17, button18; // Column 3 Buttons
    private Button button19, button20, button21, button22, button23, button24; //Column 4 Buttons
    private Button button25, button26, button27, button28, button29, button30; // Column 5 Buttons
    private Button button31, button32, button33, button34, button35, button36; // Column 6 Buttons
    private Button button37, button38, button39, button40, button41, button42; // Column 7 Buttons
    private boolean one1isClicked, one2isClicked, one3isClicked, one4isClicked, one5isClicked, one6isClicked; // Column 1 button status
    private boolean two1isClicked, two2isClicked, two3isClicked, two4isClicked, two5isClicked, two6isClicked; // Column 2 button status
    private boolean three1isClicked, three2isClicked, three3isClicked, three4isClicked, three5isClicked, three6isClicked; // Column 3 button status
    private boolean four1isClicked, four2isClicked, four3isClicked, four4isClicked, four5isClicked, four6isClicked; // Column 4 button status
    private boolean five1isClicked, five2isClicked, five3isClicked, five4isClicked, five5isClicked, five6isClicked; // Column 5 button status
    private boolean six1isClicked, six2isClicked, six3isClicked, six4isClicked, six5isClicked, six6isClicked; // Column 6 button status
    private boolean seven1isClicked, seven2isClicked, seven3isClicked, seven4isClicked, seven5isClicked, seven6isClicked; // Column 7 button status
    private int button1Player, button2Player, button3Player, button4Player, button5Player, button6Player; // Column 1 player colors
    private int button7Player, button8Player, button9Player, button10Player, button11Player, button12Player; // Column 2 player colors
    private int button13Player, button14Player, button15Player, button16Player, button17Player, button18Player; // Column 3 player colors
    private int button19Player, button20Player, button21Player, button22Player, button23Player, button24Player; // Column 4 player colors
    private int button25Player, button26Player, button27Player, button28Player, button29Player, button30Player; // Column 5 player colors
    private int button31Player, button32Player, button33Player, button34Player, button35Player, button36Player; // Column 6 player colors
    private int button37Player, button38Player, button39Player, button40Player, button41Player, button42Player; // Column 7 player colors




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        p1Color = ContextCompat.getColor(this, R.color.red);
        p2Color = ContextCompat.getColor(this, R.color.blue);
        gameClick(); // Launches game method




    }


    public void gameClick() {

        int[] buttonColumn = new int[42];
        int[] buttonRow = new int[42];


        button1 = findViewById(R.id.one1); // Associates button with ID
        buttonColumn[0] = 1; // Adds column value to an array for checks later
        buttonRow[0] = 1; // Adds row value to an array for checks later
        button1.setOnClickListener(view -> { // Lambda expression for click listener


            if (gameTurn % 2 != 0 && !one1isClicked) { // Checks if the turn is odd to determine who's turn it is and if button is already clicked
                button1.setBackgroundColor(p1Color); // Color is set to player 1 if turn is odd
                one1isClicked = true; // sets value of button to clicked so that its color cannot be changed
                button1Player = 1; // sets value of button inside array to 1 for comparison in checks
                gameTurn++; // sets value of button inside array to 1 for comparison in checks


            } else if (gameTurn % 2 == 0 && !one1isClicked) { // Checks if the turn is even to determine who's turn it is and if button is already clicked
                button1.setBackgroundColor(p2Color); // Color is set to player 2 if turn is even
                one1isClicked = true; // sets value of button to clicked so that its color cannot be changed
                button1Player = 2; // sets value of button inside array to 2 for comparison in checks
                gameTurn++; // increments the turn of the game


            }
            checkWinner(buttonColumn, buttonRow); // Checks after the button is clicked to see if the game has been won, passing row and column values

        });

        button2 = findViewById(R.id.one2); // Associates button with ID
        buttonColumn[1] = 1; // Adds column value to an array for checks later
        buttonRow[1] = 2; // Adds row value to an array for checks later
        button2.setOnClickListener(view -> { // Lambda expression for click listener


            if ((gameTurn % 2 != 0 && !one2isClicked) && one1isClicked) { // Checks to see who's turn it is and if the button below is clicked
                button2.setBackgroundColor(p1Color); // // Color is set to player 1 if turn is odd
                one2isClicked = true; // sets value of button to clicked so that its color cannot be changed
                button2Player = 1; // sets value of button inside array to 1 for comparison in checks
                gameTurn++; // sets value of button inside array to 1 for comparison in checks


            } else if ((gameTurn % 2 == 0 && !one2isClicked) && one1isClicked) { // Checks to see who's turn it is and if the button below is clicked
                button2.setBackgroundColor(p2Color); // Color is set to player 2 if turn is even
                one2isClicked = true; // sets value of button to clicked so that its color cannot be changed
                button2Player = 2; // sets value of button inside array to 2 for comparison in checks
                gameTurn++; // increments the turn of the game


            }
            checkWinner(buttonColumn, buttonRow);

        });

        button3 = findViewById(R.id.one3);
        buttonColumn[2] = 1;
        buttonRow[2] = 3;
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
            checkWinner(buttonColumn, buttonRow);
        });

        button4 = findViewById(R.id.one4);
        buttonColumn[3] = 1;
        buttonRow[3] = 4;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button5 = findViewById(R.id.one5);
        buttonColumn[4] = 1;
        buttonRow[4] = 5;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button6 = findViewById(R.id.one6);
        buttonColumn[5] = 1;
        buttonRow[5] = 6;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button7 = findViewById(R.id.two1);
        buttonColumn[6] = 2;
        buttonRow[6] = 1;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button8 = findViewById(R.id.two2);
        buttonColumn[7] = 2;
        buttonRow[7] = 2;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button9 = findViewById(R.id.two3);
        buttonColumn[8] = 2;
        buttonRow[8] = 3;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button10 = findViewById(R.id.two4);
        buttonColumn[9] = 2;
        buttonRow[9] = 4;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button11 = findViewById(R.id.two5);
        buttonColumn[10] = 2;
        buttonRow[10] = 5;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button12 = findViewById(R.id.two6);
        buttonColumn[11] = 2;
        buttonRow[11] = 6;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button13 = findViewById(R.id.three1);
        buttonColumn[12] = 3;
        buttonRow[12] = 1;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button14 = findViewById(R.id.three2);
        buttonColumn[13] = 3;
        buttonRow[13] = 2;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button15 = findViewById(R.id.three3);
        buttonColumn[14] = 3;
        buttonRow[14] = 3;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button16 = findViewById(R.id.three4);
        buttonColumn[15] = 3;
        buttonRow[15] = 4;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button17 = findViewById(R.id.three5);
        buttonColumn[16] = 3;
        buttonRow[16] = 5;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button18 = findViewById(R.id.three6);
        buttonColumn[17] = 3;
        buttonRow[17] = 6;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button19 = findViewById(R.id.four1);
        buttonColumn[18] = 4;
        buttonRow[18] = 1;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button20 = findViewById(R.id.four2);
        buttonColumn[19] = 4;
        buttonRow[19] = 2;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button21 = findViewById(R.id.four3);
        buttonColumn[20] = 4;
        buttonRow[20] = 3;
        button21.setOnClickListener(view -> {


            if ((gameTurn % 2 != 0 && !four3isClicked) && four2isClicked) {
                button21.setBackgroundColor(p1Color);
                four3isClicked = true;
                button21Player = 1;
                gameTurn++;

            } else if ((gameTurn % 2 == 0 && !four3isClicked) && four2isClicked) {
                button21.setBackgroundColor(p2Color);
                four3isClicked = true;
                button21Player = 2;
                gameTurn++;

            }
            checkWinner(buttonColumn, buttonRow);

        });

        button22 = findViewById(R.id.four4);
        buttonColumn[21] = 4;
        buttonRow[21] = 4;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button23 = findViewById(R.id.four5);
        buttonColumn[22] = 4;
        buttonRow[22] = 5;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button24 = findViewById(R.id.four6);
        buttonColumn[23] = 4;
        buttonRow[23] = 6;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button25 = findViewById(R.id.five1);
        buttonColumn[24] = 5;
        buttonRow[24] = 1;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button26 = findViewById(R.id.five2);
        buttonColumn[25] = 5;
        buttonRow[25] = 2;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button27 = findViewById(R.id.five3);
        buttonColumn[26] = 5;
        buttonRow[26] = 3;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button28 = findViewById(R.id.five4);
        buttonColumn[27] = 5;
        buttonRow[27] = 4;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button29 = findViewById(R.id.five5);
        buttonColumn[28] = 5;
        buttonRow[28] = 5;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button30 = findViewById(R.id.five6);
        buttonColumn[29] = 5;
        buttonRow[29] = 6;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button31 = findViewById(R.id.six1);
        buttonColumn[30] = 6;
        buttonRow[30] = 1;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button32 = findViewById(R.id.six2);
        buttonColumn[31] = 6;
        buttonRow[31] = 2;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button33 = findViewById(R.id.six3);
        buttonColumn[32] = 6;
        buttonRow[32] = 3;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button34 = findViewById(R.id.six4);
        buttonColumn[33] = 6;
        buttonRow[33] = 4;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button35 = findViewById(R.id.six5);
        buttonColumn[34] = 6;
        buttonRow[34] = 5;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button36 = findViewById(R.id.six6);
        buttonColumn[35] = 6;
        buttonRow[35] = 6;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button37 = findViewById(R.id.seven1);
        buttonColumn[36] = 7;
        buttonRow[36] = 1;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button38 = findViewById(R.id.seven2);
        buttonColumn[37] = 7;
        buttonRow[37] = 2;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button39 = findViewById(R.id.seven3);
        buttonColumn[38] = 7;
        buttonRow[38] = 3;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button40 = findViewById(R.id.seven4);
        buttonColumn[39] = 7;
        buttonRow[39] = 4;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button41 = findViewById(R.id.seven5);
        buttonColumn[40] = 7;
        buttonRow[40] = 5;
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
            checkWinner(buttonColumn, buttonRow);

        });

        button42 = findViewById(R.id.seven6);
        buttonColumn[41] = 7;
        buttonRow[41] = 6;
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
            checkWinner(buttonColumn, buttonRow);

        });

    }

    public void checkWinner(int[]buttonColumn, int[]buttonRow) {
        //int testColor = ContextCompat.getColor(this, R.color.black);

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
                if (buttonColumn[i] == buttonColumn[i+1] && buttonColumn[i+1] == buttonColumn[i+2] && buttonColumn [i+2] == buttonColumn[i+3]) { // Ensures buttons are in same column for vertical checks
                    if (playerToken[i] == 1 && playerToken[i+1] == 1 && playerToken[i+2] == 1 && playerToken[i+3] == 1) {
                        winner = 1; // Sets winner of the game, either 1 or 2
                        gameOver(winner); // Passes value of winner to gameOver method
                    } else if (playerToken[i] == 2 && playerToken[i+1] == 2 && playerToken[i+2] == 2 && playerToken[i+3] == 2) { // Checks if buttons are in vertical order
                        winner = 2; // // Sets winner of the game, either 1 or 2
                        gameOver(winner); // Passes value of winner to gameOver method
                    }
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
                if (buttonRow[i] < buttonRow[i + 7] && buttonRow[i + 7] < buttonRow[i + 14] && buttonRow[i+14] < buttonRow[i+21]) {
                    if (playerToken[i] == 1 && playerToken[i+7] == 1 && playerToken[i+14] == 1 && playerToken[i+21] == 1) {
                        winner = 1;
                        gameOver(winner);
                    } else if (playerToken[i] == 2 && playerToken[i+7] == 2 && playerToken[i+14] == 2 && playerToken[i+21] == 2) {
                        winner = 2;
                        gameOver(winner);
                    }
                }
            }
        }

        if (gameTurn >= 7) { // Vertical Downwards Checks, playerTokens == 1 for Red/P1, == 2 for Blue/P2
            for (int i = 0; i < playerToken.length-15; i++) {
                if (buttonRow[i] > buttonRow[i+5] && buttonRow[1+5] > buttonRow[i+10] && buttonRow[i+10] > buttonRow[i+15]) {
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

        if (gameTurn > 42) {
            winner = 3;
            gameOver(winner);
        }




    }

    public void gameOver(int winner) {
        if (winner == 1){
            Intent intent = new Intent(this, GameOverPlayer1.class);
            startActivity(intent);
        } else if (winner == 2) {
            Intent intent = new Intent(this, GameOverPlayer2.class);
            startActivity(intent);
        } else if (winner == 3) {
            Intent intent = new Intent(this, GameOverDraw.class);
            startActivity(intent);
        }


    }
}







