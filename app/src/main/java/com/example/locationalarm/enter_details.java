package com.example.locationalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    public void geolocation(View view) {
        Intent intent=new Intent(enter_details.this,mapactivity.class);
        startActivity(intent);
    }

    public void returnaddtask(View view) {
        Intent intent=new Intent(enter_details.this,AddTask.class);
        startActivity(intent);
    }
}