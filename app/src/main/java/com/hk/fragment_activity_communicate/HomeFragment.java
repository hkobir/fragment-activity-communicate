package com.hk.fragment_activity_communicate;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    private AppCompatButton setBtn;
    private SetProfileListener setProfileListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        setBtn = view.findViewById(R.id.setBtn);
        setBtn.setOnClickListener(v -> setProfileListener.onNameChanged("Humayun Kobir"));
        return view;

    }

    // This method insures that the Activity has actually implemented our
    // listener and that it isn't null.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof SetProfileListener) {
            setProfileListener = (SetProfileListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement SetProfileListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        setProfileListener = null;
    }
}