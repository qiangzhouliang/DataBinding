package com.example.qzl.databinding.util;

/**
 * Created by Qzl on 2016-08-29.
 */
public class MyComponter implements android.databinding.DataBindingComponent {

    private Utils mUtils;
    @Override
    public Utils getUtils() {
        if (mUtils == null){
            mUtils = new Utils();
        }
        return mUtils;
    }
}
