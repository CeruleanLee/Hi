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
import android.widget.EditText;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ActivityCreateFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ActivityCreateFrag
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
            contentView_ = inflater.inflate(layout.frag_activitycreate, container, false);
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

    public static ActivityCreateFrag_.FragmentBuilder_ builder() {
        return new ActivityCreateFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mQQ = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_QQ));
        mPhone = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_Phone));
        mName = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_name));
        mStartTime = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_StartTime));
        mWeixin = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_Weixin));
        mLocation = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_Location));
        mContent = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_activityContent));
        mGridView = ((PullToRefreshGridView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ptrgv_activityCreate_PostImage));
        mEndTime = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_activityCreate_EndTime));
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_activityCreate_submit);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ActivityCreateFrag_.this.submit();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ActivityCreateFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ActivityCreateFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ActivityCreateFrag build() {
            ActivityCreateFrag_ fragment_ = new ActivityCreateFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
