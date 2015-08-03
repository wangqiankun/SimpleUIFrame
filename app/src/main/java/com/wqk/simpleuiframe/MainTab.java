package com.wqk.simpleuiframe;


import com.wqk.simpleuiframe.fragment.HomeFragment;
import com.wqk.simpleuiframe.fragment.MessageFragment;
import com.wqk.simpleuiframe.fragment.MineFragment;

/**
 * Created by wqk on 15/7/30.
 *
 */
public enum MainTab {
    HOME(0, R.string.tab_name_home, R.drawable.tab_icon_home, HomeFragment.class),
    MESSAGE(1, R.string.tab_name_message, R.drawable.tab_icon_message, MessageFragment.class),
    MINE(2, R.string.tab_name_mine, R.drawable.tab_icon_mine, MineFragment.class);

    private int idx;
    private int resName;
    private int resIcon;
    private Class<?> clz;

    MainTab(int idx, int resName, int resIcon, Class<?> clz) {
        this.idx = idx;
        this.resName = resName;
        this.resIcon = resIcon;
        this.clz = clz;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }

}
