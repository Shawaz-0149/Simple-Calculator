package com.example.simplecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button c;
    Button a;
    Button p;
    Button s;
    Button d;
    EditText first;
    EditText sec;
    TextView Ans;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=findViewById(R.id.clear);
        a=findViewById(R.id.add);
        p=findViewById(R.id.pro);
        s=findViewById(R.id.sub);
        d=findViewById(R.id.div);
        first=findViewById(R.id.first);
        Ans=findViewById(R.id.textView3);
        sec= findViewById(R.id.sec);
        c.setOnClickListener(v -> {
            first.setText("");
            sec.setText("");
            Ans.setText("");
        });
        a.setOnClickListener(v -> {
            if((first.getText().toString().isEmpty())||(sec.getText().toString().isEmpty()))
            {
                Ans.setText("Please Enter Values!!!");
            }
            else
            {
                double num1 = Double.parseDouble(first.getText().toString());
                double num2 = Double.parseDouble(sec.getText().toString());
                double ans = num1 + num2;
                Ans.setText("Sum >>>  "+ans);
            }

        });
        s.setOnClickListener(v -> {
            if((first.getText().toString().isEmpty())||(sec.getText().toString().isEmpty()))
            {
                Ans.setText("Please Enter Values");
            }
            else
            {
                double num1 = Double.parseDouble(first.getText().toString());
                double num2 = Double.parseDouble(sec.getText().toString());
                double ans = num1 - num2;
                Ans.setText("Subtraction >>>  "+ans);
            }
        });
        d.setOnClickListener(v -> {
            if((first.getText().toString().isEmpty())||(sec.getText().toString().isEmpty()))
            {
                Ans.setText("Please Enter Values");
            }
            else
            {
                double num1 = Double.parseDouble(first.getText().toString());
                double num2 = Double.parseDouble(sec.getText().toString());
                double ans = num1 / num2;
                Ans.setText("Division >>>  "+ans);
            }
        });
        p.setOnClickListener(v -> {
            if(first.getText().toString().isEmpty()||sec.getText().toString().isEmpty())
            {
                Ans.setText("Please Enter Values");
            }
            else
            {
                double num1 = Double.parseDouble(first.getText().toString());
                double num2 = Double.parseDouble(sec.getText().toString());
                double ans = num1 * num2;
                Ans.setText("Answer >>>  "+ans);
            }
        });

    }
}