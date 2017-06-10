package jrdcom.com.justtest.AbstractFactory.IUser;

import jrdcom.com.justtest.AbstractFactory.IUser.User;

/**
 * Created by longcheng on 2017/6/10.
 */

public interface ServerUserSuper {
    public void insert(User user);
    public User get(String id);
}
