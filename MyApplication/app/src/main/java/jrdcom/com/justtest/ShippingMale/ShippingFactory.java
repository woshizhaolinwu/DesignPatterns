package jrdcom.com.justtest.ShippingMale;

/**
 * Created by longcheng on 2017/6/8.
 */

public class ShippingFactory {
    public ShippingSuper CreateShip(int type){
        ShippingSuper shippingSuper = null;
        switch (type){
            case 0:
                shippingSuper = new ShippingRate(5);    //打5折
                break;
            case 1:
                shippingSuper = new ShippingFullDown(300,100); //满三百减一百
                break;
        }
        return shippingSuper;
    }
}
