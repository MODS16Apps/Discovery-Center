package edu.fau.jeff.discoverycentergithub;

import android.app.Activity;

/**
 * Created by Clauciela on 7/15/2016.
 */
public class Question extends Activity{
    private int num = 1;
    private String q;
    private String a;
    private String b;
    private String c;
    private String ans;

    public Question(String q, String a, String b, String c, String ans){
        this.num++;
        this.q = q;
        this.a = a;
        this.b = b;
        this.c = c;
        this.ans = ans;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
