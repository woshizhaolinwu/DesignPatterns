package jrdcom.com.justtest.AbstractFactory;

import jrdcom.com.justtest.AbstractFactory.IDepartment.AccessDepartMent;
import jrdcom.com.justtest.AbstractFactory.IDepartment.IDepartMentServerInterface;
import jrdcom.com.justtest.AbstractFactory.IDepartment.SqlServerDepartMent;
import jrdcom.com.justtest.AbstractFactory.IUser.AccessServerUser;
import jrdcom.com.justtest.AbstractFactory.IUser.ServerUserSuper;
import jrdcom.com.justtest.AbstractFactory.IUser.SqlserverUser;

/**
 * Created by longcheng on 2017/6/10.
 */

public class DataAccess implements SqlServerInterface{
    public final static String sql_use = "SqlServerDepartMent";//SqlServerDepartMent或者AccessDepartMent

    @Override
    public IDepartMentServerInterface CreateDepartment() {
        IDepartMentServerInterface iDepartMentServerInterface = null;

        //利用放射的方式，避免switch
        String className = "jrdcom.com.justtest.AbstractFactory.IDepartment."+sql_use;
        try{
            Class c = Class.forName(className);
            iDepartMentServerInterface = (IDepartMentServerInterface)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return iDepartMentServerInterface;
    }

    @Override
    public ServerUserSuper CreateServerUser() {
        ServerUserSuper serverUserSuper = null;
        switch (sql_use){
            case "SQL":
                serverUserSuper=  new SqlserverUser();
                break;
            case "Access":
                serverUserSuper= new AccessServerUser();
                break;
        }
        return serverUserSuper;
    }
}
