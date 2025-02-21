package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class NextActivity2 extends AppCompatActivity {

    ViewFlipper v_flipper1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_next2);
        getSupportActionBar().hide();

        ConstraintLayout constraintLayout= findViewById(R.id.layout1);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        int image[]={R.drawable.parkstreet,R.drawable.kolkata,R.drawable.oldparkstreet,R.drawable.christmas};
        v_flipper1=findViewById(R.id.v_flipper1);

        for(int images:image){
            flipperImage(images);

        }
    }
    private void flipperImage(int images) {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper1.addView(imageView);
        v_flipper1.setFlipInterval(4000);
        v_flipper1.setAutoStart(true);


        v_flipper1.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper1.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}