package com.fishinwater.mvc_mvp_mvvm.callback;

import com.fishinwater.mvc_mvp_mvvm.clazz.Account;

/**
 * @author fishinwater-1999
 * @date :2019/12/8 12:27
 */
public interface BaseCallback<T> {

    /**
     * 成功回调
     * @param obj
     */
    void onSuccess(T obj);

    /**
     * 失败回调
     *
     * 有参
     * @param err
     */
    void onFailed(String err);
}
