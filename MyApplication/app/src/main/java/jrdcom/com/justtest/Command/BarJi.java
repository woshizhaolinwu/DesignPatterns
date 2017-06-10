package jrdcom.com.justtest.Command;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/10.
 */

public class BarJi extends BarSuper {
    public BarJi(Barbecur b){
        super(b);
    }
    @Override
    public void Bar() {
        barbecur.BarJi();
        //Log.d(JrdCommon.TAG,"Bar Ji");
    }
}
