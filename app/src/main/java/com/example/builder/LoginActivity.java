package com.example.builder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.builder.login.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    private DatabaseReference users;
    EditText edtName, edtPassword;
    Button login;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtName = (EditText) findViewById(R.id.username);
        edtPassword = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        database = FirebaseDatabase.getInstance();
        users = database.getReference("Users");


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin(edtName.getText().toString(),edtPassword.getText().toString());
            }
        });
    }

    private void signin(final String username,final  String password) {
        users.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.child(username).exists()){
                    if (!username.isEmpty()){
                        User login = dataSnapshot.child(username).getValue(User.class);
                        if (login.getpassword().equals(password)){
                            Toast.makeText(LoginActivity.this,"Welcome",Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }
                }else {
                    Toast.makeText(LoginActivity.this,"Try Again",Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}