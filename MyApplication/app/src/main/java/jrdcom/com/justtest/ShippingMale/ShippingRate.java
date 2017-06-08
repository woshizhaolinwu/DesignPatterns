package jrdcom.com.justtest.ShippingMale;

/**
 * Created by longcheng on 2017/6/8.
 */

public class ShippingRate extends ShippingSuper {
    //按照折扣信息促销，即是打几折
    private int mRate = 100;

    public ShippingRate(int rate){
        mRate = rate*10;
    }
    @Override
    public double calulateCash(double money) {
        return  money*mRate/100;
        //return super.calulateCash(money);
    }
}
