package com.fishinwater.mvc_mvp_mvvm.clazz;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

/**
 * 自动更新视图
 *
 * @author fishinwater-1999
 * @date :2019/12/8 11:23
 */
public class Account extends BaseObservable {

    private String name;
    private String introduce;

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
        notifyPropertyChanged(BR.introduce);
    }
}
