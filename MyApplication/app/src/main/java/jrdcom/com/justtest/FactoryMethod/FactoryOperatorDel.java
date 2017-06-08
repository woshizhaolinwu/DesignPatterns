package jrdcom.com.justtest.FactoryMethod;

/**
 * Created by longcheng on 2017/6/8.
 */

public class FactoryOperatorDel implements FactoryInterface{
    @Override
    public Operator CreateOperator() {
        return new OperatorDel();
        //return null;
    }
}
