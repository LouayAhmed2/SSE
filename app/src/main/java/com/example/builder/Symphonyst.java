package com.example.builder;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Symphonyst extends AppCompatActivity {
    ImageButton Displayst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symphonysr);
        Displayst = findViewById(R.id.Displayst);


    }
    public void open(View view) {

        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH ){
            Displayst.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION );

        }
        else if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
            Displayst.setSystemUiVisibility( View.SYSTEM_UI_FLAG_FULLSCREEN );
        else{}


    }

}
