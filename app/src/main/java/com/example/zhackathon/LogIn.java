package com.example.zhackathon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    Button mp,l;
    TextView u,p;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_li);

        mp=(Button)findViewById(R.id.BMainL);
        u=(TextView)findViewById(R.id.TLogU);
        p=(TextView)findViewById(R.id.TLogP);
        l=(Button) findViewById(R.id.BLogL);

        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogIn.this, MainActivity2.class));
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                u.setText("");
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.setText("");
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username =u.getText().toString();
                String Password =p.getText().toString();

                if (Username.isEmpty()||Password.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Please fill in all details", Toast.LENGTH_SHORT).show();
                }
                    else {
                    startActivity(new Intent(LogIn.this, FYPf.class));///change 2nd class
                }
            }
        });

    }
}
