package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;
    //추가 코드
    boolean firstPic = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.green1);
        int bitmapwidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapwidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
    public void onButtonClicked(View v) {
        changeImage();
    }

    private void changeImage() {
        Resources res = getResources();
        if(firstPic) {
            bitmap = (BitmapDrawable)res.getDrawable(R.drawable.green2);
            firstPic = false;
        } else {
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.green1);
            firstPic = true;
        }

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width= bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
}