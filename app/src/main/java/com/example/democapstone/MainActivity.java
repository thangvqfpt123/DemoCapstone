package com.example.democapstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables
    Animation topAnim, botAnim, midAnim;
    ImageView image, image2, imagefirst, imagesecond, imagethird, imagefouth;
    TextView textView,textView2, tvSignup;
    Button btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        midAnim = AnimationUtils.loadAnimation(this, R.anim.middle_animation);
        //Hooks
        image = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        tvSignup = findViewById(R.id.tv_signup);
        imagefirst = findViewById(R.id.imagefirst);
        imagesecond = findViewById(R.id.imagesecond);
        imagethird = findViewById(R.id.imagethird);
        imagefouth = findViewById(R.id.imagefouth);
        btn_signin = findViewById(R.id.btn_SignIn);
        image.setAnimation(midAnim);
        image2.setAnimation(midAnim);
        textView.setAnimation(midAnim);
        textView2.setAnimation(botAnim);
        tvSignup.setAnimation(botAnim);
        btn_signin.setAnimation(botAnim);
        imagefirst.setAnimation(topAnim);
        imagesecond.setAnimation(topAnim);
        imagethird.setAnimation(topAnim);
        imagefouth.setAnimation(topAnim);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intToSignin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intToSignin);
            }
        });

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intToSignup = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intToSignup);
            }
        });

    }

}