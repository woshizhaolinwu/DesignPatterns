package jrdcom.com.justtest.ShippingMale;

/**
 * Created by longcheng on 2017/6/8.
 */

public class ShippingFullDown extends ShippingSuper {
    private double mFull;
    private double mDown;
    public ShippingFullDown(double full, double down){
        mFull = full;
        mDown = down;
    }


    @Override
    public double calulateCash(double money) {
        double vMoney = money;
        if(money > mFull){
            vMoney = money - mDown;
        }
        return vMoney;
        //return super.calulateCash(money);
    }
}
