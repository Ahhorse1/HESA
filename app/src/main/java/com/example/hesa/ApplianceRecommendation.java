package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ApplianceRecommendation extends MainActivity {
    Button next1;
    Button dopebutton;
    private TextView tv_result;
    public static int[][] AlgorithmInput ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean check = true;

        AlgorithmInput = new int[3][5];
            if(ApplianceInput[0][0] == 0 || ApplianceInput[0][1] == 0)
                AlgorithmInput[0][0] = 0;
            else {
                AlgorithmInput[0][0] = ApplianceInput[0][1] / ApplianceInput[0][0];
            }
            AlgorithmInput[1][0] = ApplianceInput[0][2];
            AlgorithmInput[2][0] = 0;
            if(ApplianceInput[1][0] == 0 || ApplianceInput[1][1] == 0)
                AlgorithmInput[0][1] = 0;
            else {
                AlgorithmInput[0][1] = ApplianceInput[1][1] / ApplianceInput[1][0];
            }
            AlgorithmInput[1][1] = ApplianceInput[1][2];
            AlgorithmInput[2][1] = 1;

            if(ApplianceInput[2][0] == 0 || ApplianceInput[2][1] == 0)
                AlgorithmInput[0][2] = 0;
            else {
                AlgorithmInput[0][2] = ApplianceInput[2][1] / ApplianceInput[2][0];
            }
            AlgorithmInput[1][2] = ApplianceInput[2][2];
            AlgorithmInput[2][2] = 2;
            if(ApplianceInput[3][0] == 0 || ApplianceInput[3][1] == 0)
                AlgorithmInput[0][3] = 0;
            else {
                AlgorithmInput[0][3] = ApplianceInput[3][1] / ApplianceInput[3][0];
            }
            AlgorithmInput[1][3] = ApplianceInput[3][2];
            AlgorithmInput[2][3] = 3;
            if(ApplianceInput[4][0] == 0 || ApplianceInput[4][1] == 0)
                AlgorithmInput[0][4] = 0;
            else {
                AlgorithmInput[0][4] = ApplianceInput[4][1] / ApplianceInput[4][0];
            }
            AlgorithmInput[1][4] = ApplianceInput[4][2];
            AlgorithmInput[2][4] = 4;
        Algorithm Recommendation = new Algorithm(AlgorithmInput,budget,48);
        final String test = Recommendation.toString();
        tv_result = (TextView) findViewById(R.id.tv_result);
        setContentView(R.layout.recommendation_screen);
        dopebutton = findViewById(R.id.JankButton);
        dopebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast(test);
            }
        });
        next1=findViewById(R.id.button);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent BenIsBoring = new Intent(ApplianceRecommendation.this,MainActivity.class);
                startActivity(BenIsBoring);
            }
        });
    }
    private void showToast(String a){
        Toast.makeText(ApplianceRecommendation.this, a, Toast.LENGTH_LONG).show();
    }
}

