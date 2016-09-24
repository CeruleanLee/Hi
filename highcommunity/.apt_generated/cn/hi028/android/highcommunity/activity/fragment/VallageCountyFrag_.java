//
// DO NOT EDIT THIS FILE.Generated using AndroidAnnotations 3.3.2.
//  You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package cn.hi028.android.highcommunity.activity.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import cn.hi028.android.highcommunity.R.layout;
import com.don.view.MyLetterListView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class VallageCountyFrag_
    extends cn.hi028.android.highcommunity.activity.fragment.VallageCountyFrag
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
            contentView_ = inflater.inflate(layout.frag_villagechoice, container, false);
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

    public static VallageCountyFrag_.FragmentBuilder_ builder() {
        return new VallageCountyFrag_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        fl_vallage_search = ((FrameLayout) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.fl_vallage_search));
        tv_secondtitle_name = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_secondtitle_name));
        mHight = hasViews.findViewById(cn.hi028.android.highcommunity.R.id.title_secondTitle_Hight);
        lv_vallage = ((ListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.lv_vallage));
        mLetter = ((MyLetterListView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.mlv_village_Letter));
        img_back = ((ImageView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.img_back));
        tv_dialog = ((TextView) hasViews.findViewById(cn.hi028.android.highcommunity.R.id.tv_dialog));
        initView();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<VallageCountyFrag_.FragmentBuilder_, cn.hi028.android.highcommunity.activity.fragment.VallageCountyFrag>
    {


        @Override
        public cn.hi028.android.highcommunity.activity.fragment.VallageCountyFrag build() {
            VallageCountyFrag_ fragment_ = new VallageCountyFrag_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
