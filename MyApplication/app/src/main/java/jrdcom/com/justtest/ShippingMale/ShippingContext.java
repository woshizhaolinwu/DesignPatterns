package jrdcom.com.justtest.ShippingMale;

/**
 * Created by longcheng on 2017/6/8.
 */

public class ShippingContext {
    //简单工厂和策略模式组合
    private ShippingSuper shippingSuper;

    public ShippingContext(int type){
        switch (type){
            case 0:
                shippingSuper = new ShippingRate(5);    //打5折
                break;
            case 1:
                shippingSuper = new ShippingFullDown(300,100); //满三百减一百
                break;
        }
    }

    public double getCrash(double money){
       return   shippingSuper.calulateCash(money);
    }
}
