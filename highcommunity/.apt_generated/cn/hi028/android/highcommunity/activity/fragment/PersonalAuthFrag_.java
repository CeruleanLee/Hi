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
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class PersonalAuthFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.PersonalAuthFrag
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
            contentView_ = inflater.inflate(layout.frag_personalauth, container, false);
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

    public static PersonalAuthFrag_.FragmentBuilder_ builder() {
        return new PersonalAuthFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mName = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_name));
        mBuild = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_build));
        mXiaoqu = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_xiaoqu));
        mCity = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_city));
        mQuxian = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_quxian));
        mUnit = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_unit));
        mPhone = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_phone));
        mDoorNumber = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.et_personalauth_doorNumber));
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_personalauth_submit);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        PersonalAuthFrag_.this.submit();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<PersonalAuthFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.PersonalAuthFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.PersonalAuthFrag build() {
            PersonalAuthFrag_ fragment_ = new PersonalAuthFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
