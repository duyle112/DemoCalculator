package com.example.hoangduy.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvn0;
    private TextView mTvn1;
    private TextView mTvn2;
    private TextView mTvn3;
    private TextView mTvn4;
    private TextView mTvn5;
    private TextView mTvn6;
    private TextView mTvn7;
    private TextView mTvn8;
    private TextView mTvn9;
    private TextView mTvdot;
    private TextView mTvpercent;
    private TextView mTvminus;
    private TextView mTvplus;
    private TextView mTvdiv;
    private TextView mTvmul;
    private TextView mTvequal;
    private TextView mTvclear;
    private TextView mTvclearall;
    private TextView mTvinput;
    private TextView mTvresult;
    private TextView mTvback;
    private int flag = 0;
    private String result = "";
    private TextView mTvsqrt;
    private static int sqrt = 0;
    int flago = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        mTvn0 = (TextView) findViewById(R.id.tvn0);
        mTvn1 = (TextView) findViewById(R.id.tvn1);
        mTvn2 = (TextView) findViewById(R.id.tvn2);
        mTvn3 = (TextView) findViewById(R.id.tvn3);
        mTvn4 = (TextView) findViewById(R.id.tvn4);
        mTvn5 = (TextView) findViewById(R.id.tvn5);
        mTvn6 = (TextView) findViewById(R.id.tvn6);
        mTvn7 = (TextView) findViewById(R.id.tvn7);
        mTvn8 = (TextView) findViewById(R.id.tvn8);
        mTvn9 = (TextView) findViewById(R.id.tvn9);
        mTvplus = (TextView) findViewById(R.id.tvplus);
        mTvminus = (TextView) findViewById(R.id.tvminus);
        mTvmul = (TextView) findViewById(R.id.tvmul);
        mTvdiv = (TextView) findViewById(R.id.tvdiv);
        mTvequal = (TextView) findViewById(R.id.tvequal);
        mTvdot = (TextView) findViewById(R.id.tvdot);
        mTvpercent = (TextView) findViewById(R.id.tvpercent);
        mTvclear = (TextView) findViewById(R.id.tvclear);
        mTvclearall = (TextView) findViewById(R.id.tvclearall);
        mTvinput = (TextView) findViewById(R.id.tvinput);
        mTvresult = (TextView) findViewById(R.id.tvresult);
        mTvsqrt = (TextView) findViewById(R.id.tvsqr);
        mTvback = (TextView) findViewById(R.id.tvback);

        mTvn0.setOnClickListener(this);
        mTvsqrt.setOnClickListener(this);
        mTvn1.setOnClickListener(this);
        mTvn2.setOnClickListener(this);
        mTvn3.setOnClickListener(this);
        mTvn4.setOnClickListener(this);
        mTvn5.setOnClickListener(this);
        mTvn6.setOnClickListener(this);
        mTvn7.setOnClickListener(this);
        mTvn8.setOnClickListener(this);
        mTvn9.setOnClickListener(this);
        mTvplus.setOnClickListener(this);
        mTvminus.setOnClickListener(this);
        mTvmul.setOnClickListener(this);
        mTvdiv.setOnClickListener(this);
        mTvequal.setOnClickListener(this);
        mTvdot.setOnClickListener(this);
        mTvpercent.setOnClickListener(this);
        mTvclear.setOnClickListener(this);
        mTvclearall.setOnClickListener(this);
        mTvback.setOnClickListener(this);
        mTvresult.setMovementMethod(new ScrollingMovementMethod());
        mTvinput.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.n0:
                if (flag == 0) {
                    result += "0";
                    flago = 2;
                } else {
                    result = "0";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n1:
                if (flag == 1) {
                    result += "1";
                    flago = 2;
                } else {
                    result = "1";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n2:
                if (flag == 0) {
                    result += "2";
                    flago = 2;
                } else {
                    result = "2";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n3:
                if (flag == 0) {
                    result += "3";
                    flago = 2;
                } else {
                    result = "3";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n4:
                if (flag == 0) {
                    result += "4";
                    flago = 2;
                } else {
                    result = "4";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n5:
                if (flag == 0) {
                    result += "5";
                    flago = 2;
                } else {
                    result = "5";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n6:
                if (flag == 0) {
                    result += "6";
                    flago = 2;
                } else {
                    result = "6";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n7:
                if (flag == 0) {
                    result += "7";
                    flago = 2;
                } else {
                    result = "7";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n8:
                if (flag == 0) {
                    result += "8";
                    flago = 2;
                } else {
                    result = "8";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.n9:
                if (flag == 0) {
                    result += "9";
                    flago = 2;
                } else {
                    result = "9";
                    flag = 0;
                }
                mTvresult.setText(result);
                break;
            case R.id.dot:
                result += '.';
                mTvresult.setText(result);
                break;
            case R.id.percent:
                result += "%";
                mTvresult.setText(result);
                break;
            case R.id.oplus:
                if (flago == 2) {
                    result += '+';
                    flag = 0;
                    flago = 0;
                    mTvresult.setText(result);
                }
                break;
            case R.id.ominus:
                if (flago == 2) {
                    result += '-';
                    flag = 0;
                    flago = 0;
                    mTvresult.setText(result);
                }
                break;
            case R.id.omul:
                if (flago == 2) {
                    result += '*';
                    flag = 0;
                    flago = 0;
                    mTvresult.setText(result);
                }
                break;
            case R.id.odiv:
                if (flago == 2) {
                    result += '/';
                    flag = 0;
                    flago = 0;
                    mTvresult.setText(result);
                }
                break;
            case R.id.clear:
                result = "";
                mTvresult.setText("");
                break;
            case R.id.clearall:
                result = "";
                mTvresult.setText(result);
                mTvinput.setText(result);
                break;
            case R.id.sqr:
                result += "√";
                sqrt++;
                mTvresult.setText(result);
                break;
            case R.id.back:
                try {
                    result = result.substring(0, result.length() - 1);
                    mTvresult.setText(result);
                    break;
                } catch (Exception e) {

                }
            case R.id.oequal:
                Computation computation = new Computation();
                try {
                    for (int i = 0; i < sqrt; i++) {
                        result = filter(result);
                    }
                    sqrt = 0;
                    mTvinput.setText(mTvresult.getText().toString());
                    float realresult = (float) computation.getResult(result);
                    mTvresult.setText(realresult + "");
                    result = mTvresult.getText().toString();
                    flag = 1;
                    mTvresult.scrollTo(0, 0);
                    break;
                } catch (Exception e) {

                }
        }
    }

    public String filter(String result) {
        if (sqrt > 0) {
            double a = 0;
            int sqrtPos = 0;
            int endPos = 0;
            Maths maths = new Maths(0, 0, "");
            a = maths.sqrt(result);
            sqrtPos = maths.getStart();
            endPos = maths.getEnd();
            result = joinString(sqrtPos, endPos, a);
        }
        return result;
    }

    public String joinString(int end, int start, Double a) {
        return result.substring(0, end) + String.valueOf(a) + result.substring(start, result.length());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("mTvresult", mTvresult.getText().toString());
        outState.putString("mTvinput", mTvinput.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mTvresult.setText(savedInstanceState.getString("mTvresult"));
        mTvinput.setText(savedInstanceState.getString("mTvinput"));
    }
}
