package jrdcom.com.justtest.Command;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/10.
 */

public class BarYang extends BarSuper {
    public BarYang(Barbecur b){
        super(b);
    }
    @Override
    public void Bar() {
        //Log.d(JrdCommon.TAG, "Bar Yang");
        barbecur.BarYang();
    }
}
