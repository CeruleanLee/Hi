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
import android.widget.ImageView;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ActivityDetailsFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ActivityDetailsFrag
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
            contentView_ = inflater.inflate(layout.frag_activitydetails, container, false);
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

    public static ActivityDetailsFrag_.FragmentBuilder_ builder() {
        return new ActivityDetailsFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mNodata = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_ActivityDetails_Nodata));
        mlistView = ((PullToRefreshListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ptrlv_activitydetails_listview));
        mReplay = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_activitydetails_replay));
        mJoin = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_activitydetails_join));
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.progress_ActivityDetails);
        if (mJoin!= null) {
            mJoin.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ActivityDetailsFrag_.this.join();
                }

            }
            );
        }
        if (mReplay!= null) {
            mReplay.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ActivityDetailsFrag_.this.replay();
                }

            }
            );
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ActivityDetailsFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ActivityDetailsFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ActivityDetailsFrag build() {
            ActivityDetailsFrag_ fragment_ = new ActivityDetailsFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
