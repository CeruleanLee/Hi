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
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class WalletScoreFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.WalletScoreFrag
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
            contentView_ = inflater.inflate(layout.frag_walletscore, container, false);
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

    public static WalletScoreFrag_.FragmentBuilder_ builder() {
        return new WalletScoreFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.progress_walletScore);
        mRecodeList = ((PullToRefreshListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_walletscore_recode));
        mSubmit = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_walletscore_exChange));
        mScore = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_walletscore_score));
        mMoney = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_walletscore_money));
        mRules = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_walletscore_rules));
        mNoData = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_walletScore_Nodata));
        mNumber = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_walletscore_inputNumber));
        if (mRules!= null) {
            mRules.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    WalletScoreFrag_.this.rules();
                }

            }
            );
        }
        if (mSubmit!= null) {
            mSubmit.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    WalletScoreFrag_.this.submit();
                }

            }
            );
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<WalletScoreFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.WalletScoreFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.WalletScoreFrag build() {
            WalletScoreFrag_ fragment_ = new WalletScoreFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
