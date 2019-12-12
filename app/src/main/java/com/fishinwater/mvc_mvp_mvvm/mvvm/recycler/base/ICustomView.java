package com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.base;

/**
 * @author fishinwater-1999
 * @date :2019/12/12 19:28
 */
public interface ICustomView<S extends BaseCustomViewModel> {

    void setData(S data);

}
