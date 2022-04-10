package com.deepanshu.fragment.Fragmentshome;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deepanshu.fragment.R;


public class firstFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View View =inflater.inflate(R.layout.fragment_first, container, false);







        return View;
    }
}