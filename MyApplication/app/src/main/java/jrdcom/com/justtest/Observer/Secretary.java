package jrdcom.com.justtest.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by longcheng on 2017/6/9.
 */

public class Secretary implements Subject{

    private boolean bossIsIn = false;
    /*
    *  秘书类，实现监听，通知
    * */
    List<ObserverSuper> stockObservers = new ArrayList<>();

    public void attachObserver(ObserverSuper observer){
        stockObservers.add(observer);
    }

    public void deAttachObserver(ObserverSuper observer){
        stockObservers.remove(observer);
    }

    private void update(){
        //通知所有的同事
        for (ObserverSuper observer: stockObservers) {
            observer.update();
        }
    }


    /*
    * 老板状态的切换
    * */
    public void bossStatus(){
        bossIsIn = !bossIsIn;
        if(bossIsIn == true){
            update();
        }
    }



}
