package com.example.builder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class StoresActivity extends AppCompatActivity {

    Spinner spinnermodel,spinnerarea;
    Button SpinnerSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
        spinnermodel = findViewById(R.id.spinner_model);
        spinnerarea =findViewById(R.id.Spinner_area);
        SpinnerSearch= findViewById(R.id.search_btn);


        ArrayAdapter<CharSequence> areadata = ArrayAdapter.createFromResource(this,R.array.Spinner_Area,android.R.layout.simple_spinner_item);
        spinnerarea.setAdapter(areadata);

        spinnerarea.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){

                    ArrayAdapter<CharSequence> Empty= ArrayAdapter.createFromResource(StoresActivity.this,R.array.Empty,android.R.layout.simple_spinner_item);
                    spinnermodel.setAdapter(Empty);
                } if (position==1){
                    ArrayAdapter<CharSequence> obur= ArrayAdapter.createFromResource(StoresActivity.this,R.array.Spinner_Area,android.R.layout.simple_spinner_item);
                    spinnermodel.setAdapter(obur);
                    SpinnerSearch.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(StoresActivity.this,Eltawkel.class);
                            startActivity(intent);
                        }
                    });
                }
            }




            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }     });
    }

}
