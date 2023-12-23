package com.example.nhom01_doanmon.Models;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nhom01_doanmon.R;

public class Sign_in_Activity extends AppCompatActivity {
        private EditText txt_TenDangNhap, txt_MatKhau;
        private Button btn_Dangnhap;
        private TextView tv_QuenMatKhau, tv_TaoTaiKhoan;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_sign_in);

            txt_TenDangNhap = findViewById(R.id.txt_TenDangNhap);
            txt_MatKhau = findViewById(R.id.txt_MatKhau);
            btn_Dangnhap = findViewById(R.id.btn_Dangnhap);
            tv_QuenMatKhau = findViewById(R.id.tv_QuenMatKhau);
            tv_TaoTaiKhoan = findViewById(R.id.tv_TaoTaiKhoan);

            // Xử lý sự kiện khi nhấn nút Đăng nhập
            btn_Dangnhap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = txt_TenDangNhap.getText().toString();
                    String password = txt_MatKhau.getText().toString();
                    if (username.equals("your_username") && password.equals("your_password")) {
                        Intent intent = new Intent(Sign_in_Activity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(Sign_in_Activity.this, "Tên hoặc mật khẩu không úng", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            // Xử lý sự kiện khi nhấn vào "Quên mật khẩu"
            tv_QuenMatKhau.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            tv_TaoTaiKhoan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Sign_in_Activity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }
}
