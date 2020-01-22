package com.example.scarnesdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int useroverall = 0;
    private int userturn = 0;
    private int computeroverall = 0;
    private int computerturn = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void display(int n){

        ImageView Dice = (ImageView) findViewById(R.id.imageView);
        if (n==1) {
            Dice.setImageResource(R.drawable.dice1);

        }
        if (n == 2) {
            Dice.setImageResource(R.drawable.dice2);

        }

        if (n == 3) {
            Dice.setImageResource(R.drawable.dice3);

        }

        if (n == 4) {
            Dice.setImageResource(R.drawable.dice4);
        }

        if (n == 5) {
            Dice.setImageResource(R.drawable.dice5);
        }

        if (n == 6) {
            Dice.setImageResource(R.drawable.dice6);
        }

    }
    /** Called when the user touches the button */
    public void Roll(View view) {
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        // Do something in response to Roll button click
        display(n);
        TextView text = (TextView) findViewById(R.id.textView2);
        if (n != 1) {
            userturn = n;
            useroverall += n;
            computerTurn(n);
            text.setText("Your score: "+useroverall+  " computer score: "+ computeroverall+  "\n" +" computer turn score: 0" +" your turn score: " + userturn);

        } else {
            userturn = 0;
            computerTurn(n);
            text.setText("Your score: "+useroverall+  " computer score: "+ computeroverall+  "\n" +" computer turn score: "+ computerturn +" your turn score: " + userturn);


        }
    }

    /** Called when the user touches the button */
    public void RESET(View view){
        //Reset the 4 global variables to 0 and update the label text
        useroverall = 0;
        userturn = 0;
        computeroverall = 0;
        computerturn = 0;
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText("Your score: 0 computer score: 0" + "\n" + "computer turn score: "+ computerturn+ " your turn score: 0");
    }

    /** Called when the user touches the button */
    public void HOLD(View view){
        //update the user overall score and reset the user round score
        userturn = 0;
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText("Your score: "+useroverall+ " computer score: " +computeroverall + "\n" +
                "computerTurn: 0 " + "your turn score: 0");

    }

    public void computerTurn(int n){

        if (n == 1) {
            computerturn = n;
            computeroverall += n;
        } else {
            computerturn = 0;

        }


        }


}
