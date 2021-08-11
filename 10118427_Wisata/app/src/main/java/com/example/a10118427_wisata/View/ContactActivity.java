package com.example.a10118427_wisata.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a10118427_wisata.R;

/** NIM : 10118427
 * Nama : Alan Ramadhan
 * Kelas : IF-10
 * Tanggal : 09-08-2021 - 12-08-2021**/

public class ContactActivity extends Fragment {
    public ContactActivity() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.activity_contact, container, false);

    }

}