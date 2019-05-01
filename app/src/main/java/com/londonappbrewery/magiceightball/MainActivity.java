package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.magic_button);
        final ImageView myImageView = (ImageView) findViewById(R.id.ball_image);

        final int[] myArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,
        R.drawable.ball5};



        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();

                int randomNumber = randomNumberGenerator.nextInt(5);

                myImageView.setImageResource(myArray[randomNumber]);

            }
        });
    }
}
