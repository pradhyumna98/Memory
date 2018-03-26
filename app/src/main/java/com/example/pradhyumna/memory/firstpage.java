package com.example.pradhyumna.memory;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class firstpage extends AppCompatActivity {
Handler h= new Handler();
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        img = findViewById(R.id.iv);
        Animation ani = AnimationUtils.loadAnimation(firstpage.this , R.anim.logo);
        img.startAnimation(ani);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(firstpage.this,selectpage.class);
                startActivity(i);

            }
        },3000);
    }
}
