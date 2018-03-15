package com.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button btnScale;
    private Button btnAlpha;
    private Button btnRotate;
    private Button btnTranslate;
    private TextView tvImage;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvImage = (TextView)findViewById(R.id.tvImage);

        btnScale = (Button)findViewById(R.id.btnScale);
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scaleanim);
                tvImage.startAnimation(animation);
            }
        });

        btnAlpha = (Button) findViewById(R.id.btnAlpha);
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alphaanim);
                tvImage.startAnimation(animation);
            }
        });

        btnRotate = (Button) findViewById(R.id.btnRotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotateanim);
                tvImage.startAnimation(animation);
            }
        });

        btnTranslate = (Button) findViewById(R.id.btnTranslate);
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translateanim);
                tvImage.startAnimation(animation);
            }
        });
    }
}
