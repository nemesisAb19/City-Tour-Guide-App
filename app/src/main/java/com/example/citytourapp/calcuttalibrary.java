package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class calcuttalibrary extends AppCompatActivity {

    ViewFlipper v_flipper6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_calcuttalibrary);
        getSupportActionBar().hide();

        ConstraintLayout constraintLayout= findViewById(R.id.layout5);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        int image[]={R.drawable.lib_national,R.drawable.lib_national1,R.drawable.calcutta_lib};
        v_flipper6=findViewById(R.id.v_flipper6);

        for(int images:image){
            flipperImage(images);

        }
    }
    private void flipperImage(int images) {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper6.addView(imageView);
        v_flipper6.setFlipInterval(4000);
        v_flipper6.setAutoStart(true);


        v_flipper6.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper6.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}