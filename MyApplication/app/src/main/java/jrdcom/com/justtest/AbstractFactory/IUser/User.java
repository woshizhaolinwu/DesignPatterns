package jrdcom.com.justtest.AbstractFactory.IUser;

/**
 * Created by longcheng on 2017/6/9.
 */

public class User {
    private String userName;
    private String userID;

    public User(String name, String ID){
        userName = name;
        userID = ID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
