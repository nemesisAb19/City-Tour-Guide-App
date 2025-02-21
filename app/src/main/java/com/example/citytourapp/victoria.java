package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class victoria extends AppCompatActivity {

    ViewFlipper v_flipper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_victoria);
        getSupportActionBar().hide();

        ConstraintLayout constraintLayout= findViewById(R.id.layout2);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        int image[]={R.drawable.vic1,R.drawable.victoria1,R.drawable.victoria2,R.drawable.victoria3};
        v_flipper2=findViewById(R.id.v_flipper2);

        for(int images:image){
            flipperImage(images);

        }
    }
    private void flipperImage(int images) {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper2.addView(imageView);
        v_flipper2.setFlipInterval(4000);
        v_flipper2.setAutoStart(true);


        v_flipper2.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper2.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}