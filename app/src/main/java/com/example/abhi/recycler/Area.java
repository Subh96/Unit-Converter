package com.example.abhi.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Area extends AppCompatActivity {

    Spinner spinner,spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        spinner= (Spinner) findViewById(R.id.spinner);
        spinner1= (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.area,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.area,R.layout.support_simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        final TextView textView= (TextView) findViewById(R.id.textView);
        final EditText editText= (EditText) findViewById(R.id.edt1);
        Button btn= (Button) findViewById(R.id.bn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=spinner.getSelectedItem().toString();
                String s1=spinner1.getSelectedItem().toString();
                if(s.equals("Square Metre") && s1.equals("Square Metre") ){
                    Double f=Double.valueOf(editText.getText().toString());
                    textView.setText(f.toString());
                }
                if(s.equals("Square Metre") && s1.equals("Square Feet") ){
                    Double f=Double.valueOf(editText.getText().toString())*10.7639;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Metre") && s1.equals("Square Yards") ){
                    Double f=Double.valueOf(editText.getText().toString())*1.19599;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Metre") && s1.equals("Square Kilometre") ){
                    Double f=Double.valueOf(editText.getText().toString())*Math.pow(10,-6);
                    textView.setText(f.toString());
                }

                if(s.equals("Square Metre") && s1.equals("Square Miles") ){
                    Double f=Double.valueOf(editText.getText().toString())*(3.861*(Math.pow(10,-7)));
                    textView.setText(f.toString());
                }
                if(s.equals("Square Metre") && s1.equals("Acres") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.000247105;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Metre") && s1.equals("Square Inches") ){
                    Double f=Double.valueOf(editText.getText().toString())*1550;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Feet") && s1.equals("Square Feet") ){
                    Double f=Double.valueOf(editText.getText().toString());
                    textView.setText(f.toString());
                }
                if(s.equals("Square Feet") && s1.equals("Square Metre") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.092903;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Feet") && s1.equals("Acres") ){
                    Double f=Double.valueOf(editText.getText().toString())*(2.2957*Math.pow(10,-5));
                    textView.setText(f.toString());
                }
                if(s.equals("Square Feet") && s1.equals("Square Yards") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.111111;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Feet") && s1.equals("Square Inches") ){
                    Double f=Double.valueOf(editText.getText().toString())*144;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Feet") && s1.equals("Square Kilometre") ){
                    Double f=Double.valueOf(editText.getText().toString())*(9.2903*Math.pow(10,-8));
                    textView.setText(f.toString());
                }
                if(s.equals("Square Inches") && s1.equals("Square Inches") ){
                    Double f=Double.valueOf(editText.getText().toString());
                    textView.setText(f.toString());
                }
                if(s.equals("Square Inches") && s1.equals("Square Metre") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.00064516;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Inches") && s1.equals("Square Yards") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.000771605;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Inches") && s1.equals("Square Kilometre") ){
                    Double f=Double.valueOf(editText.getText().toString())*6.4516*Math.pow(10,-10);
                    textView.setText(f.toString());
                }
                if(s.equals("Square Inches") && s1.equals("Square Feet") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.00694444;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Inches") && s1.equals("Acres") ){
                    Double f=Double.valueOf(editText.getText().toString())*1.5942*Math.pow(10,-7);
                    textView.setText(f.toString());
                }
                if(s.equals("Square Inches") && s1.equals("Square Miles") ){
                    Double f=Double.valueOf(editText.getText().toString())*2.491*Math.pow(10,-10);
                    textView.setText(f.toString());
                }
                if(s.equals("Square Yards") && s1.equals("Square Inches") ){
                    Double f=Double.valueOf(editText.getText().toString())*1296;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Yards") && s1.equals("Square Metre") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.836127;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Yards") && s1.equals("Square Yards") ){
                    Double f=Double.valueOf(editText.getText().toString());
                    textView.setText(f.toString());
                }
                if(s.equals("Square Yards") && s1.equals("Square Kilometre") ){
                    Double f=Double.valueOf(editText.getText().toString())*8.3613*Math.pow(10,-7);
                    textView.setText(f.toString());
                }
                if(s.equals("Square Yards") && s1.equals("Square Feet") ){
                    Double f=Double.valueOf(editText.getText().toString())*9;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Yards") && s1.equals("Acres") ){
                    Double f=Double.valueOf(editText.getText().toString())*0.000206612;
                    textView.setText(f.toString());
                }
                if(s.equals("Square Yards") && s1.equals("Square Miles") ){
                    Double f=Double.valueOf(editText.getText().toString())*3.2283*Math.pow(10,-7);
                    textView.setText(f.toString());
                }
            }
        });
    }
}
