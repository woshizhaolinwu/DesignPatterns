package jrdcom.com.justtest.Responsibility;

/**
 * Created by longcheng on 2017/6/10.
 */

public class Manager {
    private String managerName;
    public Manager(String name){
        managerName = name;
    }

    public void handlerRequest(String managerLevel,Request request){
        //对request进行处理,根据级别处理
        switch (managerLevel)
        {
            case "经理":

                break;
            case "总监":
                break;
            case "总经理":
                break;
        }
    }
}
