package com.wqk.simpleuiframe.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;import java.lang.Override;

/**
 * BaseFragment
 * Created by wqk on 15/8/1.
 *
 * 切换Fragment后会调用上个Fragment中的onPause方法，
 * 接着调用新Fragment的onCreateView和onResume方法
 * 退出应用，会调用所有Create的Fragment的onDestroy方法
 */
public class BaseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("BaseFragment","onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BaseFragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BaseFragment", "onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BaseFragment", "onDestroy");
    }
}
