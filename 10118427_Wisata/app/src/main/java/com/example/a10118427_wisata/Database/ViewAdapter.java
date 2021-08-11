package com.example.a10118427_wisata.Database;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/** NIM : 10118427
 * Nama : Alan Ramadhan
 * Kelas : IF-10
 * Tanggal : 09-08-2021 - 12-08-2021**/

public class ViewAdapter extends FragmentPagerAdapter {
    public final List<Fragment> mFragmentList = new ArrayList<>();

    public ViewAdapter(FragmentManager manager){
        super(manager);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
