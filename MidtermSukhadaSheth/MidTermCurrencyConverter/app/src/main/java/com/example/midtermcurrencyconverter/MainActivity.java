package com.example.midtermcurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button convertButton;
    TextView fracsOutput;
    EditText dollarsInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);


        convertButton=(Button) findViewById(R.id.button);
        dollarsInput =(EditText) findViewById(R.id.editText3);
        fracsOutput = (TextView) findViewById(R.id.textView3);

        convertButton.setOnClickListener(new View.OnClickListener() {
                                                     @Override
                                                     public void onClick(View v) {
                  try {
                        Double usd = Double.parseDouble(dollarsInput.getText().toString());
                        Double result = usd * 439.36 ;
                        fracsOutput.setText("Fracs : " + Double.toString(result));
                      } catch (Exception e) {

                      } } //listener
                                                 }
        );
    }
}
