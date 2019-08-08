package com.example.pwpb5lat2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Intent explicit = new Intent( Activity4.this, Activity5.class );
        startActivity(explicit);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
