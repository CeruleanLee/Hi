//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package cn.hi028.android.highcommunity.activity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import net.duohuo.dhroid.view.AutoScrollViewPager;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ServiceTenDetailFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ServiceTenDetailFrag
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
            contentView_ = inflater.inflate(layout.fragment_ser_tenement_detail, container, false);
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

    public static ServiceTenDetailFrag_.FragmentBuilder_ builder() {
        return new ServiceTenDetailFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_tenement_level = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_level));
        tv_vallage_apartment = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_vallage_apartment));
        tv_tenement_size = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_size));
        viewPager = ((AutoScrollViewPager) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.view_pager));
        tv_tenement_area = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_area));
        tv_tenement_type = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_type));
        tv_current_page = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_current_page));
        tv_tenement_price = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_price));
        tv_tenement_call = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_call));
        tv_tenement_vallage = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_vallage));
        tv_vallage_name = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_vallage_name));
        tv_tenement_zhuangxiu = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_zhuangxiu));
        tv_tenement_info = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_info));
        tv_tenement_name = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_tenement_name));
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ServiceTenDetailFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ServiceTenDetailFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ServiceTenDetailFrag build() {
            ServiceTenDetailFrag_ fragment_ = new ServiceTenDetailFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
