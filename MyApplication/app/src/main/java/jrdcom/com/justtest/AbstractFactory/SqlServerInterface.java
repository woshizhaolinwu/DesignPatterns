package jrdcom.com.justtest.AbstractFactory;

import jrdcom.com.justtest.AbstractFactory.IDepartment.IDepartMentServerInterface;
import jrdcom.com.justtest.AbstractFactory.IUser.ServerUserSuper;

/**
 * Created by longcheng on 2017/6/10.
 */

public interface SqlServerInterface {
    public ServerUserSuper CreateServerUser();
    public IDepartMentServerInterface CreateDepartment();
}
