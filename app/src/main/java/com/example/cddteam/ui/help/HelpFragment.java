package com.example.cddteam.ui.help;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cddteam.HelpAlgoritmaActivity;
import com.example.cddteam.HelpFeedbackActivity;
import com.example.cddteam.HelpIterasiActivity;
import com.example.cddteam.HelpKlasifikasiActivity;
import com.example.cddteam.HelpMetodeActivity;
import com.example.cddteam.HelpPenyakitActivity;
import com.example.cddteam.HelpTujuanActivity;
import com.example.cddteam.R;


public class HelpFragment extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    public HelpFragment() {
        // Help constructor fragment to scroolbar layout
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help, container, false);

        // deklarasi button fragment parsing to activity layout
        btn1 = view.findViewById(R.id.btn_help1);
        btn2 = view.findViewById(R.id.btn_help2);
        btn3 = view.findViewById(R.id.btn_help3);
        btn4 = view.findViewById(R.id.btn_help4);
        btn5 = view.findViewById(R.id.btn_help5);
        btn6 = view.findViewById(R.id.btn_help6);
        btn7 = view.findViewById(R.id.btn_help7);

        // set on click button move between layout btn1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpIterasiActivity.class);
                startActivity(intent);
            }
        });

        // set on click button move between layout btn2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpPenyakitActivity.class);
                startActivity(intent);
            }
        });

        // set on click button move between layout btn3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpMetodeActivity.class);
                startActivity(intent);
            }
        });

        // set on click button move between layout btn4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpTujuanActivity.class);
                startActivity(intent);
            }
        });

        // set on click button move between layout btn5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpAlgoritmaActivity.class);
                startActivity(intent);
            }
        });

        // set on click button move between layout btn6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpKlasifikasiActivity.class);
                startActivity(intent);
            }
        });

        // set on click button move between layout btn6
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpFeedbackActivity.class);
                startActivity(intent);
            }
        });

        return  view;
    }
}