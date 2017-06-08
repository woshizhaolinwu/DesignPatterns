package jrdcom.com.justtest.Proxy;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/8.
 */

public class Sender implements SenderInter {
    private String receiverName;

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Override
    public void sendWaWa() {
        Log.d(JrdCommon.TAG, "I send wawa");
    }

    @Override
    public void sendFlower() {
        Log.d(JrdCommon.TAG, "I send flower");
    }
}
