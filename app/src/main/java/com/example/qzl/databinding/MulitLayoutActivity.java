package com.example.qzl.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.qzl.databinding.databinding.ActivityMulitBinding;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Qzl on 2016-08-29.
 */
public class MulitLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mulit);
        ActivityMulitBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_mulit);
        User user = new User(this);
        user.setName("用户名");
        user.setNickname("昵称");
        user.setEmail("1@qq.com");
        user.setLevel(5);
        user.setIcon("http://pic.4j4j.cn/upload/pic/20130909/681ebf9d64.jpg");
        user.setVip(true);

        User user1 = new User(this);
        user1.setName("新人");
        user1.setNickname("姓名");
        user1.setEmail("2539999999@qq.com");
        user1.setLevel(2);
        user1.setVip(false);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        binding.setUsers(users);
    }
}
