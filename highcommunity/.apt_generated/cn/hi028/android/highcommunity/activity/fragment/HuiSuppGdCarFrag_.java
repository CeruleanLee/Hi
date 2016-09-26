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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class HuiSuppGdCarFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.HuiSuppGdCarFrag
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
            contentView_ = inflater.inflate(layout.frag_huisupp_gdcar, container, false);
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

    public static HuiSuppGdCarFrag_.FragmentBuilder_ builder() {
        return new HuiSuppGdCarFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_price = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_price));
        img_goods_ch = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_goods_ch));
        ll_price = ((LinearLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_price));
        mNodata = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_gdcar_Nodata));
        mProgress = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.progress_gdcar_notice);
        btn_pay = ((Button) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.btn_pay));
        mListView = ((PullToRefreshListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ptrlv_gdcar_listView));
        if (img_goods_ch!= null) {
            img_goods_ch.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiSuppGdCarFrag_.this.checkClick();
                }

            }
            );
        }
        if (btn_pay!= null) {
            btn_pay.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiSuppGdCarFrag_.this.payClick();
                }

            }
            );
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<HuiSuppGdCarFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.HuiSuppGdCarFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.HuiSuppGdCarFrag build() {
            HuiSuppGdCarFrag_ fragment_ = new HuiSuppGdCarFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
