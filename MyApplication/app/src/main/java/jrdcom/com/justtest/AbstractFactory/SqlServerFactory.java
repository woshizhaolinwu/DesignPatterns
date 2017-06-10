package jrdcom.com.justtest.AbstractFactory;

import jrdcom.com.justtest.AbstractFactory.IDepartment.IDepartMentServerInterface;
import jrdcom.com.justtest.AbstractFactory.IDepartment.SqlServerDepartMent;
import jrdcom.com.justtest.AbstractFactory.IUser.ServerUserSuper;
import jrdcom.com.justtest.AbstractFactory.IUser.SqlserverUser;

/**
 * Created by longcheng on 2017/6/10.
 */

public class SqlServerFactory implements SqlServerInterface {
    @Override
    public ServerUserSuper CreateServerUser() {
        return  new SqlserverUser();
        //return null;
    }

    @Override
    public IDepartMentServerInterface CreateDepartment() {
        return new SqlServerDepartMent();//null;
    }
}
