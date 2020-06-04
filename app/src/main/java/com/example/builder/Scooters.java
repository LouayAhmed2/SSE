package com.example.builder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Scooters extends AppCompatActivity {
    Spinner spinner;
    Button SpinnerSearchScooter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scooters);
        spinner=findViewById(R.id.Spinner_model);
        SpinnerSearchScooter =findViewById(R.id.search_btn);

        ArrayAdapter<CharSequence> data = ArrayAdapter.createFromResource(this,R.array.Spinner_Area,android.R.layout.simple_spinner_item);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(data);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



                if (parent.getItemAtPosition(position).equals("           ")){

                }else if (parent.getItemAtPosition(position).equals("Fiddle 2")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, FiddleTwo.class);
                            startActivity(intent);
                        }
                    });
                }else if (parent.getItemAtPosition(position).equals("Fiddle 3")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, FiddleThree.class);
                            startActivity(intent);
                        }
                    });

                }else if (parent.getItemAtPosition(position).equals("Jet 4")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, Jet4.class);
                            startActivity(intent);
                        }
                    });
                }else if (parent.getItemAtPosition(position).equals("Orbit 2")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, Orbit.class);
                            startActivity(intent);
                        }
                    });
                }else if (parent.getItemAtPosition(position).equals("Symphony SR")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, Symphonysr.class);
                            startActivity(intent);
                        }
                    });
                }else if (parent.getItemAtPosition(position).equals("Symphony S")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, Symphonys.class);
                            startActivity(intent);
                        }
                    });

                }else if (parent.getItemAtPosition(position).equals("Symphony ST")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, Symphonyst.class);
                            startActivity(intent);
                        }
                    });
                }else if (parent.getItemAtPosition(position).equals("Jet 14")){
                    SpinnerSearchScooter.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Scooters.this, Jet14.class);
                            startActivity(intent);
                        }
                    });


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
