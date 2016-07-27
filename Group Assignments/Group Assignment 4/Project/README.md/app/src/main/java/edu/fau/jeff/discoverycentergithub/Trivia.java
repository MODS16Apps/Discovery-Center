package edu.fau.jeff.discoverycentergithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Button;
import java.lang.*;
import java.util.*;
import android.os.Handler;


/**
 * Created by Clauciela on 7/15/2016.
 */
public class Trivia extends AppCompatActivity implements View.OnClickListener {
    Question q;
    ProgressBar n;
    ArrayList<String> ansarr;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    private int f = 0;

    Question on = new Question("What kind of Fig Tree lies in the Discovery Center?", "Orange", "Palm", "Conadria", "Strangler");
    Question tw = new Question("Where does the most orange juice come from?", "California", "Arizona", "Texas", "Florida");
    Question th = new Question("What is the name of the Discovery Centers greatest clubhouse?", "The Fort Lauderdale Clubhouse", "MODS Clubhouse", "Discover Clubhouse", "Curiousity Clubhouse");
    Question fo = new Question("What buildable mechanical toys can you play with here?", "Axles", "Magnets", "Bikes", "Gears");
    Question fi = new Question("What is the historic building this exhibit is based off of?", "The Bonnet House", "The Stranahan House", "Los Olas", "The New River Inn");
    Question si = new Question("Where can you build/destroy a house?", "Construction site", "Destruction Site", "Build-It House", "Wacky Walls");
    Question se = new Question("What is the name of the Discovery Centers beloved sail boat?", "The Los Olas", "Discovery Boat", "MODS", "Kids Cove");
    Question ei = new Question("What is the longest bone in your body?", "Tibia", "Fibula", "Radius", "Femur");
    Question ni = new Question("What is the shortest bone in the body?", "Sternum", "Distal phalanx", "Calcanetum", "Stirrup");
    Question te = new Question("Where are there the most bones?", "The Feet", "The Head", "The Spine", "The Hands");
    Question[] quiz = {on, tw, th, fo, fi, si, se, ei, ni, te};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_trivia);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        n = (ProgressBar) findViewById(R.id.progressBar);
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
        if((f+1)!=quiz.length){
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
        }else{
            Question.RESETCOUNTER();
            Intent i0=new Intent(this, SelectionScreen.class);
            startActivity(i0);

        }
    }

    public void clicky(Button butto){
        if (q.correct(butto)) {
            butto.setText("");
            butto.setBackgroundResource(R.drawable.answerboxcorrect);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    f++;
                    n.setProgress(f*10);
                    ansarr.clear();
                    quizMethod();
                }
            }, 700);

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
    public boolean onLongClick(View v) {
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
        return true;
    }
}

