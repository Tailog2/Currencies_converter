package com.example.currenciesconverter;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = findViewById(R.id.editTextMiles);
                EditText textBoxKm = findViewById(R.id.editTextKm);
                double valueMiles = Double.valueOf(textBoxMiles.getText().toString());
                double valueKm = valueMiles / 0.62137;
                DecimalFormat formatValue = new DecimalFormat("##.##");
                textBoxKm.setText(formatValue.format(valueKm));
            }
        });
        Button buttonConvKmToMiles = findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = findViewById(R.id.editTextMiles);
                EditText textBoxKm = findViewById(R.id.editTextKm);
                double valueKm = Double.valueOf(textBoxKm.getText().toString());
                double valueMiles = valueKm * 0.62137;
                DecimalFormat formatValue = new DecimalFormat("##.##");
                textBoxMiles.setText(formatValue.format(valueMiles));
            }
        });
    }
}