package com.chm006.sunflowerbible.fragment.home.five_in_a_row.view.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chm006.sunflowerbible.R;
import com.chm006.sunflowerbible.fragment.home.five_in_a_row.EventBus.BusProvider;
import com.chm006.sunflowerbible.fragment.home.five_in_a_row.EventBus.MoveBackAckEvent;
import com.gc.materialdesign.views.ButtonRectangle;

/**
 * Created by Administrator on 2016/1/27.
 */
public class MoveBackAckDialog extends BaseDialog {

    public static final String TAG = "MoveBackAckDialog";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.dialog_ack_move_back, container, false);

        ButtonRectangle agree = (ButtonRectangle) view.findViewById(R.id.btn_agree);
        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BusProvider.getInstance().post(new MoveBackAckEvent(true));
            }
        });

        ButtonRectangle disagree = (ButtonRectangle) view.findViewById(R.id.btn_disagree);
        disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BusProvider.getInstance().post(new MoveBackAckEvent(false));
            }
        });

        return view;
    }
}
