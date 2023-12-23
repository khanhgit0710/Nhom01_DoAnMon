package com.example.nhom01_doanmon.Models;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nhom01_doanmon.R;

public class Sign_up_Activity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword, editTextPhone;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sign_up);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextPhone = findViewById(R.id.editTextPhone);
        buttonSignUp = findViewById(R.id.buttonSignUp);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editTextUsername.getText().toString();
                String passWord = editTextPassword.getText().toString();
                String phoneNumber = editTextPhone.getText().toString();

                if (userName.isEmpty() || passWord.isEmpty() || phoneNumber.isEmpty()) {
                    Toast.makeText(Sign_up_Activity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                
                if (passWord.length() < 6) {
                    Toast.makeText(Sign_up_Activity.this, "Mật khẩu phải nhiều hơn 6 chữ số", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(Sign_up_Activity.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Sign_up_Activity.this, Sign_in_Activity.class);
                // startActivity(intent);
            }
        });
    }
}
