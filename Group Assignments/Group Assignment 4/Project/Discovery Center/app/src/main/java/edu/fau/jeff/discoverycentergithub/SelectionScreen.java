package edu.fau.jeff.discoverycentergithub;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectionScreen extends AppCompatActivity implements View.OnClickListener {
    private ImageView trivia, scavengerHunt, photoAdventure, settings;
    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_selection_screen);
        trivia=(ImageView) findViewById(R.id.triviagame);
        trivia.setOnClickListener(this);
        Intent ii=getIntent();
        Bundle b=ii.getExtras();
        welcome=(TextView)findViewById(R.id.textView6);
        welcome.setText("   Welcome to the Discovery Center, ");
        if(b!=null){
            welcome.setText(welcome.getText()+(String)b.get("name"));
        }


        scavengerHunt=(ImageView) findViewById(R.id.newriverinn);
        scavengerHunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(SelectionScreen.this, NewRiverInn.class);
                startActivity(i1);
            }
        });

        photoAdventure=(ImageView) findViewById(R.id.photo);
        photoAdventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkCameraHardware()) {
                    Intent i2 = new Intent(SelectionScreen.this, PhotoAdventure.class);
                    startActivity(i2);
                }



            }
        });

        settings=(ImageView) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(SelectionScreen.this, Settings.class);
                startActivity(i3);
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.triviagame:

                Intent i0=new Intent(this, Trivia.class);


                startActivity(i0);
                break;
        }

    }

    private boolean checkCameraHardware(){
        if(getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            return true;
        }
        else{
            return false;
        }
    }
}
