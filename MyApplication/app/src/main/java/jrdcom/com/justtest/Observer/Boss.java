package jrdcom.com.justtest.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by longcheng on 2017/6/9.
 */

public class Boss implements Subject {

    List<ObserverSuper> observerSupers = new ArrayList<>();
    private boolean bossStatus = false;
    @Override
    public void attachObserver(ObserverSuper observer) {
        observerSupers.add(observer);
    }

    @Override
    public void deAttachObserver(ObserverSuper observer) {
        observerSupers.remove(observer);
    }

    private void update(){
        for (ObserverSuper observer: observerSupers) {
            observer.update();
        }
    }
    @Override
    public void bossStatus() {
        bossStatus = !bossStatus;
        if(bossStatus == true){
            update();
        }
    }
}
