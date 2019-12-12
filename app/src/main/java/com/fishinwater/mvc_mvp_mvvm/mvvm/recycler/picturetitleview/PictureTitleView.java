package com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.picturetitleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import com.fishinwater.mvc_mvp_mvvm.R;
import com.fishinwater.mvc_mvp_mvvm.databinding.PictureTitleViewBinding;
import com.fishinwater.mvc_mvp_mvvm.databinding.TitleViewBinding;
import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.base.ICustomView;
import com.fishinwater.mvc_mvp_mvvm.mvvm.recycler.titleview.TitleViewViewModel;

/**
 * @author fishinwater-1999
 * @date :2019/12/12 19:32
 */
public class PictureTitleView extends LinearLayout implements ICustomView<PictureTitleViewViewModel> {

    private PictureTitleViewViewModel viewViewModel;
    private PictureTitleViewBinding mBinding;

    public PictureTitleView(Context context) {
        super(context);
        init();
    }

    public PictureTitleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mBinding = DataBindingUtil.inflate(inflater, R.layout.picture_title_view, this, false);
        mBinding.getRoot().setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewViewModel != null && viewViewModel.link != null) {
                    // 跳转到下个 activity link 为值
                }
            }
        });
        addView(mBinding.getRoot());
    }

    public PictureTitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PictureTitleView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * 把 Data 设置进去
     * @param data
     */
    @Override
    public void setData(PictureTitleViewViewModel data) {
        mBinding.setPictureviewmodel(data);
        mBinding.executePendingBindings();
        this.viewViewModel = data;
    }

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String url) {
        if (url != null) {
            // use glide load picture
        }
    }

}
