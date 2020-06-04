package com.example.builder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eltawkel extends AppCompatActivity {
    Button web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eltawkel);

    }

    public void whatsapp(View view) {
        Uri uri = Uri.parse("https://wa.me/201271384149");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void Call(View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0226985678"));
        startActivity(intent);




    }

    public void Web(View view) {
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.symegypt.com"));
        startActivity(implicit);
    }

    public void GetDirection(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/%D9%87%D8%A7%D9%85%D8%B1%D8%B2+%D8%A7%D9%84%D8%B9%D8%A7%D9%84%D9%85%D9%8A%D8%A9+%D9%84%D8%B5%D9%86%D8%A7%D8%B9%D8%A9+%D9%88%D8%B3%D8%A7%D8%A6%D9%84+%D8%A7%D9%84%D9%86%D9%82%D9%84+%D8%A7%D9%84%D8%AE%D9%81%D9%8A%D9%81%E2%80%AD/@30.2693442,31.3334232,11z/data=!4m5!3m4!1s0x145805a37b61db47:0xa676057463c0d410!8m2!3d30.2693442!4d31.4734989"));
        startActivity(intent);
    }
}
