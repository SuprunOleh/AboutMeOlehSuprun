package com.gmail2548sov.aboutmeolehsuprun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutMe extends AppCompatActivity implements View.OnClickListener {

    Button btn4;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,Hobbies.class);
        startActivity(intent);

    }
}
