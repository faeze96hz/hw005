package com.example.fhz.myapplication;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = (TextView) findViewById(R.id.text1);
        tx = (TextView) findViewById(R.id.text2);


        Typeface d_g = Typeface.createFromAsset(getAssets(), "fonts/digital7.otf");
        TextView tx = (TextView) findViewById(R.id.text1);
        tx.setTypeface(d_g);
        btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.esmeposhe.media);
                mediaPlayer.start();
            }

        }


    }
}
