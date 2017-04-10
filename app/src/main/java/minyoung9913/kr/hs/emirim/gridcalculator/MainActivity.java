package minyoung9913.kr.hs.emirim.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button[] butNums = new Button[10];
    Button[] butOps = new Button[4];
    public static final int SELECT_EDIT1=0;
    public static final int SELECT_EDIT2=1;
    int selectEdit = SELECT_EDIT1;
    String numStr = "";
    EditText edit1, edit2;
    TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        textResult = (TextView)findViewById(textresult);
        edit1.setOnTouchListener(editHandler);
        edit2.setOnTouchListener(editHandler);
        for(int i=0;i<butNums.length;i++){
            butNums[i] = (Button)findViewById(R.id.gb_1+i);
            butNums[i].setOnClickListener(butNumHandler);
            // butNums[i] = (Button)findViewById(R.id.ids[i]);
        }
        for(int i =0;i<butOps.length;i++){
            butOps[i] =(Button) findViewById(R.id.but_plus+i);
            butOps[i].setOnClickListener(butOpHandler);
        }
    }
    View.OnClickListener butNumHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Button but = (Button)view;
            numStr+=but.getText();
            switch (selectEdit){
                case SELECT_EDIT1:
                    edit1.setText(numStr);
                    break;
                case SELECT_EDIT2:
                    edit2.setText(numStr);
                    break;
            }
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
    View.OnTouchListener editHandler=new View.OnTouchListener(){
        @Override
        public boolean onTouch(View view,MotionEvent motionEvent){
            Toast.makeText(getApplicationContext(), "touch..", Toast.LENGTH_LONG).show();
            numStr="";
            switch(view.getId()){
                case R.id.edit1:
                    selectEdit = SELECT_EDIT1;
                    break;
                case R.id.edit2:
                    selectEdit=SELECT_EDIT2;
                    break;
            }
            return true;
        }
    };

}
