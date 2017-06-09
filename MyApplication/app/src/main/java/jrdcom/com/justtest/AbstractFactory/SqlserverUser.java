package jrdcom.com.justtest.AbstractFactory;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/9.
 */

public class SqlserverUser {
    public void insert(User user){
        Log.d(JrdCommon.TAG, "Insert user");
    }

    public void get(String ID){
        Log.d(JrdCommon.TAG, "get user by ID");
    }
}
