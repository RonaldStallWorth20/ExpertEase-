package com.example.zhackathon;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

         CountDownTimer cd= new CountDownTimer(5000,1000)
        {
            @Override
            public void onTick(long m){}
            @Override
            public void onFinish() {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        };
        cd.start();
    }
}