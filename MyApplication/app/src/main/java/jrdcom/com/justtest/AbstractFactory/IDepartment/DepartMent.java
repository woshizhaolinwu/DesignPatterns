package jrdcom.com.justtest.AbstractFactory.IDepartment;

/**
 * Created by longcheng on 2017/6/10.
 */

public class DepartMent {
    private String departMentId;
    private String departMentName;

    public DepartMent(String name, String id)
    {
        departMentId = id;
        departMentName = name;
    }

    public void setDepartMentId(String departMentId) {
        this.departMentId = departMentId;
    }

    public void setDepartMentName(String departMentName) {
        this.departMentName = departMentName;
    }

    public String getDepartMentId() {
        return departMentId;
    }

    public String getDepartMentName() {
        return departMentName;
    }
}
