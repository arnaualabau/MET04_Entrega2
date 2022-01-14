/* Calculator Activity */
package com.example.met04_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonSuma;
    Button buttonResta;
    Button buttonMultiplicacio;
    Button buttonDivisio;
    Button buttonBorrar;
    Button buttonIgual;
    Button buttonEnter;

    TextView textResult = (TextView) findViewById (R.id.resultText);;

    int firstNumber;
    int secondNumber;
    String operation;
    double result;
    boolean first = true;
    boolean second = false;

    void updateText() {
        if (first) {
            //nomes primer numero
            textResult.setText(firstNumber);

        } else {
            if (second) {
                //primer numero, operacio i segon
                textResult.setText(firstNumber + operation + secondNumber);
            } else {
                //primer numero i operacio
                textResult.setText(firstNumber + operation);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        button0 = findViewById(R.id.Button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //guardar numero
                if (!first) {
                    secondNumber = secondNumber*10;
                } else {
                    firstNumber = firstNumber*10;
                }
                updateText();
            }
        });

        button1 = findViewById(R.id.Button1);
        Log.d("STATE", "1!!!");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //guardar numero
                Log.d("STATE", "1!!!");
                if (!first) {
                    secondNumber = secondNumber*10 + 1;
                } else {
                    firstNumber = firstNumber*10 + 1;
                    Log.d("STATE", "1!!!");
                }
                updateText();
            }
        });

        button2 = findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 2;
                } else {
                    firstNumber = firstNumber*10 + 2;
                }
            }
        });

        button3 = findViewById(R.id.Button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 3;
                } else {
                    firstNumber = firstNumber*10 + 3;
                }
            }
        });

        button4 = findViewById(R.id.Button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 4;
                } else {
                    firstNumber = firstNumber*10 + 4;
                }
            }
        });

        button5 = findViewById(R.id.Button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 5;
                } else {
                    firstNumber = firstNumber*10 + 5;
                }
            }
        });

        button6 = findViewById(R.id.Button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 6;
                } else {
                    firstNumber = firstNumber*10 + 6;
                }
            }
        });

        button7 = findViewById(R.id.Button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 7;
                } else {
                    firstNumber = firstNumber*10 + 7;
                }
            }
        });

        button8 = findViewById(R.id.Button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 8;
                } else {
                    firstNumber = firstNumber*10 + 8;
                }
            }
        });

        button9 = findViewById(R.id.Button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!first) {
                    secondNumber = secondNumber*10 + 9;
                } else {
                    firstNumber = firstNumber*10 + 9;
                }
            }
        });

        buttonSuma = findViewById(R.id.ButtonSuma);
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = " + ";
                first = false;
            }
        });

        buttonResta = findViewById(R.id.ButtonResta);
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = " - ";
                first = false;
            }
        });

        buttonDivisio = findViewById(R.id.ButtonDivisio);
        buttonDivisio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = " / ";
                first = false;
            }
        });

        buttonMultiplicacio = findViewById(R.id.ButtonMultiplicacio);
        buttonMultiplicacio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = " X ";
                first = false;
            }
        });

        buttonIgual = findViewById(R.id.ButtonIgual);
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "igual";
                first = true;

                switch (operation) {
                    case " + ":
                        result = firstNumber + secondNumber;
                        break;
                    case " - ":
                        result = firstNumber - secondNumber;
                        break;
                    case " X ":
                        result = firstNumber * secondNumber;
                        break;
                    case " / ":
                        result = firstNumber / secondNumber;
                        break;
                    default:
                        System.out.print("Error");
                }
                System.out.print(result);
                //reiniciar valors
                firstNumber = 0;
                secondNumber = 0;
            }
        });

        buttonBorrar = findViewById(R.id.ButtonBorrar);
        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //operation = "borrar";
                if (!first) {
                    secondNumber = secondNumber - secondNumber%10;
                    secondNumber = secondNumber/10;
                } else {
                    firstNumber = firstNumber - firstNumber%10;
                    firstNumber = firstNumber/10;
                }
                updateText();
            }
        });

        buttonEnter = findViewById(R.id.ButtonEnter);
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "enter";
                //passar info a la llista
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }


}
