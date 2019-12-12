package com.fishinwater.mvc_mvp_mvvm.mvvm.recycler;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.base.BaseCustomViewModel;
import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.base.BaseViewHolder;
import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.picturetitleview.PictureTitleView;
import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.picturetitleview.PictureTitleViewViewModel;
import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.titleview.TitleView;
import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.titleview.TitleViewViewModel;

import java.util.List;

/**
 * @author fishinwater-1999
 * @date :2019/12/12 19:38
 */
public class NewsListViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<BaseCustomViewModel> mItems;
    private final int VIEW_TYPE_PICTURE_TITLE = 1;
    private final int VIEW_TYPE_TITLE = -1;

    NewsListViewAdapter() {}

    void setData(List<BaseCustomViewModel> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_PICTURE_TITLE) {
            PictureTitleView pictureTitleView = new PictureTitleView(parent.getContext());
            return new BaseViewHolder(pictureTitleView);
        } else if (viewType == VIEW_TYPE_TITLE) {
            TitleView titleView = new TitleView(parent.getContext());
            return new BaseViewHolder(titleView);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.bind(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        if (mItems != null && mItems.size() > 0) {
            return mItems.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (mItems.get(position) instanceof PictureTitleViewViewModel) {
            return VIEW_TYPE_PICTURE_TITLE;
        } else if (mItems.get(position) instanceof TitleViewViewModel) {
            return VIEW_TYPE_TITLE;
        }
        return -1;
    }
}
