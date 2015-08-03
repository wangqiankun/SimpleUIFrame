package com.wqk.simpleuiframe;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.wqk.simpleuiframe.base.BaseActivity;

/**
 * MainActivity
 * Created by wqk on 15/7/30.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTabHost();
    }


    // 实例化tabHost
    private void initTabHost() {

        FragmentTabHost fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this, getSupportFragmentManager(), R.id.main_content);
        MainTab[] tabs = MainTab.values();
        final int size = tabs.length;
        for (int i = 0; i < size; i++) {
            MainTab mainTab = tabs[i];
            TabHost.TabSpec tab = fragmentTabHost.newTabSpec(getString(mainTab.getResName()));

            View view = View.inflate(MainActivity.this, R.layout.tabcontent, null); //取得布局对象
            ImageView imageView = (ImageView) view.findViewById(R.id.tab_icon);
            TextView textView = (TextView) view.findViewById(R.id.tab_title);
            imageView.setImageResource(mainTab.getResIcon());   //设置图标
            textView.setText(getString(mainTab.getResName()));  //设置标题

            tab.setIndicator(view);
            fragmentTabHost.addTab(tab, mainTab.getClz(), null);
            //设置背景(必须在addTab之后，由于需要子节点（底部菜单按钮）否则会出现空指针异常)
            fragmentTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.tab_icon_home);
        }
    }

}
