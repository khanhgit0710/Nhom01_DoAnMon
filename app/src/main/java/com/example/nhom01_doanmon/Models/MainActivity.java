package com.example.nhom01_doanmon.Models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nhom01_doanmon.R;

public class MainActivity extends AppCompatActivity {

    Button button_welcome   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sign_in);

//        button_welcome = findViewById(R.id.button_welcome);
//        button_welcome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Sign_in.class);
//                startActivity(intent);
//            }
//        });
    }
}