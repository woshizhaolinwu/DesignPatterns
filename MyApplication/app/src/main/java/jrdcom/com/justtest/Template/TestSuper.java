package jrdcom.com.justtest.Template;

import android.util.Log;

import jrdcom.com.justtest.JrdCommon;

/**
 * Created by longcheng on 2017/6/9.
 */

public abstract class TestSuper {
    public void test1(){
        Log.d(JrdCommon.TAG, "Question1: A.1 B.2 C.3 D.4"+answer1());
    }
    public void test2(){
        Log.d(JrdCommon.TAG, "Question2: A.1 B.2 C.3 D.4"+answer2());
    }

    public abstract String answer1();

    public abstract String answer2();
}
