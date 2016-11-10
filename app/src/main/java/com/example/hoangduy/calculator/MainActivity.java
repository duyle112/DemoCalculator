package com.example.hoangduy.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtn0;
    TextView txtn1;
    TextView txtn2;
    TextView txtn3;
    TextView txtn4;
    TextView txtn5;
    TextView txtn6;
    TextView txtn7;
    TextView txtn8;
    TextView txtn9;
    TextView txtdot;
    TextView txtpercent;
    TextView txtominus;
    TextView txtoplus;
    TextView txtodiv;
    TextView txtomul;
    TextView txtoequal;
    TextView txtclear;
    TextView txtclearall;
    TextView txtinput;
    TextView txtresult;
    TextView txtback;
    int flag=0;
    String result="";
    TextView txtsqrt;
    private static int sqrt=0;
    int flago=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        txtn0 = (TextView) findViewById(R.id.n0);
        txtn1 = (TextView) findViewById(R.id.n1);
        txtn2 = (TextView) findViewById(R.id.n2);
        txtn3 = (TextView) findViewById(R.id.n3);
        txtn4 = (TextView) findViewById(R.id.n4);
        txtn5 = (TextView) findViewById(R.id.n5);
        txtn6 = (TextView) findViewById(R.id.n6);
        txtn7 = (TextView) findViewById(R.id.n7);
        txtn8 = (TextView) findViewById(R.id.n8);
        txtn9 = (TextView) findViewById(R.id.n9);
        txtoplus = (TextView) findViewById(R.id.oplus);
        txtominus = (TextView) findViewById(R.id.ominus);
        txtomul = (TextView) findViewById(R.id.omul);
        txtodiv = (TextView) findViewById(R.id.odiv);
        txtoequal = (TextView) findViewById(R.id.oequal);
        txtdot = (TextView) findViewById(R.id.dot);
        txtpercent = (TextView) findViewById(R.id.percent);
        txtclear = (TextView) findViewById(R.id.clear);
        txtclearall = (TextView) findViewById(R.id.clearall);
        txtinput = (TextView) findViewById(R.id.txtinput);
        txtresult = (TextView) findViewById(R.id.result);
        txtsqrt = (TextView) findViewById(R.id.sqr);
        txtback = (TextView) findViewById(R.id.back);

        txtn0.setOnClickListener(this);
        txtsqrt.setOnClickListener(this);
        txtn1.setOnClickListener(this);
        txtn2.setOnClickListener(this);
        txtn3.setOnClickListener(this);
        txtn4.setOnClickListener(this);
        txtn5.setOnClickListener(this);
        txtn6.setOnClickListener(this);
        txtn7.setOnClickListener(this);
        txtn8.setOnClickListener(this);
        txtn9.setOnClickListener(this);
        txtoplus.setOnClickListener(this);
        txtominus.setOnClickListener(this);
        txtomul.setOnClickListener(this);
        txtodiv.setOnClickListener(this);
        txtoequal.setOnClickListener(this);
        txtdot.setOnClickListener(this);
        txtpercent.setOnClickListener(this);
        txtclear.setOnClickListener(this);
        txtclearall.setOnClickListener(this);
        txtback.setOnClickListener(this);
        txtresult.setMovementMethod(new ScrollingMovementMethod());
        txtinput.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.n0:
                 if (flag == 0 )
                 {
                 result += "0";
                 flago=2;
                 } else {
                     result = "0";
                     flag = 0;
                 }
                 txtresult.setText(result);
                 break;
            case R.id.n1:
                if (flag == 1 )
                {
                    result += "1";
                    flago=2;
                } else {
                    result = "1";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n2:
                if (flag == 0 )
                {
                    result += "2";
                    flago=2;
                } else {
                    result = "2";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n3:
                if (flag == 0 )
                {
                    result += "3";
                    flago=2;
                } else {
                    result = "3";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n4:
                if (flag == 0 )
                {
                    result += "4";
                    flago=2;
                } else {
                    result = "4";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n5:
                if (flag == 0 )
                {
                    result += "5";
                    flago=2;
                } else {
                    result = "5";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n6:
                if (flag == 0 )
                {
                    result += "6";
                    flago=2;
                } else {
                    result = "6";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n7:
                if (flag == 0 )
                {
                    result += "7";
                    flago=2;
                } else {
                    result = "7";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n8:
                if (flag == 0 )
                {
                    result += "8";
                    flago=2;
                } else {
                    result = "8";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.n9:
                if (flag == 0 )
                {
                    result += "9";
                    flago=2;
                } else {
                    result = "9";
                    flag = 0;
                }
                txtresult.setText(result);
                break;
            case R.id.dot:
                result += '.';
                txtresult.setText(result);
                break;
            case R.id.percent: result += "%";
                txtresult.setText(result);
                break;
            case R.id.oplus:
                if (flago == 2) {
                result += '+';
                flag = 0;
                flago=0;
                txtresult.setText(result);
                }
                break;
            case R.id.ominus:
                if (flago == 2) {
                    result += '-';
                    flag = 0;
                    flago=0;
                    txtresult.setText(result);
                }
                break;
            case R.id.omul:
                if (flago == 2) {
                    result += '*';
                    flag = 0;
                    flago=0;
                    txtresult.setText(result);
                }
                break;
            case R.id.odiv:
                if (flago == 2) {
                    result += '/';
                    flag = 0;
                    flago=0;
                    txtresult.setText(result);
                }
                break;
            case R.id.clear: result = "";
                txtresult.setText("");
                break;
            case R.id.clearall: result = "";
                txtresult.setText(result);
                txtinput.setText(result);
                break;
            case R.id.sqr: result += "√";
                sqrt++;
                txtresult.setText(result);
                break;
            case R.id.back:
                try {
                    result = result.substring(0, result.length() - 1);
                    txtresult.setText(result);
                    break;
                } catch (Exception e) {

                }
            case R.id.oequal:
                Computation computation = new Computation();
                try {
                    for (int i = 0; i < sqrt; i++)
                    {
                        result = filter(result);
                    }
                    sqrt = 0;
                    txtinput.setText(txtresult.getText().toString());
                    float realresult = (float)computation.getResult(result);
                    txtresult.setText(realresult+"");
                    result=txtresult.getText().toString();
                    flag = 1;
                    txtresult.scrollTo(0,0);
                    break;
                } catch (Exception e) {

                }
        }
    }

    public String filter(String result) {
        if (sqrt > 0) {
            double a = 0;
            int sqrtPos=0;
            int endPos=0;
            Maths maths = new Maths(0,0,"");
            a = maths.sqrt(result);
            sqrtPos = maths.getStart();
            endPos = maths.getEnd();
            result = joinString(sqrtPos,endPos,a);
        }
        return result;
    }
    public String joinString (int end, int start, Double a) {
        return result.substring(0,end) + String.valueOf(a) + result.substring(start,result.length());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("txtresult",txtresult.getText().toString());
        outState.putString("txtinput",txtinput.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        txtresult.setText(savedInstanceState.getString("txtresult"));
        txtinput.setText(savedInstanceState.getString("txtinput"));
    }
}
