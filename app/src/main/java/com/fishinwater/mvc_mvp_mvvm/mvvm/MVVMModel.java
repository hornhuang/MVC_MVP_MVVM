package com.fishinwater.mvc_mvp_mvvm.mvvm;

import com.fishinwater.mvc_mvp_mvvm.callback.BaseCallback;
import com.fishinwater.mvc_mvp_mvvm.clazz.Account;

import java.util.Random;

/**
 * @author fishinwater-1999
 * @date :2019/12/8 12:14
 */
public class MVVMModel {

    /**
     * 模拟查询账号数据
     */
    public void getAccountData(String name, BaseCallback callback) {
        Random random = new Random();
        boolean isSuccess = random.nextBoolean();
        if (isSuccess) {
            Account account = new Account();
            account.setName(name);
            account.setIntroduce("i am success account");
            callback.onSuccess(account);
        } else {
            callback.onFailed("failed");
        }
    }
}
