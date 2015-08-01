package com.wqk.simpleuiframe;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.wqk.simpleuiframe.base.BaseActivity;
import com.wqk.simpleuiframe.fragment.HomeFragment;
import com.wqk.simpleuiframe.fragment.MessageFragment;
import com.wqk.simpleuiframe.fragment.MineFragment;

/**
 * MainActivity
 * Created by wqk on 15/7/30.
 */
public class MainActivity extends BaseActivity {

    private String texts[] = {"首页", "消息", "我的"};
    private int imageButton[] = {
            R.drawable.tab_icon_home, R.drawable.tab_icon_message, R.drawable.tab_icon_mine};
    private Class fragmentArray[] = {HomeFragment.class, MessageFragment.class, MineFragment.class};

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

        for (int i = 0; i < texts.length; i++) {
            TabHost.TabSpec spec = fragmentTabHost.newTabSpec(texts[i]).setIndicator(SetTabContent(i));

            fragmentTabHost.addTab(spec, fragmentArray[i], null);

            //设置背景(必须在addTab之后，由于需要子节点（底部菜单按钮）否则会出现空指针异常)
            fragmentTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.tab_icon_home);
        }
    }


    private View SetTabContent(int i) {
        //取得布局实例
        View view = View.inflate(MainActivity.this, R.layout.tabcontent, null);

        //取得布局对象
        ImageView imageView = (ImageView) view.findViewById(R.id.tab_icon);
        TextView textView = (TextView) view.findViewById(R.id.tab_title);

        //设置图标
        imageView.setImageResource(imageButton[i]);
        //设置标题
        textView.setText(texts[i]);
        return view;
    }
}
