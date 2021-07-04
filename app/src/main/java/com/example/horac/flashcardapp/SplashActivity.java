package com.example.horac.flashcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class SplashActivity extends AppCompatActivity {
    private Button btnClickk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btnClickk=findViewById(R.id.btnClickk);

        btnClickk.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        });

    }
}