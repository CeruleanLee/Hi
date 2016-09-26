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
import com.don.view.CircleImageView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class CreateGroupFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.CreateGroupFrag
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
            contentView_ = inflater.inflate(layout.frag_creategroup, container, false);
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

    public static CreateGroupFrag_.FragmentBuilder_ builder() {
        return new CreateGroupFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mTitle = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_secondtitle_name));
        mName = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.civ_creategroup_name));
        mIntro = ((EditText) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_creategrpu_intro));
        mAvatar = ((CircleImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.civ_creategroup_avatar));
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.civ_creategroup_submit);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        CreateGroupFrag_.this.submit();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_back);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        CreateGroupFrag_.this.back();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<CreateGroupFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.CreateGroupFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.CreateGroupFrag build() {
            CreateGroupFrag_ fragment_ = new CreateGroupFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
