package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickSum(View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText1 = (TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 + num2;
        resText1.setText(Integer.toString(resSum));
    }

    public void onButtonClickSub(View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText1 = (TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 - num2;
        resText1.setText(Integer.toString(resSum));
    }

    public void onButtonClickMult(View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText1 = (TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 * num2;
        resText1.setText(Integer.toString(resSum));
    }
    public void onButtonClickDiv(View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText1 = (TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum;
        if(num2 != 0) {
            resSum = num1 / num2;
            resText1.setText(Integer.toString(resSum));
        }
        else resText1.setText("Error");
    }
}