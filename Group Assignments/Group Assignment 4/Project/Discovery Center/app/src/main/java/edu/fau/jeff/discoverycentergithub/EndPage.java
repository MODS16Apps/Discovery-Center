package edu.fau.jeff.discoverycentergithub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Clauciela on 7/27/2016.
 */
public class EndPage extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_page);
        TextView n = (TextView) findViewById(R.id.textView5);
        n.setText(Integer.toString(Trivia.getScore() * 10)+"%");
        Button b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5: {
                Trivia.resetScore();
                Intent i1 = new Intent(this, SelectionScreen.class);
                startActivity(i1);
                break;
            }

        }
    }
}