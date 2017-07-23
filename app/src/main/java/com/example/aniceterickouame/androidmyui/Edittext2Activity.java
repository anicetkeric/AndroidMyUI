package com.example.aniceterickouame.androidmyui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Edittext2Activity extends AppCompatActivity {

    public Button btn1,btn2;
    EditText searchEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        searchEditText = (EditText) findViewById(R.id.txt2);

        clearTextListener();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        btn1=(Button) findViewById(R.id.btnvalue1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt=searchEditText.getText().toString();

                Toast.makeText(Edittext2Activity.this, "valeur search= " + txt, Toast.LENGTH_LONG).show();

            }
        });
    }




    private void clearTextListener() {



        final ImageView clearButtonImage = (ImageView) findViewById(R.id.clearButton);

        clearButtonImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                searchEditText.setText("");
                clearButtonImage.setVisibility(View.GONE);

            }

        });

        searchEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (s.length()!= 0){
                    clearButtonImage.setVisibility(View.VISIBLE);

                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
// TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
// TODO Auto-generated method stub

            }
        });

    }






}
