package com.fishinwater.mvc_mvp_mvvm.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.fishinwater.mvc_mvp_mvvm.R;
import com.fishinwater.mvc_mvp_mvvm.databinding.ActivityMainBinding;
import com.fishinwater.mvc_mvp_mvvm.databinding.ActivityMvvmBinding;

public class MVVMActivity extends AppCompatActivity {

    ActivityMvvmBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        MVVMViewModel viewModel = new MVVMViewModel(getApplication());
        binding.setViewmodel(viewModel);
    }

    public static void actionStart(Activity activity) {
        activity.startActivity(new Intent(activity, MVVMActivity.class));
    }
}
