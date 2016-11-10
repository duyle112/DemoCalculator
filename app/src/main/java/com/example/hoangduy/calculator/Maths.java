package com.example.hoangduy.calculator;

/**
 * Created by HoangDuy on 04/11/2016.
 */
public class Maths {
    private int start;
    private int end;
    private String str;

    public Maths(int start, int end, String str) {
        this.start = start;
        this.end = end;
        this.str = str;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getStr() {
        return str;
    }

    public double sqrt(String result) {
        for (int i = 0; i < result.length(); i++) {
            start = i;
            if (result.charAt(i) == '√') {
                i++;
                while (i < result.length() && (result.charAt(i) != '+') && (result.charAt(i) != '-')
                        && (result.charAt(i) != '*') && (result.charAt(i) != '+')) {
                    str += result.charAt(i++);
                    end = i;
                }
                return Math.sqrt(Double.parseDouble(str));
            }
        }
        return 0;
    }
}
