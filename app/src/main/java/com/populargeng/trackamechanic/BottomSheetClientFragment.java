package com.populargeng.trackamechanic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mathemartins on 3/28/2018.
 */

public class BottomSheetClientFragment extends BottomSheetDialogFragment{
    String mTag;

    public static BottomSheetClientFragment newInstance(String tag){
        BottomSheetClientFragment f = new BottomSheetClientFragment();
        Bundle args = new Bundle();

        args.putString("TAG", tag);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTag = getArguments().getString("TAG");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_client, container, false);

        return view;
    }
}
