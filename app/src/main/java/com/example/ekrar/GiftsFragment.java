package com.example.ekrar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GiftsFragment extends Fragment {
Button btn;
    public GiftsFragment() {
    }
    public static GiftsFragment newInstance() {
        GiftsFragment emp = new GiftsFragment();
        return emp;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.gifts_fragment, container, false);
         btn=(Button)view.findViewById(R.id.bottom_navigation_view);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"",Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }
}


