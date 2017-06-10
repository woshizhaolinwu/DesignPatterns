package jrdcom.com.justtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import jrdcom.com.justtest.AbstractFactory.DataAccess;
import jrdcom.com.justtest.AbstractFactory.IDepartment.DepartMent;
import jrdcom.com.justtest.AbstractFactory.IDepartment.IDepartMentServerInterface;
import jrdcom.com.justtest.AbstractFactory.IUser.ServerUserSuper;
import jrdcom.com.justtest.AbstractFactory.SqlServerFactory;
import jrdcom.com.justtest.AbstractFactory.SqlServerInterface;
import jrdcom.com.justtest.AbstractFactory.IUser.User;
import jrdcom.com.justtest.Command.BarJi;
import jrdcom.com.justtest.Command.BarYang;
import jrdcom.com.justtest.Command.Barbecur;
import jrdcom.com.justtest.Command.Waiter;
import jrdcom.com.justtest.Composite.Compoment;
import jrdcom.com.justtest.Composite.Composite;
import jrdcom.com.justtest.Composite.Left;
import jrdcom.com.justtest.Decoration.BigTrouser;
import jrdcom.com.justtest.Decoration.Finery;
import jrdcom.com.justtest.Decoration.Person;
import jrdcom.com.justtest.Decoration.TShitFinery;
import jrdcom.com.justtest.FactoryMethod.FactoryOperatorAdd;
import jrdcom.com.justtest.Observer.Boss;
import jrdcom.com.justtest.Observer.NbaObserver;
import jrdcom.com.justtest.Observer.ObserverSuper;
import jrdcom.com.justtest.Observer.Secretary;
import jrdcom.com.justtest.Observer.StockObserver;
import jrdcom.com.justtest.Observer.Subject;
import jrdcom.com.justtest.Prototype.PersonResume;
import jrdcom.com.justtest.Proxy.Sender;
import jrdcom.com.justtest.Proxy.SenderProxy;
import jrdcom.com.justtest.ShippingMale.ShippingFactory;
import jrdcom.com.justtest.ShippingMale.ShippingSuper;
import jrdcom.com.justtest.SimpleFactory.Operator;
import jrdcom.com.justtest.SimpleFactory.OperatorFactory;
import jrdcom.com.justtest.Template.TestA;
import jrdcom.com.justtest.Template.TestB;
import jrdcom.com.justtest.Template.TestSuper;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "zlwu";
    private Button btn_simple_factory;
    private Button btn_shipping;
    private Button btn_decorate;
    private Button btn_proxy;
    private Button btn_factory_method;
    private Button btn_prototype;
    private Button btn_template;
    private Button btn_builder;
    private Button btn_observer;
    private Button btn_abstract_factory;
    private Button btn_composite;
    private Button btn_command;
    private Button btn_responsibility;
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

        //原型模式
        btn_prototype = (Button)findViewById(R.id.btn_prototype);
        btn_prototype.setOnClickListener(onClickListener);

        //模板模式
        btn_template = (Button)findViewById(R.id.btn_template);
        btn_template.setOnClickListener(onClickListener);

        //建造者模式

        //观察者模式
        btn_observer = (Button)findViewById(R.id.btn_observer);
        btn_observer.setOnClickListener(onClickListener);

        //抽象工厂模式
        btn_abstract_factory = (Button)findViewById(R.id.btn_abstract_factory);
        btn_abstract_factory.setOnClickListener(onClickListener);

        //组合模式
        btn_composite = (Button)findViewById(R.id.btn_composite);
        btn_composite.setOnClickListener(onClickListener);

        //职责链模式
        btn_responsibility = (Button)findViewById(R.id.btn_responsibility);
        btn_responsibility.setOnClickListener(onClickListener);
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

                case R.id.btn_prototype:
                    PersonResume personResume = new PersonResume("wuzhaolin");
                    personResume.setPersonSchool("nanjing");
                    PersonResume personResume1= personResume.clone();
                    personResume1.setPersonName("jiaruilin");
                    personResume1.setPersonSchool("beijing");
                    break;

                case R.id.btn_template:
                    //Student A
                    TestSuper testA = new TestA();
                    testA.test1();
                    testA.test2();

                    //Student B
                    TestSuper testB = new TestB();
                    testB.test1();
                    testB.test2();
                    break;

                case R.id.btn_observer:
                    //秘书
                    Subject secretary = new Secretary();  //秘书类也是实体类，解耦也需要定义
                    ObserverSuper observerSuper = new StockObserver("wuzhaolin");
                    secretary.attachObserver(observerSuper);   //两个类直接有直接耦合
                    secretary.attachObserver(new NbaObserver("jiaruilin"));
                    secretary.bossStatus();

                    //Boss
                    Subject boss = new Boss();
                    boss.attachObserver(new StockObserver("wuzhaolin"));
                    boss.attachObserver(new NbaObserver("jiaruilin"));
                    boss.bossStatus();
                    break;

                case R.id.btn_abstract_factory://抽象工厂模式
                    /*step 1,高度耦合*/
                    /*SqlserverUser sqlserverUser = new SqlserverUser();
                    User user = new User("wuzhaolin","1");
                    sqlserverUser.insert(user);
                    User user1 = sqlserverUser.get("1");*/

                    /*step 2,使用工厂方法, 这样只要替换工厂即可*/
                    SqlServerInterface serverInterface = new SqlServerFactory();
                    ServerUserSuper serverUserSuper = serverInterface.CreateServerUser();
                    User user = new User("wuzhaolin","2");
                    serverUserSuper.insert(user);

                    /*Setp 3,在工厂方法的基础上添加Dempartment表*/
                    SqlServerInterface serverInterface1 = new SqlServerFactory();//sql server 工厂
                    IDepartMentServerInterface iDepartMentServerInterface = serverInterface1.CreateDepartment();
                    DepartMent departMent = new DepartMent("TCL","2");
                    iDepartMentServerInterface.insertDepartMent(departMent);
                    iDepartMentServerInterface.getDepartMent("2");

                    /*Step 4,通过简单工厂的方式来决定使用的数据库*/
                    DataAccess dataAccess = new DataAccess();
                    dataAccess.CreateDepartment();

                    dataAccess.CreateServerUser();
                    break;

                case R.id.btn_composite:
                    Compoment root = new Composite();
                    root.add(new Left());
                    root.add(new Left());

                    Compoment com = new Composite();
                    com.add(new Left());
                    com.add(new Left());
                    root.add(com);
                    break;

                case R.id.btn_command:
                    //Step1：采用路边摊的方法， 客户直接面对烤肉这
                    Barbecur barbecur = new Barbecur();
                    barbecur.BarJi();
                    barbecur.BarYang();
                    //Step2: 采用门店的方法， 中间有服务员
                    /*
                    *  客户发起指令， 烤什么
                    *  服务员： 接收指令，并管理菜单，通知执行
                    *  烤肉师父：接收烤肉命令
                    * */
                    Barbecur barbecur1= new Barbecur();
                    Waiter waiter = new Waiter();
                    waiter.add(new BarYang(barbecur1));
                    waiter.add(new BarJi(barbecur1));
                    waiter.bar();
                    break;

                case R.id.btn_responsibility:       //职责链模式

                    break;
            }
        }
    };

}
