package com.example.builder;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FiddleTwo extends AppCompatActivity {
    ImageButton DisplayFiddle2;
    TextView PriceDicription2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fiddle_two);
        DisplayFiddle2 = findViewById(R.id.Displayfiddle2);




    }



    public void open(View view) {

        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH ){
            DisplayFiddle2.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION );

        }
        else if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
            DisplayFiddle2.setSystemUiVisibility( View.SYSTEM_UI_FLAG_FULLSCREEN );
        else{}


    }
}

