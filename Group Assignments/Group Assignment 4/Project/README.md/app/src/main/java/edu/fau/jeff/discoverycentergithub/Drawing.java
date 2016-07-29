package edu.fau.jeff.discoverycentergithub;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;

public class Drawing extends AppCompatActivity {
    private static Bitmap picture;
    private DoodleView doodleView;
    private DoodleView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent ii=getIntent();
        Bundle b=ii.getExtras();
        if(b!=null){
            File f=(File)b.get("test");
            BitmapFactory.Options bmOptions = new BitmapFactory.Options();
            Bitmap bit= BitmapFactory.decodeFile(f.getAbsolutePath(), bmOptions);

            picture=bit;
        }
        DoodleView.setBitmap(picture);
        setContentView(R.layout.activity_drawing_screen);
        //addPicture=(Button)findViewById(R.id.button5);
        //display= (ImageView) findViewById(R.id.imageView6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        doodleView = (DoodleView)findViewById(R.id.doodleView);

        //doodleView.setTag(1, picture);

        int screenSize=getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
        if(screenSize==Configuration.SCREENLAYOUT_SIZE_XLARGE)
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        else
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public Bitmap getPicture(){return picture;}



}
