package com.example.hesa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ApplianceQuery extends MainActivity {
    Button next1;
    public void selectItem(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.acu:
                if(checked){
                    selections.add("Air Condtioning");
                }
                else{
                    selections.remove("Air Condtioning");
                }
            break;
            case R.id.washing_machine:
                if(checked){
                    selections.add("Washing Machine");
                }
                else{
                    selections.remove("Washing Machine");
                }
            break;
            case R.id.refrigerators:
                if(checked){
                    selections.add("Refrigerator");
                }
                else{
                    selections.remove("Refrigerator");
                }
            break;
            case R.id.dryers:
                if(checked){
                    selections.add("Dryer");
                }
                else{
                    selections.remove("Dryer");
                }
                break;
            case R.id.dishwashers:
                if(checked){
                    selections.add("Dishwasher");
                }
                else{
                    selections.remove("Dishwasher");
                }
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for(int a = selections.size(); a > 0; a--)
            selections.remove(a);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_screen_one);
        // final_text = (TextView)(findViewById(R.id.final_result));
        next1=findViewById(R.id.NextButton1);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent BenIsBoring = new Intent(ApplianceQuery.this, ApplianceSpecifics.class);
                startActivity(BenIsBoring);
                // Code here executes on main thread after user presses button
            }
        });
    }
}
