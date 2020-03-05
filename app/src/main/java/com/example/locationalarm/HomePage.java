package com.example.locationalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.locationalarm.AddTask;
import com.example.locationalarm.R;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnclick(View view) {

        Intent intent = new Intent(getApplicationContext(), AddTask.class);
        startActivity(intent);
    }

    public void mapclick(View view) {
        Intent intent = new Intent(getApplicationContext(), AddTask.class);
        startActivity(intent);
    }
}
