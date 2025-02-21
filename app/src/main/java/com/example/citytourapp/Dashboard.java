package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {

    ImageView logoutImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();

        logoutImg = findViewById(R.id.logo_logout);     //hooks

        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, NextActivity.class);
                startActivity(i);
            }
        });
        Button button1 = (Button)findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent j = new Intent(Dashboard.this, NextActivity2.class);
                startActivity(j);
            }
        });
        Button button2 = (Button)findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent j = new Intent(Dashboard.this, victoria.class);
                startActivity(j);
            }
        });
        Button button3 = (Button)findViewById(R.id.button5);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent j = new Intent(Dashboard.this, cathedral.class);
                startActivity(j);
            }
        });
        Button button4 = (Button)findViewById(R.id.button6);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent j = new Intent(Dashboard.this, howrah_bridge.class);
                startActivity(j);
            }
        });
        Button button5 = (Button)findViewById(R.id.button7);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent j = new Intent(Dashboard.this, prinsepghat.class);
                startActivity(j);
            }
        });
        Button button6 = (Button)findViewById(R.id.button8);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent j = new Intent(Dashboard.this, calcuttalibrary.class);
                startActivity(j);
            }
        });

    }

    public void Logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }
}
