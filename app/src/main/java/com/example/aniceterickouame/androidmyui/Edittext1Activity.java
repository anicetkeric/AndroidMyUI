package com.example.aniceterickouame.androidmyui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Edittext1Activity extends AppCompatActivity {

    public Button btn1,btn2;
    public EditText txt1,txt2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txt1=(EditText) findViewById(R.id.txt1);
        txt2=(EditText) findViewById(R.id.txt2);

        btn1=(Button) findViewById(R.id.btnvalue1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt=txt1.getText().toString();

                Toast.makeText(Edittext1Activity.this,"valeur 1= "+txt , Toast.LENGTH_LONG).show();

            }
        });

        btn2=(Button) findViewById(R.id.btnvalue2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt=txt2.getText().toString();
                Toast.makeText(Edittext1Activity.this,"valeur 2= "+txt , Toast.LENGTH_LONG).show();

            }
        });



    }

}
