package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button StartButton;
    Button AboutButton;
    public static ArrayList<String> selections = new ArrayList<String>();
    public static int[][] ApplianceInput = new int[5][3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        StartButton=findViewById(R.id.nextb);
        StartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Query = new Intent(MainActivity.this, ApplianceQuery.class);
                startActivity(Query);
                // Code here executes on main thread after user presses button
            }
        });
        AboutButton=findViewById(R.id.aboutb);
        AboutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent About = new Intent(MainActivity.this, AboutPage.class);
                startActivity(About);
                // Code here executes on main thread after user presses button
            }
        });
    }
}
