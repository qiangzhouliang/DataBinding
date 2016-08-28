package com.example.qzl.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        User user = new User();
        user.setName("用户名");
        user.setNickname("昵称");
        user.setEmail("2539999999@qq.com");
        binding.setUser(user);
    }
}
