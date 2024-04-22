package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdvancedActivity extends AppCompatActivity {
    TextView resultTextView;
    Button buttonAllClear, buttonSignChange, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear, buttonDot;
    Button buttonSqrt, buttonSquare, buttonPower, buttonLog, buttonSin, buttonCos, buttonTan, buttonln, buttonPercent;
    float valueOne, valueTwo;
    boolean addition, subtract, multiplication, division, power, dot;

    int clearClickCount=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

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
        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonSquare = findViewById(R.id.buttonSquare);
        buttonPower = findViewById(R.id.buttonPower);
        buttonLog = findViewById(R.id.buttonLog);
        buttonSin = findViewById(R.id.buttonSin);
        buttonCos = findViewById(R.id.buttonCos);
        buttonTan = findViewById(R.id.buttonTan);
        buttonln = findViewById(R.id.buttonln);
        buttonPercent = findViewById(R.id.buttonPercent);
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
                if(!dot) {
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
                        power = dot = subtract = multiplication = division = false;
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
                        if (power) {
                            float result = (float) Math.pow(valueOne, valueTwo);
                            resultTextView.setText(result + "");
                            dot = power = false;
                            valueOne = result;
                        }

                        if (division) {
                            if(valueTwo == 0) {
                                // Show toast message
                                Toast.makeText(AdvancedActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                            } else {
                                resultTextView.setText(valueOne / valueTwo + "");
                                valueOne = valueOne / valueTwo;
                            }
                            dot = division = false;
                        }
                        addition = true;
                    }
                } else{
                    power = dot = subtract = multiplication = division = false;
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
                        power = dot = addition = multiplication = division = false;
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
                        if (power) {
                            float result = (float) Math.pow(valueOne, valueTwo);
                            resultTextView.setText(result + "");
                            dot = power = false;
                            valueOne = result;
                        }

                        if (division) {
                            if(valueTwo == 0) {
                                // Show toast message
                                Toast.makeText(AdvancedActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                            } else {
                                resultTextView.setText(valueOne / valueTwo + "");
                                valueOne = valueOne / valueTwo;
                            }
                            dot = division = false;
                        }
                        subtract = true;
                    }
                } else{
                    power = dot = subtract = multiplication = division = false;
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
                        power = dot = subtract = addition = division = false;
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

                        if (power) {
                            float result = (float) Math.pow(valueOne, valueTwo);
                            resultTextView.setText(result + "");
                            dot = power = false;
                            valueOne = result;
                        }

                        if (division) {
                            if(valueTwo == 0) {
                                // Show toast message
                                Toast.makeText(AdvancedActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                            } else {
                                resultTextView.setText(valueOne / valueTwo + "");
                                valueOne = valueOne / valueTwo;
                            }
                            dot = division = false;
                        }
                        multiplication = true;
                    }
                } else {
                    power = dot = addition = subtract = division = false;
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
                        power = dot = subtract = multiplication = addition = false;
                        division = true;
                    } else{
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

                        if (multiplication) {
                            resultTextView.setText(valueOne * valueTwo + "");
                            valueOne = valueOne * valueTwo;
                            dot = multiplication = false;
                        }

                        if (power) {
                            float result = (float) Math.pow(valueOne, valueTwo);
                            resultTextView.setText(result + "");
                            dot = power = false;
                            valueOne = result;
                        }
                        division = true;
                    }
                } else{
                    power = dot = subtract = multiplication = division = false;
                    addition = true;
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((subtract || multiplication || division || addition || power) && resultTextView.getText()!=null && resultTextView.getText()!="") {

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
                            Toast.makeText(AdvancedActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                        } else {
                            resultTextView.setText(valueOne / valueTwo + "");
                            valueOne = valueOne / valueTwo;
                        }
                        dot = division = false;
                    }

                    if (power) {
                        float result = (float) Math.pow(valueOne, valueTwo);
                        resultTextView.setText(result + "");
                        dot = power = false;
                        valueOne = result;
                    }
                }
            }
        });

        // Sqrt button logic
        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    if(!resultTextView.getText().toString().startsWith("-")) {
                        valueOne = Float.parseFloat(resultTextView.getText().toString());
                        resultTextView.setText(Math.sqrt(valueOne) + "");
                    }
                    else{
                        Toast.makeText(AdvancedActivity.this, "Nie można pierwiastkować liczb ujemnych", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        // Square button logic
        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    valueOne = Float.parseFloat(resultTextView.getText().toString());
                    resultTextView.setText((valueOne * valueOne) + "");
                }
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    if (!subtract && !multiplication && !division && !addition) {
                        valueOne = Float.parseFloat(resultTextView.getText() + "");
                        resultTextView.setText(null);
                        division = dot = subtract = multiplication = addition = false;
                        power = true;
                    } else{
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

                        if (multiplication) {
                            resultTextView.setText(valueOne * valueTwo + "");
                            valueOne = valueOne * valueTwo;
                            dot = multiplication = false;
                        }

                        if (division) {
                            if(valueTwo == 0) {
                                // Show toast message
                                Toast.makeText(AdvancedActivity.this, "Nie wolno dzielić przez 0", Toast.LENGTH_SHORT).show();
                            } else {
                                resultTextView.setText(valueOne / valueTwo + "");
                                valueOne = valueOne / valueTwo;
                            }
                            dot = division = false;
                        }
                        power = true;
                    }
                } else{
                    power = dot = subtract = multiplication = division = false;
                    addition = true;
                }
            }
        });

        // Log button logic
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    if(Float.parseFloat(resultTextView.getText() + "") > 0) {
                        valueOne = Float.parseFloat(resultTextView.getText().toString());
                        resultTextView.setText(Math.log10(valueOne) + "");
                    } else {
                        Toast.makeText(AdvancedActivity.this, "log jest niezdefiniowane dla liczb nie dodatnich", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    valueOne = Float.parseFloat(resultTextView.getText().toString());
                    double radians = Math.toRadians(valueOne);
                    resultTextView.setText(Math.sin(radians) + "");
                }
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    valueOne = Float.parseFloat(resultTextView.getText().toString());
                    double radians = Math.toRadians(valueOne);
                    resultTextView.setText(Math.cos(radians) + "");
                }
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    valueOne = Float.parseFloat(resultTextView.getText().toString());
                    // Convert valueOne from degrees to radians as Java's Math.tan() expects radians
                    double radians = Math.toRadians(valueOne);
                    // Check if the value is at a tan discontinuity (90° + k*180°, where k is an integer)
                    if ((valueOne - 90) % 180 == 0) {
                        Toast.makeText(AdvancedActivity.this, "Tan jest niezdefiniowany dla 90° + k*180°", Toast.LENGTH_SHORT).show();
                    } else {
                        resultTextView.setText(Math.tan(radians) + "");
                    }
                }
            }
        });

        buttonln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    valueOne = Float.parseFloat(resultTextView.getText().toString());
                    // Ensure valueOne is positive as ln is undefined for non-positive values
                    if (valueOne <= 0) {
                        Toast.makeText(AdvancedActivity.this, "ln jest niezdefiniowane dla liczb nie dodatnich", Toast.LENGTH_SHORT).show();
                    } else {
                        resultTextView.setText(Math.log(valueOne) + ""); // Math.log() calculates the natural log (ln)
                    }
                }
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultTextView.getText()!=null && resultTextView.getText()!="") {
                    // Get the current value displayed in the resultTextView
                    String value = resultTextView.getText().toString();
                    // Check if the value is not empty to prevent errors
                    if (!value.isEmpty()) {
                        // Parse the value to a float
                        float percentageValue = Float.parseFloat(value);
                        // Calculate the percentage (divide by 100)
                        percentageValue /= 100;
                        // Set the calculated percentage value as the new text of resultTextView
                        resultTextView.setText(String.valueOf(percentageValue));
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
        power = savedInstanceState.getBoolean("power");
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
        outState.putBoolean("power",power);
        outState.putBoolean("dot",dot);
    }
}
