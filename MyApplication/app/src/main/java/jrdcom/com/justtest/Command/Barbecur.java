package jrdcom.com.justtest.Command;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/10.
 */

public class Barbecur {
    //这边的烤肉师父即使接收Command的来执行
    public void BarYang(){
        Log.d(JrdCommon.TAG, "Barbecue: barYang");
    }

    public void BarJi(){
        Log.d(JrdCommon.TAG, "Barbecue: barJi");
    }
}
