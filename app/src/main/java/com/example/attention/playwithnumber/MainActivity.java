package com.example.attention.playwithnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void displayResult(String result){
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }

    public void Guess(View view) {

        EditText numberEditText = (EditText) findViewById(R.id.editText_guess);

        int guessNumber = Integer.parseInt(numberEditText.getText().toString());

        if (guessNumber > randomNumber){
            displayResult("Lower!");
        }else if (guessNumber < randomNumber){
            displayResult("Higher");
        }else{
            displayResult("That's right. Try again!");

            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1;
        }


    }
}
