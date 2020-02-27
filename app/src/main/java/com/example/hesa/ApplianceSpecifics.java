package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ApplianceSpecifics extends MainActivity {
    Button next1;
    int minBudget = 0;
    boolean Budget = true;
    boolean ContinueWashingMachines = false;
    boolean ContinueDryers = false;
    boolean ContinueRefrigerators = false;
    boolean ContinueDishwashers = false;
    boolean ContinueAirConditioner = false;
    boolean ContinueWashingMachines1 = false;
    boolean ContinueDryers1 = false;
    boolean ContinueRefrigerators1 = false;
    boolean ContinueDishwashers1 = false;
    boolean ContinueAirConditioner1 = false;
    EditText Quantity1;
    EditText Quantity2;
    EditText Quantity3;
    EditText Quantity4;
    EditText Quantity5;
    EditText KWH1;
    EditText KWH2;
    EditText KWH3;
    EditText KWH4;
    EditText KWH5;
    EditText QuantityPurchased1;
    EditText QuantityPurchased2;
    EditText QuantityPurchased3;
    EditText QuantityPurchased4;
    EditText QuantityPurchased5;
    EditText BudgetInput;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_screen_two);
        ContinueWashingMachines = true;
        ContinueDryers = true;
        ContinueRefrigerators = true;
        ContinueDishwashers = true;
        ContinueAirConditioner = true;
        ContinueWashingMachines1 = true;
        ContinueDryers1 = true;
        ContinueRefrigerators1 = true;
        ContinueDishwashers1 = true;
        ContinueAirConditioner1 = true;
        minBudget = 0;
        Quantity1 = (EditText) findViewById(R.id.Quantity1);
        Quantity2 = (EditText) findViewById(R.id.Quantity2);
        Quantity3 = (EditText) findViewById(R.id.Quantity3);
        Quantity4 = (EditText) findViewById(R.id.Quantity4);
        Quantity5 = (EditText) findViewById(R.id.Quantity5);
        KWH1 = (EditText) findViewById(R.id.KWH1);
        KWH2 = (EditText) findViewById(R.id.KWH2);
        KWH3 = (EditText) findViewById(R.id.KWH3);
        KWH4 = (EditText) findViewById(R.id.KWH4);
        KWH5 = (EditText) findViewById(R.id.KWH5);
        QuantityPurchased1 = (EditText) findViewById(R.id.QuantityPurchased1);
        QuantityPurchased2 = (EditText) findViewById(R.id.QuantityPurchased2);
        QuantityPurchased3 = (EditText) findViewById(R.id.QuantityPurchased3);
        QuantityPurchased4 = (EditText) findViewById(R.id.QuantityPurchased4);
        QuantityPurchased5 = (EditText) findViewById(R.id.QuantityPurchased5);
        BudgetInput = (EditText) findViewById(R.id.TotalBudget);
        next1 = findViewById(R.id.continuebutton);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minBudget = 0;
                if ((Quantity1.getText().toString()).length() > 0)
                    ApplianceInput[0][0] = Integer.valueOf(Quantity1.getText().toString());

                if ((Quantity3.getText().toString()).length() > 0)
                    ApplianceInput[1][0] = Integer.valueOf(Quantity3.getText().toString());

                if ((Quantity4.getText().toString()).length() > 0)
                    ApplianceInput[2][0] = Integer.valueOf(Quantity4.getText().toString());

                if ((Quantity5.getText().toString()).length() > 0)
                    ApplianceInput[3][0] = Integer.valueOf(Quantity5.getText().toString());

                if ((Quantity2.getText().toString()).length() > 0)
                    ApplianceInput[4][0] = Integer.valueOf(Quantity2.getText().toString());

                if ((KWH1.getText().toString()).length() > 0)
                    ApplianceInput[0][1] = Integer.valueOf(KWH1.getText().toString());

                if ((KWH3.getText().toString()).length() > 0)
                    ApplianceInput[1][1] = Integer.valueOf(KWH3.getText().toString());

                if ((KWH4.getText().toString()).length() > 0)
                    ApplianceInput[2][1] = Integer.valueOf(KWH4.getText().toString());

                if ((KWH5.getText().toString()).length() > 0)
                    ApplianceInput[3][1] = Integer.valueOf(KWH5.getText().toString());

                if ((KWH2.getText().toString()).length() > 0)
                    ApplianceInput[4][1] = Integer.valueOf(KWH2.getText().toString());

                if ((QuantityPurchased1.getText().toString()).length() > 0)
                    ApplianceInput[0][2] = Integer.valueOf(QuantityPurchased1.getText().toString());

                if ((QuantityPurchased3.getText().toString()).length() > 0)
                    ApplianceInput[1][2] = Integer.valueOf(QuantityPurchased3.getText().toString());

                if ((QuantityPurchased4.getText().toString()).length() > 0)
                    ApplianceInput[2][2] = Integer.valueOf(QuantityPurchased4.getText().toString());

                if ((QuantityPurchased5.getText().toString()).length() > 0)
                    ApplianceInput[3][2] = Integer.valueOf(QuantityPurchased5.getText().toString());

                if ((QuantityPurchased2.getText().toString()).length() > 0)
                    ApplianceInput[4][2] = Integer.valueOf(QuantityPurchased2.getText().toString());

                if ((BudgetInput.getText().toString()).length() > 0)
                    budget = Integer.valueOf(BudgetInput.getText().toString());

                if (selections.contains("Washing Machine") || ApplianceInput[0][2]>0) {
                    minBudget += 648;
                    if(ApplianceInput[0][1] == 1000){
                        ApplianceInput[0][1] = 850;
                        ContinueWashingMachines = true;
                    }
                    else if(ApplianceInput[0][1] < 120){
                        showToast("Please check your kWh input for Washing Machines, if it is correct, your current appliance is very efficient and we will be unable to recommend a better appliance");
                        ContinueWashingMachines = false;
                    }
                }
                if (selections.contains("Dryer") || ApplianceInput[4][2]>0) {
                    minBudget += 900;
                    if(ApplianceInput[4][1] == 1000){
                        ApplianceInput[4][1] = 3400;
                        ContinueDryers = true;
                    }
                    else if(ApplianceInput[4][1] < 149){
                        showToast("Please check your kWh input for Dryer, if it is correct, your current appliance is very efficient and we will be unable to recommend a better appliance");
                        ContinueDryers = false;
                    }
                }
                if (selections.contains("Refrigerator") || ApplianceInput[1][2]>0) {
                    minBudget += 300;
                    if(ApplianceInput[1][1] == 1000){
                        ApplianceInput[1][1] = 1400;
                        ContinueRefrigerators = true;
                    }
                    else if(ApplianceInput[1][1] < 348){
                        showToast("Please check your kWh input for Refrigerator, if it is correct, your current appliance is very efficient and we will be unable to recommend a better appliance");
                        ContinueRefrigerators = false;
                    }
                }
                if (selections.contains("Dishwasher") || ApplianceInput[2][2]>0) {
                    minBudget += 600;
                    if(ApplianceInput[2][1] == 1000){
                        ApplianceInput[2][1] = 500;
                        ContinueDishwashers = true;
                    }
                    else if(ApplianceInput[2][1] < 239){
                        showToast("Please check your kWh input for Dishwashers, if it is correct, your current appliance is very efficient and we will be unable to recommend a better appliance");
                        ContinueDishwashers = false;
                    }
                }
                if (selections.contains("Air Condtioning") || ApplianceInput[3][2]>0) {
                    minBudget += 48;
                    if(ApplianceInput[3][1] == 1000) {
                        ApplianceInput[3][1] = 3500;
                        ContinueAirConditioner = true;
                    }
                    else if(ApplianceInput[2][1] < 3345){
                            showToast("Please check your kWh input for Air Conditioner, if it is correct, your current appliance is very efficient and we will be unable to recommend a better appliance");
                            ContinueAirConditioner = false;
                    }
                }
                if(ApplianceInput[0][1] > 0)
                    if(ApplianceInput[0][2] == 0) {
                        showToast("If you wish to purchase a Washing Machine, please enter 1 or how ever many you wish to purchase in the Number You Wish to Purchase line for Washing Machines ");
                        ContinueWashingMachines1 = false;
                    }
                    else {
                        ContinueWashingMachines1 = true;
                    }
                if(ApplianceInput[1][1] > 0)
                    if(ApplianceInput[1][2] == 0){
                        showToast("If you wish to purchase a Refrigerators, please enter 1 or how ever many you wish to purchase in the Number You Wish to Purchase line for Washing Machines ");
                        ContinueRefrigerators1 = false;
                    }
                    else {
                        ContinueRefrigerators1 = true;
                    }
                if(ApplianceInput[2][1] > 0)
                    if(ApplianceInput[2][2] == 0){
                        showToast("If you wish to purchase a Dishwashers, please enter 1 or how ever many you wish to purchase in the Number You Wish to Purchase line for Washing Machines ");
                        ContinueDishwashers1 = false;
                    }
                    else {
                        ContinueDishwashers1 = true;
                    }
                if(ApplianceInput[3][1] > 0)
                    if(ApplianceInput[3][2] == 0){
                        showToast("If you wish to purchase a Air Conditioning Units, please enter 1 or how ever many you wish to purchase in the Number You Wish to Purchase line for Washing Machines ");
                    ContinueAirConditioner1 = false;
                    }
                    else {
                    ContinueAirConditioner1 = true;
                    }
                if(ApplianceInput[4][1] > 0)
                    if(ApplianceInput[4][2] == 0){
                        showToast("If you wish to purchase a Dryers, please enter 1 or how ever many you wish to purchase in the Number You Wish to Purchase line for Washing Machines ");
                    ContinueDryers1 = false;
                    }
                    else {
                    ContinueDryers1 = true;
                    }
                if(budget < minBudget) {
                    Budget = false;
                    showToast("Please Enter a Reasonable Budget");
                }
                else {
                    Budget = true;
                }
                if(ContinueDishwashers && ContinueRefrigerators && ContinueDryers && ContinueAirConditioner && ContinueWashingMachines && ContinueDishwashers1 && ContinueRefrigerators1 && ContinueDryers1 && ContinueAirConditioner1 && ContinueWashingMachines1 && Budget){
                    Intent BenIsBoring = new Intent(ApplianceSpecifics.this, ApplianceRecommendation.class);
                    startActivity(BenIsBoring);
                }
                // Code here executes on main thread after user presses button
            }
        });
    }
    private void showToast(String a){
        Toast.makeText(ApplianceSpecifics.this, a, Toast.LENGTH_SHORT).show();
    }
}
