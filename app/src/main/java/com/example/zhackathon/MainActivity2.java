package com.example.zhackathon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button l,s,ts,us;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        l=(Button) findViewById(R.id.BLogIn);
        s=(Button)findViewById(R.id.BSignUp);
        ts=(Button)findViewById(R.id.BSignTr);
        us=(Button)findViewById(R.id.BSignC);

        ts.setVisibility(View.INVISIBLE);
        ts.setClickable(false);
        us.setVisibility(View.INVISIBLE);
        us.setClickable(false);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, LogIn.class));
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s.setVisibility(View.INVISIBLE);
                s.setClickable(false);
                l.setVisibility(View.INVISIBLE);
                l.setClickable(false);

                ts.setVisibility(View.VISIBLE);
                ts.setClickable(true);
                us.setVisibility(View.VISIBLE);
                us.setClickable(true);
            }
        });

        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity2.this, SignUpT.class));
            }
        });
        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity2.this, SignUpU.class));
            }
        });
    }
}
