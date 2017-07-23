package com.example.aniceterickouame.androidmyui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Edittext3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final RatingBar ratingBar_default = (RatingBar)findViewById(R.id.ratingbar_default);
        final Button button = (Button)findViewById(R.id.btnvoter);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ratingBar_default.setRating(5);


                Toast.makeText(Edittext3Activity.this, "Rating: " + String.valueOf(ratingBar_default.getRating()), Toast.LENGTH_LONG).show();
            }
        });

        ratingBar_default.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // TODO Auto-generated method stub
                Toast.makeText(Edittext3Activity.this,"Rating: " + String.valueOf(rating), Toast.LENGTH_LONG).show();
            }
        });
    }

}
