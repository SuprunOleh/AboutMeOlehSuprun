package com.gmail2548sov.aboutmeolehsuprun;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UsamaTwo extends AppCompatActivity implements View.OnClickListener {

    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_name);

        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent intent  = new Intent(this,Rush3.class);
        startActivity(intent);
    }
}
