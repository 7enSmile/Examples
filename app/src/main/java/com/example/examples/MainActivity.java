package com.example.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    private EditText objX1;
    private EditText objX2;
    private EditText objY1;
    private EditText objY2;
    private TextView resText;
    private Button buttonRes;
    private int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objX1=(EditText)findViewById(R.id.inputX1);
        objX2=(EditText)findViewById(R.id.inputX2);
        objY1=(EditText)findViewById(R.id.inputY1);
        objY2=(EditText)findViewById(R.id.inputY2);
        resText=(TextView)findViewById(R.id.textResult);
        buttonRes=(Button)findViewById(R.id.buttonAccess);
        i=0;

    }
    public void OnClickRes(View v){
        Double x1=Double.parseDouble(objX1.getText().toString());
        Double x2=Double.parseDouble(objX2.getText().toString());
        Double y1=Double.parseDouble(objY2.getText().toString());
        Double y2=Double.parseDouble(objY1.getText().toString());
        Double res=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        resText.setText(Double.toString(res));
        Toast.makeText(MainActivity.this,Double.toString(res),Toast.LENGTH_SHORT).show();


    }
    public void OnClickColor(View v){

        if(i==0)
            buttonRes.setBackgroundColor(rgb(230,0,0));
        if(i==1)
            buttonRes.setBackgroundColor(rgb(255,255,25));
        if(i==2)
            buttonRes.setBackgroundColor(rgb(64,255,25));
        i++;
        if(i>2) {
            i = 0;
        }
    }

}