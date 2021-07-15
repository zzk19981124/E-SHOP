package com.example.all_purpose.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.all_purpose.fragment.MyFragment;

import java.util.List;

/**
 * @author hello word
 * @desc 作用描述
 * @date 2021/7/15
 */
public class MyAdapter extends FragmentPagerAdapter {
    private List<MyFragment> fragment;
    private FragmentManager fm;

    public MyAdapter(List<MyFragment> fragment, FragmentManager fm) {
        super(fm);
        this.fragment = fragment;
        this.fm = fm;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragment.get(position);
    }

    @Override
    public int getCount() {
        return fragment.size();
    }

}
