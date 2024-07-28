package com.example.zhackathon;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import java.util.ArrayList;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class JobOffer extends AppCompatActivity {

    Button msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_job_offer);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        msg=(Button) findViewById(R.id.msg);

        ImageSlider imageSlider = findViewById(R.id.image_slider1); // Initialize imageSlider

        //if (imageSlider == null) {painter3
        //    throw new NullPointerException("ImageSlider is null. Check the ID in the layout file.");
        //}

        ArrayList <SlideModel> imageList = new ArrayList<>(); // Create image list
        imageList.add(new SlideModel(R.drawable.painter1, "", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.painter2, "", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.painter3, "", ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);
        //imageSlider.setSlideAnimation(AnimationTypes.ZOOM_OUT);

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JobOffer.this, chatBox.class));
            }
        });
    }


}

