package com.cbalt.ejercicio;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class LuckyFragment extends Fragment {


    public LuckyFragment() {
        // Required empty public constructor
    }


    public static LuckyFragment newInstance() {
        return new LuckyFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CheckBox happyCheckbox = view.findViewById(R.id.luckyHappyCheckbox);
        final CheckBox moodCheckbox = view.findViewById(R.id.luckyMoodCheckbox);
        Button button = view.findViewById(R.id.luckyButton);

        happyCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                moodCheckbox.setChecked(isChecked);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean answer = moodCheckbox.isChecked();
            }
        });
    }
}
