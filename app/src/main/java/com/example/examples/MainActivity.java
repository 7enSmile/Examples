package com.example.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClickButtom(View v){
        EditText objX1=(EditText)findViewById(R.id.inputX1);
        EditText objX2=(EditText)findViewById(R.id.inputX2);
        EditText objY1=(EditText)findViewById(R.id.inputY1);
        EditText objY2=(EditText)findViewById(R.id.inputY2);
        TextView resText=(TextView)findViewById(R.id.textResult);
        Double x1=Double.parseDouble(objX1.getText().toString());
        Double x2=Double.parseDouble(objX2.getText().toString());
        Double y1=Double.parseDouble(objY2.getText().toString());
        Double y2=Double.parseDouble(objY1.getText().toString());
        Double res=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        resText.setText(Double.toString(res));
        Toast.makeText(MainActivity.this,Double.toString(res),Toast.LENGTH_SHORT).show();


    }

}