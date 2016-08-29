package com.example.qzl.databinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Qzl on 2016-08-29.
 */
public class CommonAdapter<T> extends BaseAdapter {
    private Context mContext;
    private List<T> mTList;
    private int mLayoutId;
    private int variableId;

    public CommonAdapter(Context context, List<T> TList, int layoutId, int variableId) {
        mContext = context;
        mTList = TList;
        mLayoutId = layoutId;
        this.variableId = variableId;
    }

    @Override
    public int getCount() {
        return mTList.size();
    }

    @Override
    public Object getItem(int position) {
        return mTList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding binding = null;
        if (convertView == null){
            binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), mLayoutId, parent, false);
        }else {
            binding = DataBindingUtil.getBinding(convertView);
        }
        binding.setVariable(variableId,mTList.get(position));
        return binding.getRoot();
    }
}
