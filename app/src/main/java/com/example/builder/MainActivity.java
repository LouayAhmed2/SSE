package com.example.builder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    Button Scooter,Comparison,Stores;
    TextView Scooterstxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scooterstxt = findViewById(R.id.scooter_btn);
        Scooter =findViewById(R.id.scooter_btn);
        Comparison = findViewById(R.id.Comparison_btn);
        Stores = findViewById(R.id.Service_btn);








        Scooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Scooters.class);
                startActivity(intent);
            }
        });
        Comparison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelfMaintenance.class);
                startActivity(intent);
            }
        });
        Stores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StoresActivity.class);
                startActivity(intent);
            }
        });
    }
}
