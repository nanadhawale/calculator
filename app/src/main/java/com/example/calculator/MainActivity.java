package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDecimal,btnDevide,btnMultiplication,btnSubstract,btnAdd,btnEnter,btnClear;
    TextView txtDisplay;
    int firstNumber, secondNumber;
    String actionType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnDecimal = findViewById(R.id.btn_dot);
        btnDevide = findViewById(R.id.btn_divide);
        btnMultiplication = findViewById(R.id.btn_multiplication);
        btnSubstract = findViewById(R.id.btn_substract);
        btnAdd = findViewById(R.id.btn_adition);
        btnEnter = findViewById(R.id.btn_enter);
        txtDisplay = findViewById(R.id.out);
        btnClear = findViewById(R.id.btn_cancel);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"9");

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"0");

            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+".");

            }
        });
        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"/");

            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"X");


            }
        });
        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"-");



            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText(txtDisplay.getText().toString()+"+");


            }
        });
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = txtDisplay.getText().toString();
                if (number.contains("/")) {
                    String[] splitNumber = number.split("/");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtDisplay.setText(String.valueOf(divide(firstNumber, secondNumber)));
                } else if (number.contains("X")) {
                    String[] splitNumber = number.split("X");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtDisplay.setText(String.valueOf(multiply(firstNumber, secondNumber)));

                } else if (number.contains("-")) {
                    String[] splitNumber = number.split("-");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtDisplay.setText(String.valueOf(substract(firstNumber, secondNumber)));

                } else if (number.contains("+")) {
                    String[] splitNumber = number.split("\\+");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtDisplay.setText(String.valueOf(add(firstNumber, secondNumber)));
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplay.setText("");

            }
        });

    }
    double add(double a,double b){
            return a+b;
        }
    double substract(double a,double b){
            return a - b;
        }
    double multiply(double a,double b){
            return a * b;
        }
    double divide(double a,double b){
            return a / b;
        }



    }
