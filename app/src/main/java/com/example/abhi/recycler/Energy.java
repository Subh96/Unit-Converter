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

public class Energy extends AppCompatActivity {

    Spinner spinner,spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);

        spinner= (Spinner) findViewById(R.id.spinner);
        spinner1= (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        EditText ed1= (EditText) findViewById(R.id.edt1);
        TextView text= (TextView) findViewById(R.id.textView);
        Button btn= (Button) findViewById(R.id.bn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"defqwe",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
