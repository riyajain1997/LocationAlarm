package com.example.locationalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class enter_details extends AppCompatActivity {

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);

        name=findViewById(R.id.griddata);

        Intent intent=getIntent();
        name.setHint(intent.getStringExtra("name"));
    }
}