package com.example.ht2s.simplecalculator;

import android.support.v7.app.AppCompatActivity;
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
    public void add(View view)
    {
        EditText a = (EditText) findViewById(R.id.edtext1);
        EditText b = (EditText) findViewById(R.id.edtext2);

        String a1 = a.getText().toString();
        String b1 =  b.getText().toString();

        int num1 = Integer.parseInt(a1);
        int num2 = Integer.parseInt(b1);
        int num3 = num1 + num2;

        TextView t1 = (TextView) findViewById(R.id.textview1);
        t1.setText(Integer.toString(num3));
    }

    public void sub(View view)
    {
        EditText a = (EditText) findViewById(R.id.edtext1);
        EditText b = (EditText) findViewById(R.id.edtext2);

        String a1 = a.getText().toString();
        String b1 =  b.getText().toString();

        int num1 = Integer.parseInt(a1);
        int num2 = Integer.parseInt(b1);
        int num3 = num1 - num2;

        TextView t1 = (TextView) findViewById(R.id.textview1);
        t1.setText(Integer.toString(num3));
    }

    public void mul(View view)
    {
        EditText a = (EditText) findViewById(R.id.edtext1);
        EditText b = (EditText) findViewById(R.id.edtext2);

        String a1 = a.getText().toString();
        String b1 =  b.getText().toString();

        int num1 = Integer.parseInt(a1);
        int num2 = Integer.parseInt(b1);
        int num3 = num1 * num2;

        TextView t1 = (TextView) findViewById(R.id.textview1);
        t1.setText(Integer.toString(num3));
    }

    public void div(View view)
    {
        EditText a = (EditText) findViewById(R.id.edtext1);
        EditText b = (EditText) findViewById(R.id.edtext2);

        String a1 = a.getText().toString();
        String b1 =  b.getText().toString();

        float num1 = Float.parseFloat(a1);
        float num2 = Float.parseFloat(b1);
        float num3 = num1 / num2;

        TextView t1 = (TextView) findViewById(R.id.textview1);
        t1.setText(Float.toString(num3));
    }
}

