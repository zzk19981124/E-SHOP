package com.example.all_purpose.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

/**
 * @author hello word
 * @desc ViewPager适配器
 * @date 2021/7/15
 */
public class MyPagerAdapter extends PagerAdapter {
    private ArrayList<View> mArrayList;

    public MyPagerAdapter(){

    }

    public MyPagerAdapter(ArrayList<View> arrayList) {
        super();
        mArrayList = arrayList;
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mArrayList.get(position));
        return mArrayList.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(mArrayList.get(position));
    }
}
