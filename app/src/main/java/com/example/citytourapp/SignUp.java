package com.example.citytourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.graphics.drawable.AnimationDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.support.v4.app.*;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private AnimationDrawable animationDrawable;

    TextInputLayout regName, regUserName, regEmail, regPhoneNumber, regPassword;
    Button regSignIn, regBtn;
    private FirebaseDatabase rootNode ;
    private DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        // Hooks to all xml elements in activity_sign_up.xml
        regName = findViewById(R.id.name);
        regUserName = findViewById(R.id.username);
        regEmail = findViewById(R.id.email);
        regPhoneNumber = findViewById(R.id.phoneNo);
        regPassword = findViewById(R.id.password);
        regBtn = findViewById(R.id.reg_btn);
        regSignIn = findViewById(R.id.signup_screen);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference();

                String name = regName.getEditText().getText().toString();
                String userName = regUserName.getEditText().getText().toString();
                String email = regEmail.getEditText().getText().toString();
                String phoneNo = regPhoneNumber.getEditText().getText().toString();
                String password = regPassword.getEditText().getText().toString();

                UserClass userClass = new UserClass(name, userName, email, phoneNo, password);
                reference.child(phoneNo).setValue(userClass);

                //reference.setValue("First data storage");

                //UserClass userClass = new UserClass(name, userName, email, phoneNo, password);
                //reference.child(userName).setValue(userClass);
            }
        });





        regSignIn = findViewById(R.id.signup_screen);

        regSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this,login.class);
                startActivity(intent);
            }
        });







        getSupportActionBar().hide();
        // init constraintLayout
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        // initializing animation drawable by getting background from constraint layout
        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        // setting enter fade animation duration to 5 seconds
        animationDrawable.setEnterFadeDuration(4000);
        // setting exit fade animation duration to 2 seconds
        animationDrawable.setExitFadeDuration(2000);
    }







   /*private Boolean validateName() {
        String val = regName.getEditText().getText().toString();

        if (val.isEmpty())
        {
            regName.setError("Field cannot be empty");
            return false;
        }

        else
        {
            regName.setError(null);
            regName.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validateUserName() {
        String val = regUserName.getEditText().getText().toString();
        String noWhiteSpaces = "\\A\\w{4,20}\\z";

        if (val.isEmpty())
        {
            regName.setError("Field cannot be empty");
            return false;
        }

        else if (val.length()>=15)
        {
            regName.setError("Username too long");
            return false;
        }

        else if (!val.matches(noWhiteSpaces))
        {
            regName.setError("White spaces not allowed");
            return false;
        }

        else
        {
            regName.setError(null);
            regName.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validateEmail() {
        String val = regEmail.getEditText().getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+[a-z]+\\.+[a-z]+";

        if (val.isEmpty())
        {
            regName.setError("Field cannot be empty");
            return false;
        }

        else if (!val.matches(emailPattern))
        {
            regName.setError("Invalid Email ID");
            return false;
        }

        else
        {
            regName.setError(null);
            regName.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePhoneNumber() {
        String val = regPhoneNumber.getEditText().getText().toString();

        if (val.isEmpty())
        {
            regName.setError("Field cannot be empty");
            return false;
        }

        else
        {
            regName.setError(null);
            regName.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = regPassword.getEditText().getText().toString();
        String passwordVal = "^" + "(?=.*[a-zA-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\s+$)" + ".{4,}" + "$";

        if (val.isEmpty())
        {
            regName.setError("Field cannot be empty");
            return false;
        }

        else if (!val.matches(passwordVal))
        {
            regName.setError("Password is too weak");
            return false;
        }

        else
        {
            regName.setError(null);
            regName.setErrorEnabled(false);
            return true;
        }
    }

    public void registerUser(View view) {
        if (!validateName() | !validateUserName() | !validateEmail() | !validatePassword() | !validatePhoneNumber())
            return;

        String name = regName.getEditText().getText().toString();
        String userName = regUserName.getEditText().getText().toString();
        String email = regEmail.getEditText().getText().toString();
        String phoneNo = regPhoneNumber.getEditText().getText().toString();
        String password = regPassword.getEditText().getText().toString();

        UserClass userClass = new UserClass(name, userName, email, phoneNo, password);
        reference.child(userName).setValue(userClass);
    }    */



    @Override
    protected void onResume() {
        super.onResume();
        if (animationDrawable != null && !animationDrawable.isRunning()) {
            // start the animation
            animationDrawable.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (animationDrawable != null && animationDrawable.isRunning()) {
            // stop the animation
            animationDrawable.stop();
        }
    }


}