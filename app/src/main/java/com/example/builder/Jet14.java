package com.example.builder;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Jet14 extends AppCompatActivity {
    ImageButton DisplayJet14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jet14);
        DisplayJet14 = findViewById(R.id.DisplayJet14);

    }
    public void open(View view) {

        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH ){
            DisplayJet14.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION );

        }
        else if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
            DisplayJet14.setSystemUiVisibility( View.SYSTEM_UI_FLAG_FULLSCREEN );
        else{}


    }
}
