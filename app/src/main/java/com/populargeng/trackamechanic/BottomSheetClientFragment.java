package com.populargeng.trackamechanic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mathemartins on 3/28/2018.
 */

public class BottomSheetClientFragment extends BottomSheetDialogFragment{
    String mLocation, mDestination;

    public static BottomSheetClientFragment newInstance(String location, String destination){
        BottomSheetClientFragment f = new BottomSheetClientFragment();
        Bundle args = new Bundle();

        args.putString("location", location);
        args.putString("destination", destination);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLocation = getArguments().getString("location");
        mDestination = getArguments().getString("destination");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_client, container, false);

        TextView txtLocation = (TextView) view.findViewById(R.id.txtLocation);
        TextView txtDestination = (TextView) view.findViewById(R.id.txtDestination);
        TextView txtCalculate = (TextView) view.findViewById(R.id.txtCalculate);

        // set data
        txtLocation.setText(mLocation);
        txtDestination.setText(mDestination);

        return view;
    }
}
