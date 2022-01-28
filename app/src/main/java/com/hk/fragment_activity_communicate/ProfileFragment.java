package com.hk.fragment_activity_communicate;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProfileFragment extends Fragment {
    private AppCompatTextView nameTV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        nameTV = view.findViewById(R.id.nameTV);
        return view;
    }
    public void setProfile(String name){
        nameTV.setText(name);
    }
}