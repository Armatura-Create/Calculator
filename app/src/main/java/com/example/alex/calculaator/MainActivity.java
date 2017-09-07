package com.example.alex.calculaator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] array = new int[9];
    int i = 0;
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.alex.calculaator.R.layout.activity_main);
    }

    public void calc(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        switch (((TextView) view).getText().toString()) {
            case "1":
                text.setText(text.getText().toString() + "1");
                break;
            case "2":
                text.setText(text.getText().toString() + "2");
                break;
            case "3":
                text.setText(text.getText().toString() + "3");
                break;
            case "4":
                text.setText(text.getText().toString() + "4");
                break;
            case "5":
                text.setText(text.getText().toString() + "5");
                break;
            case "6":
                ;
                text.setText(text.getText().toString() + "6");
                break;
            case "+":
                array[i] = Integer.parseInt(text.getText().toString());
                text.setText("");
                i++;
                break;
            case "=":
                array[i] = Integer.parseInt(text.getText().toString());
                for (int j = 0; j <= i; j++) {
                    result += array[j];
                }
                text.setText(String.valueOf(result));
                i = 0;
                break;
            case "AC":
                text.setText("");
                i = 0;
                result = 0;
                break;
            default:
                text.setText("ERROR");
                break;
        }
    }
}
