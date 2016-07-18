package edu.fau.jeff.discoverycentergithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import java.lang.*;
import java.util.*;


/**
 * Created by Clauciela on 7/15/2016.
 */
public class Trivia extends AppCompatActivity{
    Question on = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question tw = new Question("is 9/11 a hoax?", "yes", "no", "stop trying", "the jews did it");
    Question th = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question fo = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question fi = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question si = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question se = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question ei = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question ni = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question te = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question[] quiz = {on, tw, th, fo, fi, si, se, ei, ni, te};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
        quizMethod();
    }

    public void quizMethod(){
        // for(Question q: quiz){
        Question q = on;
        ((TextView)findViewById(R.id.textView)).setText(q.getQ());
        ArrayList<String> ansarr = new ArrayList<String>();
        ansarr.add(q.getA());
        ansarr.add(q.getB());
        ansarr.add(q.getC());
        ansarr.add(q.getAns());
        Collections.shuffle(ansarr);
        Button button1 = (Button)findViewById(R.id.button);
        button1.setText(ansarr.get(0));
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setText(ansarr.get(1));
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setText(ansarr.get(2));
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setText(ansarr.get(3));
        //  }

    }



}

