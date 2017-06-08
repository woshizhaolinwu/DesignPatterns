package jrdcom.com.justtest.Decoration;

import android.util.Log;

/**
 * Created by longcheng on 2017/6/8.
 */

public class Person {
    //这个是 ComPonent
    private String  personName;

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void showResult(){
        Log.d("zlwu", "name is "+personName);

    }
}
