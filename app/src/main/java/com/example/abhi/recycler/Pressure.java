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

public class Pressure extends AppCompatActivity {

    Spinner spinner, spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner1 = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pressure, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.pressure, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        final TextView txt = (TextView) findViewById(R.id.textView);
        final EditText ed1 = (EditText) findViewById(R.id.edt1);
        Button btn = (Button) findViewById(R.id.bn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s, s1;
                    s = spinner.getSelectedItem().toString();
                    s1 = spinner1.getSelectedItem().toString();
                    if (s.equals("atmosphere") && s1.equals("atmosphere")) {
                        Float n = Float.valueOf(ed1.getText().toString());
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("Pascal")) {
                        Float n = Float.valueOf(ed1.getText().toString()) * 100;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("Bar")) {
                        Float n = Float.valueOf(ed1.getText().toString()) / 100;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("Killogram per sq.cm")) {
                        Float n = Float.valueOf(ed1.getText().toString()) / 1000;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("Killogram per sq. metre")) {
                        Float n = Float.valueOf(ed1.getText().toString()) * 10;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("Kilopascal")) {
                        Float n = Float.valueOf(ed1.getText().toString()) * 100;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("Millimetre of mercury")) {
                        Float n = Float.valueOf(ed1.getText().toString()) / 10;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("torr")) {
                        Float n = Float.valueOf(ed1.getText().toString()) / 100000;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("atmosphere") && s1.equals("hectopascal")) {
                        Float n = Float.valueOf(ed1.getText().toString());
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("Bar")) {
                        double n = Float.valueOf(ed1.getText().toString()) / 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("Pascal")) {
                        double n = Float.valueOf(ed1.getText().toString());
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("torr")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 0.0254;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("Millimetre of mercury")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("hectopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("Kilopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("atmosphere")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("Killogram per sq.cm")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Bar") && s1.equals("Killogram per sq. metre")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("Killogram per sq.cm")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("Bar")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("Pascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("Killogram per sq. metre")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("hectopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("Kilopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("Millimetre of mercury")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("torr")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Pascal") && s1.equals("atmosphere")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("torr") && s1.equals("atmosphere")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("torr") && s1.equals("torr")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("torr") && s1.equals("Pascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("torr") && s1.equals("Bar")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("torr") && s1.equals("Millimetre of mercury")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("torr") && s1.equals("Kilopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("torr") && s1.equals("Killogram per sq. metre")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("torr") && s1.equals("Killogram per sq.cm")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("torr") && s1.equals("hectopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);
                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("Millimetre of mercury")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("Bar")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("Pascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("torr")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("atmosphere")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("Kilopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("hectopascal")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("Killogram per sq. metre")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if (s.equals("Millimetre of mercury") && s1.equals("Killogram per sq.cm")) {
                        double n = Float.valueOf(ed1.getText().toString()) * 2.54;
                        String s2 = "" + n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("Killogram per sq.cm")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("Killogram per sq. metre")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("Kilopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("torr")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("Bar")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("hectopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("atmosphere")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("Pascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Kilopascal") && s1.equals("Millimetre of mercury")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("Millimetre of mercury")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("hectopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("atmosphere")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("Pascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("Kilopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("Killogram per sq. metre")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("Killogram per sq.cm")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("Bar")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("hectopascal") && s1.equals("torr")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("Killogram per sq. metre")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("Killogram per sq.cm")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("Kilopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("hectopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("Bar")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("Pascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("torr")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("hectopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq.cm") && s1.equals("atmosphere")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("atmosphere")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("hectopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("Killogram per sq. metre")){
                        double n=Float.valueOf(ed1.getText().toString())*1;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("Killogram per sq.cm")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("Kilopascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("Bar")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("Pascal")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("Centimeter")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                    if(s.equals("Killogram per sq. metre") && s1.equals("torr")){
                        double n=Float.valueOf(ed1.getText().toString())*2.54;
                        String s2=""+n;
                        txt.setText(s2);

                    }
                } catch (NumberFormatException e) {
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
                        Pressure.super.onBackPressed();
                    }
                }).create().show();
    }
}
