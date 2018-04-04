package com.example.mac.converterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText) findViewById(R.id.editText);
        button=(Button) findViewById(R.id.button);
        textView=(TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double enteredValue;
                double result=0.0;
                enteredValue=Double.parseDouble(editText.getText().toString());

                result=enteredValue*215;

                textView.setText(Double.toString(result)+"  INR");
            }
        });
    }
}
