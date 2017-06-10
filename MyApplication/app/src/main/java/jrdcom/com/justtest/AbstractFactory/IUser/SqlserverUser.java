package jrdcom.com.justtest.AbstractFactory.IUser;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/9.
 */

public class SqlserverUser implements ServerUserSuper {
    public void insert(User user){
        Log.d(JrdCommon.TAG, "Insert user");
    }

    public User get(String ID){
        Log.d(JrdCommon.TAG, "get user by ID");
        return null;
    }
}
