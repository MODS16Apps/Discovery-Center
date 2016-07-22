package edu.fau.jeff.discoverycentergithub;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView startButton;
    private EditText name, age;
    private RadioButton male, female;
    private String nameInput, ageInput;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        startButton=(ImageView) findViewById(R.id.imageView);
        name=(EditText)findViewById(R.id.enterName_editText);
        age=(EditText)findViewById(R.id.dayOfBirth_editText);
        startButton.setOnClickListener(this);


        male=(RadioButton)findViewById(R.id.male_radioButton);
        female=(RadioButton)findViewById(R.id.female_radioButton);
        male.setOnClickListener(this);
        female.setOnClickListener(this);

        //startButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Log.v(nameInput, name.getText().toString());
        //        Log.v(ageInput, age.getText().toString());
        //        Intent intent=new Intent(MainActivity.this, SelectionScreen.class);
        //        startActivity(intent);
        //    }
        //});

        }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.imageView:
                Log.v(nameInput, name.getText().toString());
                Log.v(ageInput, age.getText().toString());
                //Here goes the AsyncTask (wendsday)
                Intent intent=new Intent(this, SelectionScreen.class);
                startActivity(intent);
                break;
            case R.id.male_radioButton:
                if(female.isChecked()){
                    female.setChecked(false);
                    male.setChecked(true);
                }

                break;
            case R.id.female_radioButton:
                if(male.isChecked()){
                    male.setChecked(false);
                    female.setChecked(true);
                }
                break;
        }

    }




}
