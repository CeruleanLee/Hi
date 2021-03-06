//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package cn.hi028.android.highcommunity.activity.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import cn.hi028.android.highcommunity.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MessageCenterFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.MessageCenterFrag
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
            contentView_ = inflater.inflate(layout.frag_message_center, container, false);
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

    public static MessageCenterFrag_.FragmentBuilder_ builder() {
        return new MessageCenterFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        rg = ((RadioGroup) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.rg_Message_Center));
        mPager = ((ViewPager) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.vp_MessageCenter_ViewPager));
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<MessageCenterFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.MessageCenterFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.MessageCenterFrag build() {
            MessageCenterFrag_ fragment_ = new MessageCenterFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
