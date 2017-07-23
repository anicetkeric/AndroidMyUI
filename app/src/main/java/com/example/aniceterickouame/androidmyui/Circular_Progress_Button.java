package com.example.aniceterickouame.androidmyui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Circular_Progress_Button extends AppCompatActivity {

    public Button btn1,btn2,btn3,btn4,btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular__progress__button);

        btn1=(Button) findViewById(R.id.btnIPS);
        btn2=(Button) findViewById(R.id.btnInPS);
        btn3=(Button) findViewById(R.id.btnSCS);
        btn4=(Button) findViewById(R.id.btnPPS);
        btn5=(Button) findViewById(R.id.btnCSS);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circular_Progress_Button.this, Sample1Activity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circular_Progress_Button.this, Sample2Activity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circular_Progress_Button.this, Sample3Activity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circular_Progress_Button.this, Sample4Activity.class);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Circular_Progress_Button.this, Sample5Activity.class);
                startActivity(intent);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_circular__progress__button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }














    /**********************************************************************************/
    /**
     * //circular-progress-button


     1-ajouter la dependences
     dependencies {
     compile 'com.github.dmytrodanylyk.circular-progress-button:library:1.1.3'
     }

     2--ajouter les fichiers xml dans le layout
     **ac_sample_1.xml
     **ac_sample_2.xml
     **ac_sample_3.xml
     **ac_sample_4.xml
     **ac_sample_5.xml

     3--ajout les fichiers xml de design dans drawable
     **complete_state_selector.xml
     **error_state_selector.xml
     **idle_state_selector.xml

     4--ajouter les name dans string
     5--ajouter activiyi.java
     **Sample1Activity.java
     **Sample2Activity.java
     **Sample3Activity.java
     **Sample4Activity.java
     **Sample5Activity.java
     */
}
