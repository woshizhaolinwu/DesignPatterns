package jrdcom.com.justtest.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by longcheng on 2017/6/10.
 */

public class Waiter {
    //Waiter类是为了接收命令的
    private List<BarSuper> barSupers = new ArrayList<>();
    public void add(BarSuper barSuper){
        barSupers.add(barSuper);
    }

    public void remove(BarSuper barSuper){
        barSupers.remove(barSuper);
    }

    public void bar(){
        for (BarSuper ba: barSupers
             ) {
            ba.Bar();
        }
    }

}
