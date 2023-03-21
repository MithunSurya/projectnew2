package com.ms.projectnew;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;

    Animation topanimation,bottomanimation;
    ImageView image;
    TextView log,slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topanimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.image);
        log = findViewById(R.id.log);
        slogan = findViewById(R.id.slogan);

        image.setAnimation(topanimation);
        log.setAnimation(bottomanimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Signup.class);

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View, String>(image, "logo_image");
                pairs[1] = new Pair<View, String>(log, "logo_text");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
                startActivity(intent, options.toBundle());
                finish();
            }
        },SPLASH_SCREEN);


    }
}