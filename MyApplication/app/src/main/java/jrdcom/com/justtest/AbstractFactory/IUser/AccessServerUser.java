package jrdcom.com.justtest.AbstractFactory.IUser;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/10.
 */

public class AccessServerUser  implements ServerUserSuper {
    public void insert(User user)
    {
        Log.d(JrdCommon.TAG,"This is access server user insert");
    }

    public User get(String id){
        Log.d(JrdCommon.TAG, "This is access server get user");
        return null;
    }
}
