package com.example.pradhyumna.memory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nameenter extends AppCompatActivity {
EditText et1 , et2;
Button bt__10;
String a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nameenter);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        bt__10 = findViewById(R.id.bt__10);
        bt__10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(nameenter.this,gamepage.class);
                i.putExtra("a",et1.getText().toString());
                i.putExtra("b",et2.getText().toString());
                startActivity(i);
            }
        });


    }
}
