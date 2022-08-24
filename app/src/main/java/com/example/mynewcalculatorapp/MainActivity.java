package com.example.mynewcalculatorapp;

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
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        try{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;
            numberSumTV.setText("" + sum);
        }
        catch(NumberFormatException e){
            numberSumTV.setText("This isn't a number");
        }




    }
    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        try{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int difference = num1 - num2;
            numberSumTV.setText("" + difference);
        }
        catch(NumberFormatException e){
            numberSumTV.setText("This isn't a number");
        }




    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1;
        int num2;

        try{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int product = num1 * num2;
            numberSumTV.setText("" + product);
        }
        catch(NumberFormatException e){
            numberSumTV.setText("This isn't a number");
        }

    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        int num1;
        int num2;
        try{
            num1 = Integer.parseInt((number1ET.getText().toString()));
            num2 = Integer.parseInt((number2ET.getText().toString()));
            int quotient = num1 / num2;
            numberSumTV.setText("" + quotient);
        }
        catch(NumberFormatException e){
            numberSumTV.setText("This isn't a number");
        }

    }

}