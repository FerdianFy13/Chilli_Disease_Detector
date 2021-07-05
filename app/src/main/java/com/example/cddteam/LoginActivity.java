package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private Button btnlogin, Btnlogin2;
    private EditText etUsername, etPassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // inisialisasi
        btnlogin = findViewById(R.id.btn_login1);
        Btnlogin2 = findViewById(R.id.btn_login2);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        Intent intent = getIntent();

        // login page button 1 (Sign In)
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View BTN1) {
                // setData etUsername in variable username
                username = etUsername.getText().toString();
                password = etPassword.getText().toString();

                // action onClick button1
                Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
                intent1.putExtra("username", username);
                intent1.putExtra("password", password);
                startActivity(intent1);
            }
        });

        // login page button 2 (Sign Up)
        Btnlogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View BTN2) {
                // action onClick button2
                Intent intent2 = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent2);
            }
        });
    }
}