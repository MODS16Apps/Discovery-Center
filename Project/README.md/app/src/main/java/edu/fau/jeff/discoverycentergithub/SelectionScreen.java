package edu.fau.jeff.discoverycentergithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelectionScreen extends AppCompatActivity implements View.OnClickListener {
    private ImageView trivia, scavengerHunt, photoAdventure, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);
        trivia=(ImageView) findViewById(R.id.triviagame);
        trivia.setOnClickListener(this);


        scavengerHunt=(ImageView) findViewById(R.id.scavenge);
        scavengerHunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(SelectionScreen.this, ScavengerHunt.class);
                startActivity(i1);
            }
        });

        photoAdventure=(ImageView) findViewById(R.id.photo);
        photoAdventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(SelectionScreen.this, PhotoAdventure.class);
                startActivity(i2);
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
}
