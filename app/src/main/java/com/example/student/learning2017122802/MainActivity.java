package com.example.student.learning2017122802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        Intent in=new Intent();
        in.setAction("fuckyou");
        in=Intent.createChooser(in,"你怎麼還不選!");
        startActivity(in);
    }
}
