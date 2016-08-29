package com.example.qzl.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.qzl.databinding.databinding.ActivityMainBinding;

/**
 * dataBinding的使用要在build.gradle中配置
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user = new User(this);
        user.setName("用户名");
        user.setNickname("昵称");
        user.setEmail("2539999999@qq.com");
        user.setLevel(5);
        user.setVip(true);
        binding.setUser(user);
    }
}
