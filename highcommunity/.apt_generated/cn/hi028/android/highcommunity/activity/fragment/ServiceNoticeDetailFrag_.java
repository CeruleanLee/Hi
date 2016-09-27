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

public final class ServiceNoticeDetailFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ServiceNoticeDetailFrag
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
            contentView_ = inflater.inflate(layout.frag_noticedetails, container, false);
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

    public static ServiceNoticeDetailFrag_.FragmentBuilder_ builder() {
        return new ServiceNoticeDetailFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_NoticeDetails_Progress);
        mNoData = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_NoticeDetails_noData));
        mTime = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_NoticeDetails_PublishTime));
        mTitle = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_NoticeDetails_title));
        mImage = ((AutoScrollViewPager) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.iv_NoticeDetails_Picture));
        mName = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_NoticeDetails_PublishName));
        mContent = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_NoticeDetails_Content));
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ServiceNoticeDetailFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ServiceNoticeDetailFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ServiceNoticeDetailFrag build() {
            ServiceNoticeDetailFrag_ fragment_ = new ServiceNoticeDetailFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
