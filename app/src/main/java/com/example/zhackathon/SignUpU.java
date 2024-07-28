package com.example.zhackathon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpU extends AppCompatActivity {

    Button mp, s;
    TextView u,p,c,pr;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suu);
        mp=(Button) findViewById(R.id.BMainU);
        u=(TextView)findViewById(R.id.TSignUU);
        p=(TextView)findViewById(R.id.TSignPU);
        s=(Button)findViewById(R.id.BSignUpU);
        c=(TextView) findViewById(R.id.TCityU);


        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpU.this,MainActivity2.class));
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

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setText("");
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username =u.getText().toString();
                String Password =p.getText().toString();
                String City=c.getText().toString();

                if (Username.isEmpty() ||Password.isEmpty() ||City.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Please fill in all details", Toast.LENGTH_SHORT).show();
                }
                else if(!Password.isEmpty() && Password.length()<8)
                {
                    Toast.makeText(getApplicationContext(), "Password needs to be at least 8 characters", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(new Intent(SignUpU.this, FYPf.class));///change 2nd class
                }
            }
        });

    }

}
