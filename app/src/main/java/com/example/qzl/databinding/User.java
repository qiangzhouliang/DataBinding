package com.example.qzl.databinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

/**
 * BaseObservable ： 观察者的继承
 * Created by Qzl on 2016-08-28.
 */
public class User extends BaseObservable {
    private Context mContext;
    private String name;
    private String nickname;
    private String email;

    private int level;
    private boolean vip;

    private String icon;


    public User(Context context) {
        mContext = context;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * @Bindable : 表示getName会被观察得到
     * @return
     */
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //刷新
        notifyPropertyChanged(com.example.qzl.databinding.BR.name);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 注意： 一定要和onclick对应，形式一样
     * 个数和参数类型相同，返回结果相同
     * @param view
     */
    public void clickName(View view){
        Toast.makeText(view.getContext(), "点击用户名 : " + name, Toast.LENGTH_SHORT).show();
    }

    public boolean longClickNickName(View view){
        Toast.makeText(view.getContext(), "长按昵称 : " + nickname, Toast.LENGTH_SHORT).show();
        return true;
    }

    //启动下一activity
    public void btnName(View view){
        mContext.startActivity(new Intent(mContext,MulitLayoutActivity.class));
    }
    //启动下一ListActivity
    public void btnListName(View view){
        mContext.startActivity(new Intent(mContext,ListViewActivity.class));
    }

    public void click(View view){
        setName(getName() + "(已点击)");
    }
}
