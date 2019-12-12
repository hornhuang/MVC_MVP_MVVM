package com.fishinwater.mvc_mvp_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.fishinwater.mvc_mvp_mvvm.clazz.Account;
import com.fishinwater.mvc_mvp_mvvm.databinding.ActivityMainBinding;
import com.fishinwater.mvc_mvp_mvvm.mvvm.MVVMActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.tvIfo.setText("binding textView");

        account = new Account();
        account.setName("MVVM");
        account.setIntroduce("data Binding");
        binding.setAccount(account);

        binding.setActivity(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.data_binding:
                String introduce = account.getIntroduce();
                account.setIntroduce(introduce + "data Bing");
                break;
            case R.id.mvc:
                onMVC();
                break;
            case R.id.mvp:
                onMVP();
                break;
            case R.id.mvvm:
                onMVVM();
                break;
            default:
                // type something here
                break;
        }
    }

    private void onMVC() {
        // do something here
        Toast.makeText(this, "onMVC", Toast.LENGTH_SHORT).show();
    }

    private void onMVP() {
        // do something here
        Toast.makeText(this, "onMVP", Toast.LENGTH_SHORT).show();
    }

    private void onMVVM() {
        MVVMActivity.actionStart(this);
    }
}
