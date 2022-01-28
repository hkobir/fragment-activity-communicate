package com.hk.fragment_activity_communicate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SetProfileListener {
    private String HOME_TAG = "home_fragment";
    private String PROFILE_TAG = "profile_fragment";
    private HomeFragment homeFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add fragments
        FragmentManager fragmentManager = getSupportFragmentManager();

        homeFragment = (HomeFragment) fragmentManager.findFragmentByTag(HOME_TAG);
        if (homeFragment == null) {
            homeFragment = new HomeFragment();
            fragmentManager.beginTransaction().add(R.id.home_fragment_container, homeFragment, HOME_TAG).commit();
        }

        profileFragment = (ProfileFragment) fragmentManager.findFragmentByTag(PROFILE_TAG);
        if (profileFragment == null) {
            profileFragment = new ProfileFragment();
            fragmentManager.beginTransaction().add(R.id.profilefragment_container, profileFragment, PROFILE_TAG).commit();
        }

    }

    @Override
    public void onNameChanged(String name) {
        profileFragment.setProfile(name);
    }
}