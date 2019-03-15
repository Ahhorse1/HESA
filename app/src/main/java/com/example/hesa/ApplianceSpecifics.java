package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ApplianceSpecifics extends MainActivity {
    Button next1;

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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_screen_two);
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
        next1=findViewById(R.id.continuebutton);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ApplianceInput[0][0] = Integer.valueOf(Quantity1.getText().toString());
                ApplianceInput[1][0] = Integer.valueOf(Quantity2.getText().toString());
                ApplianceInput[2][0] = Integer.valueOf(Quantity3.getText().toString());
                ApplianceInput[3][0] = Integer.valueOf(Quantity4.getText().toString());
                ApplianceInput[4][0] = Integer.valueOf(Quantity5.getText().toString());
                ApplianceInput[0][1] = Integer.valueOf(KWH1.getText().toString());
                ApplianceInput[1][1] = Integer.valueOf(KWH2.getText().toString());
                ApplianceInput[2][1] = Integer.valueOf(KWH3.getText().toString());
                ApplianceInput[3][1] = Integer.valueOf(KWH4.getText().toString());
                ApplianceInput[4][1] = Integer.valueOf(KWH5.getText().toString());
                ApplianceInput[0][2] = Integer.valueOf(QuantityPurchased1.getText().toString());
                ApplianceInput[1][2] = Integer.valueOf(QuantityPurchased2.getText().toString());
                ApplianceInput[2][2] = Integer.valueOf(QuantityPurchased3.getText().toString());
                ApplianceInput[3][2] = Integer.valueOf(QuantityPurchased4.getText().toString());
                ApplianceInput[4][2] = Integer.valueOf(QuantityPurchased5.getText().toString());
                // showToast(String.valueOf(ApplianceInput[0][0]));
                Intent BenIsBoring = new Intent(ApplianceSpecifics.this, ApplianceRecommendation.class);
                startActivity(BenIsBoring);
                // Code here executes on main thread after user presses button
            }
        });
    }
    /* private void showToast(String a){
        Toast.makeText(ApplianceSpecifics.this, a, Toast.LENGTH_SHORT).show();
    }
    */
}
