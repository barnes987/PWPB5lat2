package com.example.pwpb5lat2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3);
        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent explicit = new Intent( Activity3.this, Activity4.class );
        startActivity(explicit);
    }
}
