package com.example.myapplication2;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentImge#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentImge extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        Activity activity = Objects.requireNonNull(getActivity());

        View view = inflater.inflate(R.layout.fragment_imge,container,false);


        return inflater.inflate(R.layout.fragment_imge, container, false);
    }
}