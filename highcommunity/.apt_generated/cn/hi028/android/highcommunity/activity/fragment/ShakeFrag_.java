//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package cn.hi028.android.highcommunity.activity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cn.hi028.android.highcommunity.R.layout;
import cn.hi028.android.highcommunity.view.CustomList;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ShakeFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ShakeFrag
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.frag_shake, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        contentView_ = null;
        super.onDestroyView();
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static ShakeFrag_.FragmentBuilder_ builder() {
        return new ShakeFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        img_shake = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_shake_center));
        cl_shake_list = ((CustomList) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.cl_shake_list));
        ll_shake_list = ((LinearLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_shake_list));
        img_shake_time = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_shake_time));
        img_shake_more = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_shake_more));
        fl_shake = ((FrameLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.fl_shake));
        if (img_shake_more!= null) {
            img_shake_more.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ShakeFrag_.this.onMore();
                }

            }
            );
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ShakeFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ShakeFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ShakeFrag build() {
            ShakeFrag_ fragment_ = new ShakeFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
