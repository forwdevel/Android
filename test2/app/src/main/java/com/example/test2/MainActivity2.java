package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onbackbtnClicked(View v) {
        Toast.makeText(getApplicationContext(),"돌아가기 버튼을 누름", Toast.LENGTH_LONG).show();
        finish();
    }

}
