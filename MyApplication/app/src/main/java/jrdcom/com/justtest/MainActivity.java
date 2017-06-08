package jrdcom.com.justtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import jrdcom.com.justtest.SimpleFactory.Operator;
import jrdcom.com.justtest.SimpleFactory.OperatorFactory;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "zlwu";
    private Button btn_simple_factory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_simple_factory = (Button)findViewById(R.id.btn_simple_factory);
        btn_simple_factory.setOnClickListener(onClickListener);
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
            }
        }
    };

}
