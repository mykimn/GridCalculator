package minyoung9913.kr.hs.emirim.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button[] butNums = new Button[10];
    Button[] butOps = new Button[4];
    /*int[] ids= {R.id.gb_1, R.id.gb_2, R.id.gb_3, R.id.gb_4, R.id.gb_5,
                R.id.gb_6, R.id.gb_7,R.id.gb_8,R.id.gb_9,R.id.gb_10}; */
    EditText edit1, edit2;
    EditText edit_second;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<butNums.length;i++){
            butNums[i] = (Button)findViewById(R.id.gb_1+i);
            butNums[i].setOnClickListener(butNumHandler);
            // butNums[i] = (Button)findViewById(R.id.ids[i]);
        }
        for(int i =0;i<butOps.length;i++){
            butOps[i] =(Button) findViewById(R.id.but_plus+i);
            butOps[i].setOnClickListener(butOpHandler);
        }
        /*edit1 = (EditText) findViewById(R.id.edit_first);
        edit2 = (EditText) findViewById(R.id.edit_second);
        Button butPlus = (Button) findViewById(R.id.but_plus);
        Button butMinus = (Button) findViewById(R.id.but_minus);
        Button butMultiply = (Button) findViewById(R.id.but_multiply);
        Button butDivide = (Button) findViewById(R.id.but_division);

        textResult = (TextView) findViewById(R.id.text_result);
        butPlus.setOnClickListener(butHandler);
        butMinus.setOnClickListener(butHandler);
        butMultiply.setOnClickListener(butHandler);
        butDivide.setOnClickListener(butHandler);*/

    }
    View.OnClickListener butNumHandler = new View.OnClickListener() {
        EditText Edit1;
        @Override
        public void onClick(View view) {

        }
    };

    View.OnClickListener butOpHandler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                int result = 0;

                switch(view.getId()){
                    case R.id.but_plus :
                        result = num1 + num2;
                        break;
                    case R.id.but_minus :
                        result = num1 - num2;
                        break;
                    case R.id.but_multiply :
                        result = num1 * num2;
                        break;
                    case R.id.but_division :
                        result = num1 / num2;
                        break;
                }
                textResult.setText(result+"");
            }
        };
}
