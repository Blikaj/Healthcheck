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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextDate;
    EditText pulse1;
    EditText pulse2;
    Spinner spinner1;
    public int razn;
    ImageView warnimage;
    TextView warntext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonfow = (Button)findViewById(R.id.buttonfow);
        buttonfow.setOnClickListener(this);
        warnimage = (ImageView) findViewById(R.id.warnimage);
        pulse1 = (EditText) findViewById(R.id.pulse1);
        pulse2 = (EditText) findViewById(R.id.pulse2);
        warntext = (TextView) findViewById(R.id.warntext);
    }

    @Override
    public void onClick(View view) {
        int p1 = Integer.parseInt(pulse1.getText().toString());
        int p2 = Integer.parseInt(pulse2.getText().toString());
        razn = p2-p1;
        String s = "empty";
        if ( razn <= 10) {
            s = "Всё хорошо";
            warnimage.setVisibility(View.VISIBLE);
            warntext.setVisibility(View.VISIBLE);
            warnimage.setBackgroundColor(Color.argb(100, 0, 255, 0));
            warntext.setText(s.toCharArray(), 0, s.length());
        }
        else{
            s = "Вы переутомлены";
            warnimage.setVisibility(View.VISIBLE);
            warntext.setVisibility(View.VISIBLE);
            warnimage.setBackgroundColor(Color.argb(100, 255, 0, 0));
            warntext.setText(s.toCharArray(), 0, s.length());
        }
    }
}