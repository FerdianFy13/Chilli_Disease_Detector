package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {
    private Button btnsignup;
    private EditText user_signup, pass_signup;
    private String username2, password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        displayView();
        setData2();
    }

    public void displayView() {
        // declaration method displayView on set data2 setup
        btnsignup = findViewById(R.id.btn_sigin1);
        user_signup = findViewById(R.id.user_signup);
        pass_signup = findViewById(R.id.pass_signup);
    }

    public void setData2() {
        // button signup to intenr LoginActivity
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setData user_signup in variable username
                username2 = user_signup.getText().toString();
                password2 = pass_signup.getText().toString();

                // action onClick btnsignup
                Intent intensignup1 = new Intent(SignupActivity.this, LoginActivity.class);
                intensignup1.putExtra("username", username2);
                intensignup1.putExtra("password", password2);
                startActivity(intensignup1);
            }
        });
    }
}