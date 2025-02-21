package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class cathedral extends AppCompatActivity {

    ViewFlipper v_flipper3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cathedral);
        getSupportActionBar().hide();
        ConstraintLayout constraintLayout= findViewById(R.id.layout3);
        AnimationDrawable animationDrawable=(AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        int image[]={R.drawable.church,R.drawable.cathedral,R.drawable.cathedral1,R.drawable.topplace};
        v_flipper3=findViewById(R.id.v_flipper3);

        for(int images:image){
            flipperImage(images);

        }
    }
    private void flipperImage(int images) {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper3.addView(imageView);
        v_flipper3.setFlipInterval(4000);
        v_flipper3.setAutoStart(true);


        v_flipper3.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper3.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}