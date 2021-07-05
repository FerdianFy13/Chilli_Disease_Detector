package com.example.cddteam.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cddteam.DashboardBercakDaunActivity;
import com.example.cddteam.DashboardBusukBuahActivity;
import com.example.cddteam.DashboardBusukDaunActivity;
import com.example.cddteam.DashboardLayuActivity;
import com.example.cddteam.DashboardVirusGeminiActivity;
import com.example.cddteam.DashboardVirusKuningActivity;
import com.example.cddteam.R;

public class DashboardFragment extends Fragment {
    Button btnm1, btnm2, btnm3, btnm4, btnm5, btnm6;

    public DashboardFragment() {
        // dashboard constructor fragment to scroolbar layout
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        btnm1 = view.findViewById(R.id.btn_dash1);
        btnm2 = view.findViewById(R.id.btn_dash2);
        btnm3 = view.findViewById(R.id.btn_dash3);
        btnm4 = view.findViewById(R.id.btn_dash4);
        btnm5 = view.findViewById(R.id.btn_dash5);
        btnm6 = view.findViewById(R.id.btn_dash6);

        btnm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DashboardBusukDaunActivity.class);
                startActivity(intent);
            }
        });

        btnm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DashboardLayuActivity.class);
                startActivity(intent);
            }
        });

        btnm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DashboardVirusKuningActivity.class);
                startActivity(intent);
            }
        });

        btnm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DashboardVirusGeminiActivity.class);
                startActivity(intent);
            }
        });

        btnm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DashboardBercakDaunActivity.class);
                startActivity(intent);
            }
        });

        btnm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DashboardBusukBuahActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}