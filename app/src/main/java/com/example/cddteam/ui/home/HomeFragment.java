package com.example.cddteam.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cddteam.HomeBeritaDuaActivity;
import com.example.cddteam.HomeBeritaEmpatActivity;
import com.example.cddteam.HomeBeritaLimaActivity;
import com.example.cddteam.HomeBeritaSatuActivity;
import com.example.cddteam.HomeBeritaTigaActivity;
import com.example.cddteam.R;

public class HomeFragment extends Fragment {

    Button btn1, btn2, btn3, btn4, btn5;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        btn1 = root.findViewById(R.id.btn_homfr1);
        btn2 = root.findViewById(R.id.btn_homfr2);
        btn3 = root.findViewById(R.id.btn_homfr3);
        btn4 = root.findViewById(R.id.btn_homee4);
        btn5 = root.findViewById(R.id.btn_homee5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomeBeritaSatuActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomeBeritaDuaActivity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomeBeritaTigaActivity.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomeBeritaEmpatActivity.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomeBeritaLimaActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}