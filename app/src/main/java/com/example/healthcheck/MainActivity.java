package com.example.healthcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextDate;
    EditText pulse1;
    EditText pulse2;
    Spinner spinner1;
    public int p1;
    public int p2;
    public int razn;
    ImageView imageicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonfow = (Button)findViewById(R.id.buttonfow);
        buttonfow.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        /*p1 = Integer.parseInt(pulse1.getText().toString());
        p2 = Integer.parseInt(pulse2.getText().toString());
        razn = p2-p1;
        if ( razn <= 10) {
            imageicon.setBackgroundColor(Color.argb(100, 0, 255, 0));
        }
        else{
            imageicon.setBackgroundColor(Color.argb(100, 255, 0, 0));
        }*/
        //imageicon.setBackgroundColor(Color.argb(100, 255, 0, 0));
        Intent i;
        i = new Intent(this, SecondpageActivity.class);
        startActivity(i);
    }
}