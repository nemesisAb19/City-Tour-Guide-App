package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class howrah_bridge extends AppCompatActivity {

    ViewFlipper v_flipper4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_howrah_bridge);
        getSupportActionBar().hide();

        ConstraintLayout constraintLayout= findViewById(R.id.layout4);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        int image[]={R.drawable.howrabridge,R.drawable.howrah_bridge,R.drawable.howrahbridge1,R.drawable.howrahbridge2};
        v_flipper4=findViewById(R.id.v_flipper4);

        for(int images:image){
            flipperImage(images);

        }
    }
    private void flipperImage(int images) {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper4.addView(imageView);
        v_flipper4.setFlipInterval(4000);
        v_flipper4.setAutoStart(true);


        v_flipper4.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper4.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}