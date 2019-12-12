package com.fishinwater.mvc_mvp_mvvm.mvvm;

import android.app.Application;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import com.fishinwater.mvc_mvp_mvvm.callback.BaseCallback;
import com.fishinwater.mvc_mvp_mvvm.clazz.Account;
import com.fishinwater.mvc_mvp_mvvm.databinding.ActivityMvvmBinding;

/**
 * @author fishinwater-1999
 * @date :2019/12/8 12:14
 */
public class MVVMViewModel extends BaseObservable {

    private MVVMModel model;
    private String result;
    private String inoutAccountname;

    /**
     * 传入 Application 对象方便使用 SharePreference
     *
     */
    MVVMViewModel(Application application) {
        this.model = new MVVMModel();
    }

    /**
     * 与 View 绑定的 getData 方法
     */
    public void getData(View view) {
        model.getAccountData(inoutAccountname, new BaseCallback<Account>() {
            @Override
            public void onSuccess(Account obj) {
                String ifo = obj.getName() + " | " + obj.getIntroduce();
                setResult(ifo);
            }

            @Override
            public void onFailed(String err) {
                setResult(err);
            }
        });
    }

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    @Bindable
    public String getInoutAccountname() {
        return inoutAccountname;
    }

    public void setInoutAccountname(String inoutAccountname) {
        this.inoutAccountname = inoutAccountname;
        notifyPropertyChanged(BR.inoutAccountname);
    }
}
