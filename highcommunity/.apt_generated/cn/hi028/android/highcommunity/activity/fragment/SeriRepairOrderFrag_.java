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
import net.duohuo.dhroid.view.CustomGridView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SeriRepairOrderFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.SeriRepairOrderFrag
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
            contentView_ = inflater.inflate(layout.frag_repair_order, container, false);
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

    public static SeriRepairOrderFrag_.FragmentBuilder_ builder() {
        return new SeriRepairOrderFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_repair_time = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_repair_time));
        edt_repair_name = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.edt_repair_name));
        tv_order = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_order));
        cg_add_pic = ((CustomGridView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.cg_add_pic));
        edt_repair_phone = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.edt_repair_phone));
        edt_repair_content = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.edt_repair_content));
        tv_repair_address = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_repair_address));
        if (tv_order!= null) {
            tv_order.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SeriRepairOrderFrag_.this.submit();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_repair_time);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SeriRepairOrderFrag_.this.selectTime();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<SeriRepairOrderFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.SeriRepairOrderFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.SeriRepairOrderFrag build() {
            SeriRepairOrderFrag_ fragment_ = new SeriRepairOrderFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
