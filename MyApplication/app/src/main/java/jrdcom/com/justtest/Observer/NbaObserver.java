package jrdcom.com.justtest.Observer;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/9.
 */

public class NbaObserver extends ObserverSuper {
    private String nbaName;
    public NbaObserver(String name){
        nbaName = name;
    }

    @Override
    public void update() {
        Log.d(JrdCommon.TAG,"NBA Observer "+ nbaName+"work but not nba");
    }
}
