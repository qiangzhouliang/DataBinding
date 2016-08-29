package com.example.qzl.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.qzl.databinding.adapter.CommonAdapter;
import com.example.qzl.databinding.databinding.ActivityMlistBinding;
import com.example.qzl.databinding.util.MyComponter;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mlist);
        DataBindingUtil.setDefaultComponent(new MyComponter());
        ActivityMlistBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_mlist);

        List<User> users = getDataList();
        CommonAdapter<User> adapter = new CommonAdapter<>(this, users, R.layout.item, com.example.qzl.databinding.BR.user);
        binding.setAdapter(adapter);
    }

    public List<User> getDataList(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User(this);
            user.setName("user "+i);
            user.setIcon("http://pic.4j4j.cn/upload/pic/20130909/681ebf9d64.jpg");
            users.add(user);
        }
        return users;
    }
}
