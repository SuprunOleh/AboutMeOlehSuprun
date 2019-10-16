package com.gmail2548sov.aboutmeolehsuprun;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Hobbies extends AppCompatActivity implements View.OnClickListener {

    Button btn5;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_hobies);
        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, TheEnd.class);
        startActivity(intent);
    }
}
