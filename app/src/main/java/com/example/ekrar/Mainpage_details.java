package com.example.ekrar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Mainpage_details extends Fragment {
    private Mainpage_details myProjectListFragment;

    public Mainpage_details() {
    }
    public static Mainpage_details newInstance() {
        Mainpage_details emp = new Mainpage_details();
        return emp;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_mainpage_details, container, false);
//        FrameLayout frameLayout = (FrameLayout) container.findViewById(R.id.frameLayout);


        return view;
    }

    }
