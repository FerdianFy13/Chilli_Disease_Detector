package com.example.cddteam.ui.about;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cddteam.LoginActivity;
import com.example.cddteam.R;

public class AboutFragment extends Fragment {
    Button btncc;

    public AboutFragment() {
        // about constructor fragment to scroolbar layout
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        btncc = view.findViewById(R.id.btn_aboutinforman);
        btncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        return  view;
    }
}