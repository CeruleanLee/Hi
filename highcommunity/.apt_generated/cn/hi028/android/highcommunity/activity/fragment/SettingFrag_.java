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
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SettingFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.SettingFrag
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
            contentView_ = inflater.inflate(layout.frag_setting, container, false);
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

    public static SettingFrag_.FragmentBuilder_ builder() {
        return new SettingFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mWeibo = ((LinearLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_setting_thirdPary_weibo));
        mQQ = ((LinearLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_setting_thirdPary_qq));
        mWeixin = ((LinearLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.ll_setting_thirdPary_weixin));
        tv_settings_Logout = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_settings_Logout));
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_settings_clear);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingFrag_.this.clearCache();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_settings_AppUpdate);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingFrag_.this.update();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_settings_ReciveAddress);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingFrag_.this.address();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_settings_modifyPassword);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingFrag_.this.modify();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_settings_AboutUs);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingFrag_.this.aboutus();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_settings_PhoneNumber);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        SettingFrag_.this.call();
                    }

                }
                );
            }
        }
        if (tv_settings_Logout!= null) {
            tv_settings_Logout.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SettingFrag_.this.Logout();
                }

            }
            );
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<SettingFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.SettingFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.SettingFrag build() {
            SettingFrag_ fragment_ = new SettingFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
