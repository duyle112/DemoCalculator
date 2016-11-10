package com.example.hoangduy.calculator;

import java.util.Stack;

/**
 * Created by HoangDuy on 04/11/2016.
 */
public class Computation {
    public  int getPriority(Character s)
    {
        if(s=='+'||s=='-')
        {
            return 1;
        }
        else if(s=='*'||s=='/')
        {
            return 2;
        }
        return 0;
    }
    public  String getpostfix(String s)
    {
        int i=0;
        String output="";
        Stack<Character> operator=new Stack<Character>();
        while(i<s.length())
        {
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
            {
                while(!operator.isEmpty()&&getPriority(operator.get(operator.size()-1)) >= getPriority(s.charAt(i))) {
                    output += operator.pop();
                }
                operator.push(s.charAt(i));
            }
            else if(s.charAt(i)=='(')
            {
                operator.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                while (operator.get(operator.size()-1)!='(')
                {
                    output+=operator.pop();
                }
                operator.pop();
            }
            else
            {

                while(i<s.length()&&s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='*'&&s.charAt(i)!='/'&&s.charAt(i)!=')'&&s.charAt(i)!='(')
                {
                    output+=s.charAt(i);
                    i++;
                }
                output+=" ";
                continue;
            }
            i++;
        }
        while(!operator.isEmpty())
        {
            output+=operator.pop();
        }
        return output;
    }
    public  double getResult(String s)
    {
        String tp="0";
        String postfix="0 "+getpostfix(s);
        System.out.println(postfix);
        Stack<Double> sta=new Stack<Double>();
        int i=0;
        double temp=0;
        double result=0;
        for( i=0;i<postfix.length();i++)
        {
            if(postfix.charAt(i)=='+'||postfix.charAt(i)=='-'||postfix.charAt(i)=='*'||postfix.charAt(i)=='/')
            {

                double x1=sta.pop();
                double x2=sta.pop();
                result=calculate(x2,x1,postfix.charAt(i));
                sta.push(result);
                continue;
            }
            while(postfix.charAt(i)!=' '&&postfix.charAt(i)!='+'&&postfix.charAt(i)!='-'&&postfix.charAt(i)!='*'&&postfix.charAt(i)!='/')
            {
                tp+=postfix.charAt(i);
                i++;
            }
            temp=Double.parseDouble(tp);
            System.out.println(temp);
            sta.push(temp);
            tp="0";
        }
        return result;
    }
    public static double calculate(double x,double y,char operator)
    {
        double temp=0;
        switch (operator)
        {
            case '+': temp= x+y;break;
            case '-': temp= x-y;break;
            case '*': temp= x*y;break;
            case '/': temp= x/y;break;
        }
        return temp;
    }
}
