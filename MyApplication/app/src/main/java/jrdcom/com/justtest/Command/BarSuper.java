package jrdcom.com.justtest.Command;

/**
 * Created by longcheng on 2017/6/10.
 */

public abstract class BarSuper {
    /*
    * 烤肉基础类，可以烤鸡翅，烤羊肉
    * */
    //定义执行的人
    protected Barbecur barbecur;
    public BarSuper(Barbecur b){
        barbecur = b;
    }

    public abstract void Bar(); //抽象方法，烤
}
