package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ApplianceRecommendation extends MainActivity {
    Button next1;
    TextView tv_result;
    public static int[][] AlgorithmInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int size = 0;
        int AlgorithmAdder = 0;
        boolean check = false;
        for(int a = 0; a < 6; a++)
            if(ApplianceInput[a][2] != 0)
                size++;
        AlgorithmInput = new int[3][size];
        for(int a = 0; a < selections.size(); a++)
            if(selections.get(a).equals("Washing Machine"))
                check = true;
        if(check == true){
            if(ApplianceInput[0][0] == 0 || ApplianceInput[0][1] == 0)
                AlgorithmInput[0][AlgorithmAdder] = 0;
            else {
                AlgorithmInput[0][AlgorithmAdder] = ApplianceInput[0][1] / ApplianceInput[0][0];
            }
            AlgorithmInput[1][AlgorithmAdder] = ApplianceInput[0][2];
            AlgorithmInput[2][AlgorithmAdder] = 0;
            check = false;
            AlgorithmAdder++;
        }
        for(int a = 0; a < selections.size(); a++)
            if(selections.get(a).equals("Refrigerator"))
                check = true;
        if(check == true){
            if(ApplianceInput[1][0] == 0 || ApplianceInput[1][1] == 0)
                AlgorithmInput[0][AlgorithmAdder] = 0;
            else {
                AlgorithmInput[0][AlgorithmAdder] = ApplianceInput[1][1] / ApplianceInput[1][0];
            }
            AlgorithmInput[1][AlgorithmAdder] = ApplianceInput[1][2];
            AlgorithmInput[2][AlgorithmAdder] = 1;
            check = false;
            AlgorithmAdder++;
        }
        for(int a = 0; a < selections.size(); a++)
            if(selections.get(a).equals("Dishwasher"))
                check = true;
        if(check == true){
            if(ApplianceInput[2][0] == 0 || ApplianceInput[2][1] == 0)
                AlgorithmInput[0][AlgorithmAdder] = 0;
            else {
                AlgorithmInput[0][AlgorithmAdder] = ApplianceInput[2][1] / ApplianceInput[2][0];
            }
            AlgorithmInput[1][AlgorithmAdder] = ApplianceInput[2][2];
            AlgorithmInput[2][AlgorithmAdder] = 2;
            check = false;
            AlgorithmAdder++;
        }
        for(int a = 0; a < selections.size(); a++)
            if(selections.get(a).equals("Air Conditioner"))
                check = true;
        if(check == true){
            if(ApplianceInput[3][0] == 0 || ApplianceInput[3][1] == 0)
                AlgorithmInput[0][AlgorithmAdder] = 0;
            else {
                AlgorithmInput[0][AlgorithmAdder] = ApplianceInput[3][1] / ApplianceInput[3][0];
            }
            AlgorithmInput[1][AlgorithmAdder] = ApplianceInput[3][2];
            AlgorithmInput[2][AlgorithmAdder] = 3;
            check = false;
            AlgorithmAdder++;
        }
        for(int a = 0; a < selections.size(); a++)
            if(selections.get(a).equals("Dryer"))
                check = true;
        if(check == true){
            if(ApplianceInput[4][0] == 0 || ApplianceInput[4][1] == 0)
                AlgorithmInput[0][AlgorithmAdder] = 0;
            else {
                AlgorithmInput[0][AlgorithmAdder] = ApplianceInput[4][1] / ApplianceInput[4][0];
            }
            AlgorithmInput[1][AlgorithmAdder] = ApplianceInput[4][2];
            AlgorithmInput[2][AlgorithmAdder] = 4;
            AlgorithmAdder++;
            check = false;
        }
        Algorithm Recommendation = new Algorithm(AlgorithmInput,budget,48);
        String output = Recommendation.toString();
        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_result.setText(output);
        setContentView(R.layout.recommendation_screen);
        next1=findViewById(R.id.button);

        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent BenIsBoring = new Intent(ApplianceRecommendation.this,MainActivity.class);
                startActivity(BenIsBoring);
                // Code here executes on main thread after user presses button
            }
        });
    }
}

