package com.example.ekrar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ekrar.Mainpage;
import com.example.ekrar.Mainpage_details;
import com.example.ekrar.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class Main_bar extends AppCompatActivity {
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bar);
        toolbar = getSupportActionBar();
        // load the store fragment by default
        toolbar.setTitle("Shop");
        loadFragment(new Mainpage_details());
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_main:
                    toolbar.setTitle("Shop");
                    fragment = new Mainpage_details();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_profile:
                    toolbar.setTitle("My Gifts");
                    fragment = new GiftsFragment();
                    loadFragment(fragment);
                    return true;
//                case R.id.navigation_cart:
//                    toolbar.setTitle("Cart");
//                    fragment = new CartFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.navigation_notif:
//                    toolbar.setTitle("Profile");
//                    fragment = new ProfileFragment();
//                    loadFragment(fragment);
//                    return true;
//            }
            }
            return false;
        }
    };
    public void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

