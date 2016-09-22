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
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ServicePaymentFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.ServicePaymentFrag
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
            contentView_ = inflater.inflate(layout.frag_service_payment, container, false);
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

    public static ServicePaymentFrag_.FragmentBuilder_ builder() {
        return new ServicePaymentFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        img_seri_repair_order = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_seri_repair_order));
        qi = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_payment_service_qi));
        water = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_payment_service_water));
        wuguan = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_payment_service_wuguan));
        dian = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_payment_service_dian));
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_seri_repairr_jj);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServicePaymentFrag_.this.onClickJJ();
                    }

                }
                );
            }
        }
        if (img_seri_repair_order!= null) {
            img_seri_repair_order.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    ServicePaymentFrag_.this.onClickOrder();
                }

            }
            );
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_seri_repair_record);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        ServicePaymentFrag_.this.onClickRecord();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<ServicePaymentFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.ServicePaymentFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.ServicePaymentFrag build() {
            ServicePaymentFrag_ fragment_ = new ServicePaymentFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
