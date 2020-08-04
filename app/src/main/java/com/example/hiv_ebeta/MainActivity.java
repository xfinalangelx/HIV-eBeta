package com.example.hiv_ebeta;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.example.hiv_ebeta.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button nextBtn;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottieAnimationView);
        lottieAnimationView.setVisibility(View.VISIBLE);
        lottieAnimationView.setAnimation("4096-heal.json");
        lottieAnimationView.loop(true);
        lottieAnimationView.playAnimation();

        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
    }

    public void openLogin(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


}