package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WinstonIsOnTikTok extends AppCompatActivity {
    Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winston_is_on_tik_tok);
        next1=findViewById(R.id.button);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent BenIsBoring = new Intent(WinstonIsOnTikTok.this,MainActivity.class);
                startActivity(BenIsBoring);
                // Code here executes on main thread after user presses button
            }
        });
    }
}

