package com.example.test9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ib = findViewById(R.id.imageButton);
    }
    
    public void onImageButton1Clicked(View view) {
        Toast.makeText(getApplicationContext(), "Image button Clicked!", Toast.LENGTH_SHORT).show();
    }
}