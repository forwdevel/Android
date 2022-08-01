package com.example.test7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.radioGroup01);
        rb1 = findViewById(R.id.radio01);
        rb2 = findViewById(R.id.radio02);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (radioGroup.indexOfChild(findViewById(checkedId))){
                    case 0:
                        Toast.makeText(getApplicationContext(),R.string.msg_change1, Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(getApplicationContext(), R.string.msg_change2, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onSelectButtonClicked(View view) {
        if(rb1.isChecked() == true) {
            Toast.makeText(getApplicationContext(), R.string.msg_button1, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), R.string.msg_button2, Toast.LENGTH_LONG).show();
        }
    }
}