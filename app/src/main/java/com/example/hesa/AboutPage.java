package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutPage extends AppCompatActivity {
    Button goback;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_screen);
        goback=findViewById(R.id.button2);
        goback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent BenIsBoring = new Intent(AboutPage.this,MainActivity.class);
                startActivity(BenIsBoring);
                // Code here executes on main thread after user presses button
            }
        });
    }
}
