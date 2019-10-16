package com.gmail2548sov.aboutmeolehsuprun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Rush3 extends AppCompatActivity implements View.OnClickListener {

    Button btn3;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_about_me);

        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,AboutMe.class);
        startActivity(intent);
    }
}
