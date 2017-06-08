package jrdcom.com.justtest.Decoration;

/**
 * Created by longcheng on 2017/6/8.
 */

public class Finery extends Person {

    private Person com;
    public void Decorate(Person person){
        com = person;
    }
    @Override
    public void showResult() {
        com.showResult();
        //super.showResult();
    }

}
