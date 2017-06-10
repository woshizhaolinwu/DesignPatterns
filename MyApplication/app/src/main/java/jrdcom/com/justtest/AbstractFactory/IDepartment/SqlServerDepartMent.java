package jrdcom.com.justtest.AbstractFactory.IDepartment;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/10.
 */

public class SqlServerDepartMent implements IDepartMentServerInterface{
    @Override
    public void insertDepartMent(DepartMent departMent) {
        Log.d(JrdCommon.TAG, "this is sql server department insert");
    }

    @Override
    public DepartMent getDepartMent(String id) {
        Log.d(JrdCommon.TAG, "this is sql server get department");
        return null;
    }
}
