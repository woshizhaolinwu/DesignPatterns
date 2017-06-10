package jrdcom.com.justtest.AbstractFactory.IDepartment;

/**
 * Created by longcheng on 2017/6/10.
 */

public interface IDepartMentServerInterface {
    public void insertDepartMent(DepartMent departMent);
    public DepartMent getDepartMent(String id);
}
