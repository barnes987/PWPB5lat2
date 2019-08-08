package com.example.pwpb5lat2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {
    Button masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        masuk = (Button)findViewById(R.id.masuk);
        masuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent explicit = new Intent( Activity2.this, Activity3.class );
        startActivity(explicit);
    }
}
