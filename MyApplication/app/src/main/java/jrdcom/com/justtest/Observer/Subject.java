package jrdcom.com.justtest.Observer;

/**
 * Created by longcheng on 2017/6/9.
 */

public interface Subject {
    /*
    * 对秘书类进行解耦
    * */
    public void attachObserver(ObserverSuper observer);
    public void deAttachObserver(ObserverSuper observer);
    public void bossStatus();
}
