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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class HuiLifeChipsOrderFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.HuiLifeChipsOrderFrag
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
            contentView_ = inflater.inflate(layout.frag_huilife_chipsbuy, container, false);
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

    public static HuiLifeChipsOrderFrag_.FragmentBuilder_ builder() {
        return new HuiLifeChipsOrderFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_goods_name = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_goods_name));
        tv_total_actual = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_total_actual));
        tv_reserve_name = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_reserve_name));
        btn_pay = ((Button) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.btn_pay));
        img_goods_pic = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_goods_pic));
        fl_huiLife_addressChooice = ((FrameLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.fl_huiLife_addressChooice));
        tv_goods_add = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_goods_add));
        tv_goods_num = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_goods_num));
        tv_goods_price = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_goods_price));
        tv_goods_reduce = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_goods_reduce));
        tv_reserve_phone = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_reserve_phone));
        tv_reserve_address = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_reserve_address));
        tv_address_default = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_address_default));
        mNoAddress = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.fl_huiLife_NoAddress));
        if (fl_huiLife_addressChooice!= null) {
            fl_huiLife_addressChooice.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiLifeChipsOrderFrag_.this.ChooiceAddress();
                }

            }
            );
        }
        if (mNoAddress!= null) {
            mNoAddress.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiLifeChipsOrderFrag_.this.CreateAddress();
                }

            }
            );
        }
        if (btn_pay!= null) {
            btn_pay.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiLifeChipsOrderFrag_.this.payChips();
                }

            }
            );
        }
        if (tv_goods_reduce!= null) {
            tv_goods_reduce.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiLifeChipsOrderFrag_.this.reduceNum();
                }

            }
            );
        }
        if (tv_goods_add!= null) {
            tv_goods_add.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    HuiLifeChipsOrderFrag_.this.addNum();
                }

            }
            );
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<HuiLifeChipsOrderFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.HuiLifeChipsOrderFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.HuiLifeChipsOrderFrag build() {
            HuiLifeChipsOrderFrag_ fragment_ = new HuiLifeChipsOrderFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
