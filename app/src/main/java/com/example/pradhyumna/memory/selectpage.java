package com.example.pradhyumna.memory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class selectpage extends AppCompatActivity {
Button bt1,bt2,bt3;
TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectpage);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        tv2=findViewById(R.id.tv2);
        Animation an= AnimationUtils.loadAnimation(selectpage.this , R.anim.text);

        bt1.startAnimation(an);
        bt2.startAnimation(an);
        tv2.startAnimation(an);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(selectpage.this , inst.class);
                startActivity(i3);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent(selectpage.this,nameenter.class);
                startActivity(i1);

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }
        });
    }
}
