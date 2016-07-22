package edu.fau.jeff.discoverycentergithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import java.lang.*;
import java.util.*;
import android.os.Handler;


/**
 * Created by Clauciela on 7/15/2016.
 */
public class Trivia extends AppCompatActivity implements View.OnClickListener {
    Question q;
    ArrayList<String> ansarr;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    private int f = 0;

    Question on = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infinite");
    Question tw = new Question("pokemon go?", "no", "ojio", "uihui", "yes");
    Question th = new Question("uiju", "dg", "egerg", "erger", "qweeqweq");
    Question fo = new Question("digisiodio", "1o", "100uihui000", "324", "sdfsdf");
    Question fi = new Question("sdgsdfsd", "000", "00", "koioi", "9090");
    Question si = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "i=");
    Question se = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "in");
    Question ei = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "inf");
    Question ni = new Question("How many fish are there in the sea?", "10000", "100000000", "stop trying", "infi");
    Question te = new Question("H", "10000", "100000000", "stop trying", "nigger");
    Question[] quiz = {on, tw, th, fo, fi, si, se, ei, ni, te};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        quizMethod();

    }

    public void quizMethod() {
        button.setBackgroundResource(R.drawable.answerbox);
        button2.setBackgroundResource(R.drawable.answerbox);
        button3.setBackgroundResource(R.drawable.answerbox);
        button4.setBackgroundResource(R.drawable.answerbox);
        q = quiz[f];
        ((TextView) findViewById(R.id.textView)).setText(q.getNum()+". "+q.getQ());
        ansarr = new ArrayList<>();
        ansarr.add(q.getA());
        ansarr.add(q.getB());
        ansarr.add(q.getC());
        ansarr.add(q.getAns());
        Collections.shuffle(ansarr);
        button.setText(ansarr.get(0));
        button2.setText(ansarr.get(1));
        button3.setText(ansarr.get(2));
        button4.setText(ansarr.get(3));
    }

    public void clicky(Button butto){
        if (q.correct(butto)) {
            butto.setBackgroundResource(R.drawable.answerboxcorrect);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    f++;
                    ansarr.clear();
                    quizMethod();
                }
            }, 500);

        }else{
            butto.setBackgroundResource(R.drawable.answerboxwrong);
            butto.setText("");
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button: {
                clicky(button);
                break;
            }
            case R.id.button2: {
                clicky(button2);
                break;
            }
            case R.id.button3: {
                clicky(button3);
                break;
            }
            case R.id.button4: {
                clicky(button4);
                break;
            }
        }
    }
}

