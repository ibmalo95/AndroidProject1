package com.example.setup.androidproject1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button convert = (Button) findViewById(R.id.convert);
        final EditText number = (EditText) findViewById(R.id.number);
        final EditText base = (EditText) findViewById(R.id.base);
        final EditText output_base = (EditText) findViewById(R.id.output_base);
        final TextView result = (TextView) findViewById(R.id.result);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // take the value of number and value of base
                String numberValue = number.getText().toString();
                String baseValue = base.getText().toString();
                String output_base_value = output_base.getText().toString();

                try {
                    Integer resultText = Integer.parseInt(numberValue, Integer.parseInt(baseValue));
                    result.setText(Integer.toString(resultText, Integer.parseInt(output_base_value)));
                    base.setBackgroundColor(Color.BLACK);
                }
                catch(Exception e) {
                    base.setBackgroundColor(Color.RED);
                    Toast.makeText(MainActivity.this, "An error occured!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
