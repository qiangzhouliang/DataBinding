package com.example.qzl.databinding.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.qzl.databinding.R;

/**
 * 使用自定义属性来执行我们想要的效果
 * @BindingAdapter({"imageUrl"}) : 所有非static的都必须有一个对象，而这个对象有Component提供
 * Created by Qzl on 2016-08-29.
 */
public class Utils {
    //第一种 静态，可以直接用
    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view,String url){
        if (url == null){
            view.setImageResource(R.mipmap.ic_launcher);
        }else {
            Glide.with(view.getContext()).load(url).into(view);
        }
    }

    //第二种 ； 非静态，不能直接用，在activity设置 DataBindingUtil.setDefaultComponent(new MyComponter());
    //还要初始化对象 ： 在 MyComponter implements android.databinding.DataBindingComponent
    @BindingAdapter({"imageUrll"})
    public void loadImages(ImageView view,String url){
        if (url == null){
            view.setImageResource(R.mipmap.ic_launcher);
        }else {
            Glide.with(view.getContext()).load(url).into(view);
        }
    }
}
