package minyoung9913.kr.hs.emirim.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    EditText edit_second;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit_first);
        edit2 = (EditText) findViewById(R.id.edit_second);
        Button butPlus = (Button) findViewById(R.id.but_plus);
        Button butMinus = (Button) findViewById(R.id.but_minus);
        Button butMultiply = (Button) findViewById(R.id.but_multiply);
        Button butDivide = (Button) findViewById(R.id.but_division);
       /* Button gb_1 = (Button) findViewById(R.id.gb_1);
        Button gb_2 = (Button) findViewById(R.id.gb_2);
        Button gb_3 = (Button) findViewById(R.id.gb_3);
        Button gb_4 = (Button) findViewById(R.id.gb_4);
        Button gb_5 = (Button) findViewById(R.id.gb_5);
        Button gb_6 = (Button) findViewById(R.id.gb_6);
        Button gb_7 = (Button) findViewById(R.id.gb_7);
        Button gb_8 = (Button) findViewById(R.id.gb_8);
        Button gb_9 = (Button) findViewById(R.id.gb_9);
        Button gb_10 = (Button) findViewById(R.id.gb_10);*/

        textResult = (TextView) findViewById(R.id.text_result);
        butPlus.setOnClickListener(butHandler);
        butMinus.setOnClickListener(butHandler);
        butMultiply.setOnClickListener(butHandler);
        butDivide.setOnClickListener(butHandler);
        /*gb_1.setOnClickListener(but2Handler);
        gb_2.setOnClickListener(but2Handler);
        gb_3.setOnClickListener(but2Handler);
        gb_4.setOnClickListener(but2Handler);
        gb_5.setOnClickListener(but2Handler);
        gb_6.setOnClickListener(but2Handler);
        gb_7.setOnClickListener(but2Handler);
        gb_8.setOnClickListener(but2Handler);
        gb_9.setOnClickListener(but2Handler);
        gb_10.setOnClickListener(but2Handler);

    }
    View.OnClickListener but2Handler = new View.OnClickListener() {
        EditText Edit1;
        @Override
        public void onClick(View view) {
            int result;
            switch(view.getId()){
                case R.id.gb_1 :
                    result = 0;
                    break;
                case R.id.gb_2 :
                    result = 1;
                    break;
                case R.id.gb_3 :
                    result = 2;
                    break;
                case R.id.gb_4 :
                    result = 3;
                    break;
                case R.id.gb_5 :
                    result = 4;
                    break;
                case R.id.gb_6 :
                    result = 5;
                    break;
                case R.id.gb_7 :
                    result = 6;
                    break;
                case R.id.gb_8 :
                    result = 7;
                    break;
                case R.id.gb_9 :
                    result = 8;
                    break;
                case R.id.gb_10 :
                    result = 9;
                    break;
            }
            Edit1.setText(result+"");
        }*/
    };

    View.OnClickListener butHandler = new View.OnClickListener() {
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
