package edu.fau.jeff.discoverycentergithub;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by Jeffrey S on 7/17/2016.
 */
public class NewRiverInn extends AppCompatActivity{

    private ImageView test;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_new_river_inn);
        test=(ImageView)findViewById(R.id.imageView4);


    }

}
