package jrdcom.com.justtest.FactoryMethod;

/**
 * Created by longcheng on 2017/6/8.
 */

public class FactoryOperatorAdd implements FactoryInterface {
    @Override
    public Operator CreateOperator() {
        //return null;
        return new OperatorAdd();
    }
}
