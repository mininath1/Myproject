package com.example.mysampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button add_bt,sub_bt,div_bt,mul_bt;
    TextView add_txt;
    EditText no1,no2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_bt=findViewById(R.id.add_bt);
        sub_bt=findViewById(R.id.sub_bt);
        div_bt=findViewById(R.id.div_bt);
        mul_bt=findViewById(R.id.mul_bt);

        add_txt=findViewById(R.id.add_txt);

        no1=findViewById(R.id.no1);
        no2=findViewById(R.id.no2);


        add_bt.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "ADD button clicked", Toast.LENGTH_SHORT).show();
            Log.d(String.valueOf(MainActivity.class), "onClick: no1 : "+no1.getText()+"and "+no2.getText());

            int tem=Integer.parseInt(no1.getText().toString());
            int tem1=Integer.parseInt(no2.getText().toString());
            int result=tem+tem1;
            Log.d("Addition is", String.valueOf(result));

            add_txt.setText(String.valueOf(result));
        });

        sub_bt.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "SUB button clicked", Toast.LENGTH_SHORT).show();
            Log.d(String.valueOf(MainActivity.class), "onClick: no1 : "+no1.getText()+"and "+no2.getText());

            int tem=Integer.parseInt(no1.getText().toString());
            int tem1=Integer.parseInt(no2.getText().toString());
            int result=tem-tem1;
            Log.d("Addition is", String.valueOf(result));

            add_txt.setText(String.valueOf(result));
        });

        mul_bt.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "MUL button clicked", Toast.LENGTH_SHORT).show();
            Log.d(String.valueOf(MainActivity.class), "onClick: no1 : "+no1.getText()+"and "+no2.getText());

            int tem=Integer.parseInt(no1.getText().toString());
            int tem1=Integer.parseInt(no2.getText().toString());
            int result=tem*tem1;
            Log.d("Addition is", String.valueOf(result));

            add_txt.setText(String.valueOf(result));
        });

        div_bt.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "DIV button clicked", Toast.LENGTH_SHORT).show();
            Log.d(String.valueOf(MainActivity.class), "onClick: no1 : "+no1.getText()+"and "+no2.getText());

            int tem=Integer.parseInt(no1.getText().toString());
            int tem1=Integer.parseInt(no2.getText().toString());
            int result=tem/tem1;
            Log.d("Addition is", String.valueOf(result));

            add_txt.setText(String.valueOf(result));
        });
    }
}