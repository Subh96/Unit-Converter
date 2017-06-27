package com.example.abhi.recycler;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Weight extends AppCompatActivity {

    Spinner spinner,spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

    spinner= (Spinner) findViewById(R.id.spinner);
        spinner1= (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.weight,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        final EditText ed1= (EditText) findViewById(R.id.edt1);
        final TextView text= (TextView) findViewById(R.id.textView);
        Button btn= (Button) findViewById(R.id.bn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String s, s1;
                    s = spinner.getSelectedItem().toString();
                    s1 = spinner1.getSelectedItem().toString();
                    if (s.equals("Gram") && s1.equals("Gram")){
                        Float n = Float.valueOf(ed1.getText().toString());

                        String s2 = "" + n;
                        text.setText(s2);
                    }}
                catch (NumberFormatException e) {
                    String s = "Number Format Exception";
                    LayoutInflater inflater=getLayoutInflater();
                    View Layout =inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast));
                    TextView txt= (TextView) Layout.findViewById(R.id.textview);
                    txt.setText(s);
                    Toast toast=new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(Layout);
                    toast.getView().setAlpha((float) 0.8);
                    toast.show();

                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this).setTitle("Want to go back").setMessage("For going Back to Mainpage Press yes")
                .setNegativeButton("No",null)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Weight.super.onBackPressed();
                    }
                }).create().show();
    }
}
