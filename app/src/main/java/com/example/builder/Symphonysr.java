package com.example.builder;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Symphonysr extends AppCompatActivity {
    ImageButton Displaysr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symphonysr);
        Displaysr = findViewById(R.id.Displaysr);


    }
    public void open(View view) {

        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH ){
            Displaysr.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION );

        }
        else if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
            Displaysr.setSystemUiVisibility( View.SYSTEM_UI_FLAG_FULLSCREEN );
        else{}


    }

}
