package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cddteam.ui.dashboard.DashboardFragment;

public class MainActivity extends AppCompatActivity {
    private TextView txtUsername;
    private Button btnmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmain = findViewById(R.id.btn_main);
        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMain = new Intent(MainActivity.this, BottomActivity.class);
                startActivity(intentMain);

            }
        });
    }
}