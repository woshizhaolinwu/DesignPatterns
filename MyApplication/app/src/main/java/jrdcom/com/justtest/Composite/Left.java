package jrdcom.com.justtest.Composite;

/**
 * Created by longcheng on 2017/6/10.
 */

public class Left extends  Compoment{
    @Override
    public void add(Compoment compoment) {
        //叶子节点，继续往下
    }

    @Override
    public void remove(Compoment compoment) {
        //叶子节点，不需要往下
    }

    @Override
    public void display(int deth) {
        //显示当前节点
    }
}
