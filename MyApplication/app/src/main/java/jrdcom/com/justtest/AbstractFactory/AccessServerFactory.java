package jrdcom.com.justtest.AbstractFactory;

import jrdcom.com.justtest.AbstractFactory.IDepartment.AccessDepartMent;
import jrdcom.com.justtest.AbstractFactory.IDepartment.IDepartMentServerInterface;
import jrdcom.com.justtest.AbstractFactory.IUser.AccessServerUser;
import jrdcom.com.justtest.AbstractFactory.IUser.ServerUserSuper;

/**
 * Created by longcheng on 2017/6/10.
 */

public class AccessServerFactory implements SqlServerInterface {
    @Override
    public ServerUserSuper CreateServerUser() {
        return new AccessServerUser();
        //return null;
    }

    @Override
    public IDepartMentServerInterface CreateDepartment() {
        return new AccessDepartMent();//null;
    }
}
