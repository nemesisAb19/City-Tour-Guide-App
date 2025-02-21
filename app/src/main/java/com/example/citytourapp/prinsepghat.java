package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class prinsepghat extends AppCompatActivity {

    ViewFlipper v_flipper5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_prinsepghat);
        getSupportActionBar().hide();

        ConstraintLayout constraintLayout= findViewById(R.id.layout5);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        int image[]={R.drawable.princepghat,R.drawable.princepghat2,R.drawable.princep_ghat,R.drawable.prinsep_ghat2};
        v_flipper5=findViewById(R.id.v_flipper5);

        for(int images:image){
            flipperImage(images);

        }
    }
    private void flipperImage(int images) {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper5.addView(imageView);
        v_flipper5.setFlipInterval(4000);
        v_flipper5.setAutoStart(true);


        v_flipper5.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper5.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}