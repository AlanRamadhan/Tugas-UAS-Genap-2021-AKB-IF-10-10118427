package com.example.a10118427_wisata.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.a10118427_wisata.R;

/** NIM : 10118427
 * Nama : Alan Ramadhan
 * Kelas : IF-10
 * Tanggal : 09-08-2021 - 13-08-2021**/

public class ProfileActivity extends Fragment {
    public ProfileActivity () {


    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.activity_profile, container, false);



    }


    }
