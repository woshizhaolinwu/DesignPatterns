package jrdcom.com.justtest.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by longcheng on 2017/6/10.
 */

public class Composite extends Compoment {
    private List<Compoment> compoments = new ArrayList<>();
    @Override
    public void add(Compoment compoment) {
        compoments.add(compoment);
    }

    @Override
    public void remove(Compoment compoment) {
        compoments.remove(compoment);
    }

    @Override
    public void display(int deth) {
        for (Compoment com:compoments) {
            com.display(deth);  //遍历
        }
    }
}
