package jrdcom.com.justtest.Proxy;

/**
 * Created by longcheng on 2017/6/8.
 */

public class SenderProxy implements SenderInter {
    private Sender mSender;
    public SenderProxy(Sender sender){
        mSender = sender;
    }
    @Override
    public void sendFlower() {
        mSender.sendFlower();
    }

    @Override
    public void sendWaWa() {
        mSender.sendWaWa();
    }
}
