package jrdcom.com.justtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import jrdcom.com.justtest.Decoration.BigTrouser;
import jrdcom.com.justtest.Decoration.Finery;
import jrdcom.com.justtest.Decoration.Person;
import jrdcom.com.justtest.Decoration.TShitFinery;
import jrdcom.com.justtest.FactoryMethod.FactoryOperatorAdd;
import jrdcom.com.justtest.Proxy.Sender;
import jrdcom.com.justtest.Proxy.SenderProxy;
import jrdcom.com.justtest.ShippingMale.ShippingFactory;
import jrdcom.com.justtest.ShippingMale.ShippingSuper;
import jrdcom.com.justtest.SimpleFactory.Operator;
import jrdcom.com.justtest.SimpleFactory.OperatorFactory;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "zlwu";
    private Button btn_simple_factory;
    private Button btn_shipping;
    private Button btn_decorate;
    private Button btn_proxy;
    private Button btn_factory_method;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_simple_factory = (Button)findViewById(R.id.btn_simple_factory);
        btn_simple_factory.setOnClickListener(onClickListener);

        btn_shipping = (Button)findViewById(R.id.btn_shipping);
        btn_shipping.setOnClickListener(onClickListener);

        //装饰模式
        btn_decorate = (Button)findViewById(R.id.btn_decorate);
        btn_decorate.setOnClickListener(onClickListener);

        //代理模式
        btn_proxy = (Button)findViewById(R.id.btn_proxy);
        btn_proxy.setOnClickListener(onClickListener);

        //工厂方法模式
        btn_factory_method = (Button)findViewById(R.id.btn_factory_method);
        btn_factory_method.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_simple_factory:
                    OperatorFactory operatorFactory = new OperatorFactory();
                    Operator operator = operatorFactory.getOperator(0);
                    int result = operator.calculate(1, 2);
                    Log.d(TAG, "result = "+result);
                    break;

                case R.id.btn_shipping:
                    double money = 10*10;//number 10, price 10
                    ShippingFactory shippingFactory = new ShippingFactory();
                    ShippingSuper shippingSuper = shippingFactory.CreateShip(0);
                    double totalMoney =  shippingSuper.calulateCash(money);
                    Log.d(TAG, "total money = "+totalMoney);
                    break;

                case R.id.btn_decorate:
                    Person person = new Person();
                    person.setPersonName("小菜");
                    Finery finery = new TShitFinery();
                    //设置装饰
                    finery.Decorate(person);
                    finery.showResult();

                    Finery bigTrouser = new BigTrouser();
                    bigTrouser.Decorate(person);
                    bigTrouser.showResult();
                    break;

                case R.id.btn_proxy:        //代理模式
                    Sender sender = new Sender();//真实的发送者
                    sender.setReceiverName("大鸟");
                    SenderProxy senderProxy = new SenderProxy(sender);//授权给代理
                    senderProxy.sendWaWa(); //代理送东西
                    senderProxy.sendFlower();
                    break;

                case R.id.btn_factory_method:
                    FactoryOperatorAdd factoryOperatorAdd = new FactoryOperatorAdd();
                    jrdcom.com.justtest.FactoryMethod.Operator operator1 = factoryOperatorAdd.CreateOperator();
                    int num =  operator1.calculate(100,200);
                    Log.d(JrdCommon.TAG, "the number is"+num);
                    break;
            }
        }
    };

}
