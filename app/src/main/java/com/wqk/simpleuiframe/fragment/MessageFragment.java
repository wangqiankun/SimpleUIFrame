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
 * 消息
 * Created by wqk on 15/7/30.
 */
public class MessageFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText("MessageFragment");
        Log.d("MessageFragment", "onCreateView");
        return textView;

    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("MessageFragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("MessageFragment", "onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MessageFragment", "onDestroy");
    }

}
