package com.example.all_purpose;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.all_purpose.adapter.MyAdapter;
import com.example.all_purpose.adapter.MyPagerAdapter;
import com.example.all_purpose.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewPager pager;
    private List<MyFragment> list;
    private MyAdapter adapter;
    LinearLayout up_layout;
    private TextView tv_music,tv_read;
    private TextView textView[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_0);
        initView();
        initFragment();


    }

    private void initFragment() {
        adapter = new MyAdapter(list,getSupportFragmentManager());
        up_layout = findViewById(R.id.up_content);
        textView = new TextView[3];
        up_layout = findViewById(R.id.up_content);
        for (int i = 0;i<3;i++){
            if (i==1){
                continue;
            }
            textView[i] = (TextView) up_layout.getChildAt(i);
            textView[i].setTag(i);
            textView[i].setTextColor(Color.BLACK);

            textView[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int item = (int) v.getTag();
                    pager.setCurrentItem(item);
                    for (int i1=0;i1<3;i1++){
                        if (i1 == 1){
                            continue;
                        }
                        textView[i1].setTextColor(Color.BLACK);
                    }
                    textView[item].setTextColor(Color.WHITE);
                }
            });
            textView[0].setTextColor(Color.WHITE);

            pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }

    private void initView() {
        pager = findViewById(R.id.pager);
        tv_music = findViewById(R.id.fragment_music);
        tv_read = findViewById(R.id.fragment_read);
        tv_read.setOnClickListener(this);
        tv_music.setOnClickListener(this);
        list = new ArrayList<>();
        list.add(new MyFragment());
        list.add(new MyFragment());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fragment_music:

                break;
            case R.id.fragment_read:
                break;
            default:
                break;
        }
    }
}