package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cddteam.ui.help.HelpFragment;

public class HelpFeedbackActivity extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_feedback);

        // deklarasi button
        btn1 = findViewById(R.id.btn_fedd);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HelpFeedbackActivity.this, HelpFeedbackActivity.class);
                startActivity(intent);
            }
        });
    }
}