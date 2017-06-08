package jrdcom.com.justtest.SimpleFactory;

/**
 * Created by longcheng on 2017/6/6.
 */

public class OperatorDel extends Operator {
    @Override
    public int calculate(int num1, int num2) {
        return  num1 - num2;
        //return super.calculate(num1, num2);
    }
}
