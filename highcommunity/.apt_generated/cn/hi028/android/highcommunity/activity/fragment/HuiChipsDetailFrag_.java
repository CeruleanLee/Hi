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
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.github.mikephil.charting.charts.LineChart;
import net.duohuo.dhroid.view.AutoScrollViewPager;
import net.duohuo.dhroid.view.CirclePageIndicator;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class HuiChipsDetailFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.HuiChipsDetailFrag
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
            contentView_ = inflater.inflate(layout.frag_huichips_detail, container, false);
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

    public static HuiChipsDetailFrag_.FragmentBuilder_ builder() {
        return new HuiChipsDetailFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        vgcpi = ((CirclePageIndicator) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.view_cpi));
        tv_chips_time = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_chips_time));
        tv_join_chips = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_join_chips));
        viewPager = ((AutoScrollViewPager) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.view_pager));
        lc_chips = ((LineChart) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.lc_chips));
        tv_count = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_count));
        tv_chips_price = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_chips_price));
        tv_name = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_name));
        tv_info = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_info));
        tv_chips_person_num = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_chips_person_num));
        if (tv_join_chips!= null) {
            tv_join_chips.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiChipsDetailFrag_.this.onClick();
                }

            }
            );
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<HuiChipsDetailFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.HuiChipsDetailFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.HuiChipsDetailFrag build() {
            HuiChipsDetailFrag_ fragment_ = new HuiChipsDetailFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
