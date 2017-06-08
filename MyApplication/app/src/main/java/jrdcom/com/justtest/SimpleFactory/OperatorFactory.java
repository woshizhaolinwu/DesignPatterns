package jrdcom.com.justtest.SimpleFactory;

/**
 * Created by longcheng on 2017/6/6.
 */

public class OperatorFactory {
    public Operator getOperator(int type){
        Operator operator = null;
        switch (type){
            case 0:
                operator = new OperatorAdd();
                break;
            case 1:
                operator = new OperatorDel();
                break;
        }
        return operator;
    }
}
