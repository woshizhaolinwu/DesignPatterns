package jrdcom.com.justtest.Observer;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/9.
 */

public class StockObserver extends ObserverSuper {
    /*
    * 同事类，负责响应秘书的通知
    * */
    private String stockName;
    public StockObserver(String name){
        stockName = name;
    }
    public void update(){
        Log.d(JrdCommon.TAG, "StockObserver"+stockName+"work but not stock");
    }
}
