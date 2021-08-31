package com.example.all_purpose;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 购物车的实现：
 * 主要功能：1.刷新数据；
 *          2.单选、全选；
 *          3.合计；
 *          4.删除；
 *          5.商品数量加减；
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}