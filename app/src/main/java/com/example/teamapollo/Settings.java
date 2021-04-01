package com.example.teamapollo;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Settings extends AppCompatActivity{
    Button returnStart;
    Button orientation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        returnStart = (Button) findViewById(R.id.returnButton);
        orientation = (Button) findViewById(R.id.orientationButton);

        returnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(getApplicationContext(), Settings.class);
                //startActivity(intent);
            }
        });

    }
}
