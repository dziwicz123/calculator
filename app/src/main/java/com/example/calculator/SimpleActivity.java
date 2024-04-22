package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleActivity extends AppCompatActivity {
    TextView resultTextView;
    Button buttonAllClear, buttonSignChange, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear, buttonDot;
    float valueOne, valueTwo;
    boolean addition, subtract, multiplication, division, dot;

    int clearClickCount=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        // Inicjalizacja widoków
        initializeViews();

        // Przywróć zapisany stan (jeśli istnieje)
        if (savedInstanceState != null) {
            restoreInstanceState(savedInstanceState);
        }

        // Ustawienie listenerów dla przycisków
        setupListeners();

    }

    private void initializeViews() {
        resultTextView = findViewById(R.id.textView);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonClear = findViewById(R.id.buttonClear);
        buttonDot = findViewById(R.id.buttonDot);
        buttonSignChange = findViewById(R.id.buttonSignChange);
        buttonAllClear = findViewById(R.id.buttonAllClear);
    }

    private void setupListeners() {
        buttonSignChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = resultTextView.getText().toString();
                if (!value.isEmpty()) {
                    if (value.startsWith("-")) {
                        resultTextView.setText(value.substring(1));
                    } else {
                        resultTextView.setText("-" + value);
                    }
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clearClickCount == 0) {
                    resultTextView.setText("");
                    dot = false;
                    clearClickCount++;
                } else {
                    valueOne = 0;
                    valueTwo = 0;
                    resultTextView.setText("");
                    dot = addition = subtract = multiplication = division = false;
                    clearClickCount = 0;
                }
            }
        });

        buttonAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = 0;
                valueTwo = 0;
                resultTextView.setText("");
                dot = addition = subtract = multiplication = division = false;
                // Reset any memory function if implemented
            }
        });


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dot==false) {
                    resultTextView.setText(resultTextView.getText() + ".");
                    dot = true;
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")) {
                    if (resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "0");
                    }
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "1");
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "2");
                    }
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "3");
                    }
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "4");
                    }
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "5");
                    }
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "6");
                    }
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "7");
                    }
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "8");
                    }
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!resultTextView.getText().toString().equals("0")){
                    if(resultTextView.getText().length() < 15) {
                        resultTextView.setText(resultTextView.getText() + "9");
                    }
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    if (!subtract && !multiplication && !division && !addition) {
                        valueOne = Float.parseFloat(resultTextView.getText() + "");
                        resultTextView.setText(null);
                        dot = subtract = multiplication = division = false;
                        addition = true;
                    } else {
                        valueTwo = Float.parseFloat(resultTextView.getText() + "");

                        if (subtract) {
                            resultTextView.setText(valueOne - valueTwo + "");
                            valueOne = valueOne - valueTwo;
                            dot = subtract = false;
                        }

                        if (multiplication) {
                            resultTextView.setText(valueOne * valueTwo + "");
                            valueOne = valueOne * valueTwo;
                            dot = multiplication = false;
                        }

                        if (division) {
                            if(valueTwo == 0) {
                                // Show toast message
                                Toast.makeText(SimpleActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                            } else {
                                resultTextView.setText(valueOne / valueTwo + "");
                                valueOne = valueOne / valueTwo;
                            }
                            dot = division = false;
                        }
                        addition = true;
                    }
                } else{
                    dot = subtract = multiplication = division = false;
                    addition = true;
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    if (!subtract && !multiplication && !division && !addition) {
                        valueOne = Float.parseFloat(resultTextView.getText() + "");
                        resultTextView.setText(null);
                        dot = addition = multiplication = division = false;
                        subtract = true;
                    } else{
                        valueTwo = Float.parseFloat(resultTextView.getText() + "");
                        if (addition) {
                            resultTextView.setText(valueOne + valueTwo + "");
                            valueOne = valueOne + valueTwo;
                            dot = addition = false;
                        }

                        if (multiplication) {
                            resultTextView.setText(valueOne * valueTwo + "");
                            valueOne = valueOne * valueTwo;
                            dot = multiplication = false;
                        }

                        if (division) {
                            if(valueTwo == 0) {
                                // Show toast message
                                Toast.makeText(SimpleActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                            } else {
                                resultTextView.setText(valueOne / valueTwo + "");
                                valueOne = valueOne / valueTwo;
                            }
                            dot = division = false;
                        }
                        subtract = true;
                    }
                } else{
                    dot = subtract = multiplication = division = false;
                    addition = true;
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    if (!subtract && !multiplication && !division && !addition) {
                        valueOne = Float.parseFloat(resultTextView.getText() + "");
                        resultTextView.setText(null);
                        dot = subtract = addition = division = false;
                        multiplication = true;
                    }
                    else{
                        valueTwo = Float.parseFloat(resultTextView.getText() + "");
                        if (addition) {
                            resultTextView.setText(valueOne + valueTwo + "");
                            valueOne = valueOne + valueTwo;
                            dot = addition = false;
                        }

                        if (subtract) {
                            resultTextView.setText(valueOne - valueTwo + "");
                            valueOne = valueOne - valueTwo;
                            dot = subtract = false;
                        }

                        if (division) {
                            if(valueTwo == 0) {
                                // Show toast message
                                Toast.makeText(SimpleActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                            } else {
                                resultTextView.setText(valueOne / valueTwo + "");
                                valueOne = valueOne / valueTwo;
                            }
                            dot = division = false;
                        }
                        multiplication = true;
                    }
                } else {
                    dot = addition = subtract = division = false;
                    multiplication = true;
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    if (!subtract && !multiplication && !division && !addition) {
                        valueOne = Float.parseFloat(resultTextView.getText() + "");
                        resultTextView.setText(null);
                        dot = subtract = multiplication = addition = false;
                        division = true;
                    } else{
                        valueTwo = Float.parseFloat(resultTextView.getText() + "");
                        if (addition) {
                            resultTextView.setText(valueOne + valueTwo + "");
                            dot = addition = false;
                        }

                        if (subtract) {
                            resultTextView.setText(valueOne - valueTwo + "");
                            dot = subtract = false;
                        }

                        if (multiplication) {
                            resultTextView.setText(valueOne * valueTwo + "");
                            dot = multiplication = false;
                        }
                        division = true;
                    }
                } else{
                    dot = subtract = multiplication = division = false;
                    addition = true;
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((subtract || multiplication || division || addition) && resultTextView.getText()!=null && resultTextView.getText()!="") {
                    valueTwo = Float.parseFloat(resultTextView.getText() + "");

                    if (addition) {
                        resultTextView.setText(valueOne + valueTwo + "");
                        dot = addition = false;
                        valueOne = valueOne + valueTwo;
                    }

                    if (subtract) {
                        resultTextView.setText(valueOne - valueTwo + "");
                        dot = subtract = false;
                        valueOne = valueOne - valueTwo;
                    }

                    if (multiplication) {
                        resultTextView.setText(valueOne * valueTwo + "");
                        dot = multiplication = false;
                        valueOne = valueOne * valueTwo;
                    }

                    if (division) {
                        if(valueTwo == 0) {
                            // Show toast message
                            Toast.makeText(SimpleActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                        } else {
                            resultTextView.setText(valueOne / valueTwo + "");
                            valueOne = valueOne / valueTwo;
                        }
                        dot = division = false;
                    }
                }
            }
        });
    }

    private void restoreInstanceState(Bundle savedInstanceState) {
        resultTextView.setText(savedInstanceState.getString("resultText"));
        addition = savedInstanceState.getBoolean("addition");
        subtract = savedInstanceState.getBoolean("subtract");
        multiplication = savedInstanceState.getBoolean("multiplication");
        division = savedInstanceState.getBoolean("division");
        valueOne = savedInstanceState.getFloat("valueOne");
        valueTwo = savedInstanceState.getFloat("valueTwo");
        dot = savedInstanceState.getBoolean("dot");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Zapisz wartości
        outState.putString("resultText", resultTextView.getText().toString());
        outState.putBoolean("addition", addition);
        outState.putBoolean("subtract", subtract);
        outState.putBoolean("multiplication", multiplication);
        outState.putBoolean("division", division);
        outState.putFloat("valueOne", valueOne);
        outState.putFloat("valueTwo", valueTwo);
        outState.putBoolean("dot", dot);
    }
}