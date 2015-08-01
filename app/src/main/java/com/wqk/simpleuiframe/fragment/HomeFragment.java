package com.wqk.simpleuiframe.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wqk.simpleuiframe.base.BaseFragment;

import java.lang.Override;

/**
 * 主页
 * Created by wqk on 15/7/30.
 */
public class HomeFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText("HomeFragment");
        Log.d("HomeFragment", "onCreateView");
        return textView;

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("HomeFragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("HomeFragment", "onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("HomeFragment", "onDestroy");
    }
}
