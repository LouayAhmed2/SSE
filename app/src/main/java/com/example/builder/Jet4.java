package com.example.builder;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Jet4 extends AppCompatActivity {
    ImageButton DisplayJet4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jet4);
        DisplayJet4 = findViewById(R.id.DisplayJet4);

    }
    public void open(View view) {

        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH ){
            DisplayJet4.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION );

        }
        else if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
            DisplayJet4.setSystemUiVisibility( View.SYSTEM_UI_FLAG_FULLSCREEN );
        else{}


    }
}
