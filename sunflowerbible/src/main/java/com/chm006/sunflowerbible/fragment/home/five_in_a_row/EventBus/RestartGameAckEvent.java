package com.chm006.sunflowerbible.fragment.home.five_in_a_row.EventBus;

/**
 * Created by Administrator on 2016/1/27.
 */
public class RestartGameAckEvent {

    public boolean mAgreeRestart;

    public RestartGameAckEvent(boolean agreeRestart){
        mAgreeRestart = agreeRestart;
    }
}
