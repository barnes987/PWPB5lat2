package com.example.pwpb5lat2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Intent explicit = new Intent( IntentActivity.this, Activity2.class );
        startActivity(explicit);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
