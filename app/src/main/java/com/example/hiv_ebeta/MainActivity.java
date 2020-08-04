package com.example.hiv_ebeta;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottieAnimationView);
        //startCheckAnimation();
        lottieAnimationView.setVisibility(View.VISIBLE);
        lottieAnimationView.setAnimation("4096-heal.json");
        lottieAnimationView.loop(true);
        lottieAnimationView.playAnimation();
    }

   // private void startCheckAnimation(){
   //     ValueAnimator animator = ValueAnimator.ofFloat(0f,1f).setDuration(10000);
   //     animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
   //         @Override
   //         public void onAnimationUpdate(ValueAnimator animation) {
   //             lottieAnimationView.setProgress((Float)animation.getAnimatedValue());
   //             lottieAnimationView.loop(true);
   //         }
   //     });
//
   //     if(lottieAnimationView.getProgress() == 0f){
   //         animator.setStartDelay(400);
   //         animator.start();
   //     }
   //     else{
   //         lottieAnimationView.setProgress(0f);
   //     }
   // }
}