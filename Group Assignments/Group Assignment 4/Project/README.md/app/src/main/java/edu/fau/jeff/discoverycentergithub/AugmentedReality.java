package edu.fau.jeff.discoverycentergithub;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AugmentedReality extends AppCompatActivity {

    private Button ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_augmented_reality);
        ar=(Button)findViewById(R.id.button7);
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PackageManager pm = getPackageManager();
                Intent appStartIntent = pm.getLaunchIntentForPackage("com.Airplane.Plane");
                if (null != appStartIntent)
                {
                    startActivity(appStartIntent);
                }
            }
        });
    }


}
