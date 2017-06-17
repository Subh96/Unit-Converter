package com.example.abhi.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycle;
    private LinearLayoutManager manager;
    private List<Model> modelList;
    private  myAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle = (RecyclerView) findViewById(R.id.recycle);
       recycle.setHasFixedSize(true);
        manager=new LinearLayoutManager(this);
        recycle.setLayoutManager(manager);
        String[] item = {"Length", "Weight", "Temperature", "Velocity", "Mass", "Pressure", "Force", "Area", "Volume", "Time", "Energy"};
        modelList=new ArrayList<>();

        Model model=new Model("Length","Click to do Conversion of lengths");
        modelList.add(model);
        Model model6=new Model("Area","Click to do Conversion of Area");
        modelList.add(model6);
        Model model1=new Model("Weight","Click to do Conversion of Weight");
        modelList.add(model1);
        Model model2=new Model("Temperature","Click to do Conversion of Temperature");
        modelList.add(model2);
        Model model3=new Model("Mass","Click to do Conversion of Mass");
        modelList.add(model3);
        Model model4=new Model("Pressure","Click to do Conversion of Pressure");
        modelList.add(model4);
        Model model5=new Model("Force","Click to do Conversion of Force");
        modelList.add(model5);
        Model model7=new Model("Volume","Click to do Conversion of Volume");
        modelList.add(model7);
        Model model8=new Model("Time","Click to do Conversion of Time");
        modelList.add(model8);
        Model model9=new Model("Energy","Click to do Conversion of Energy");
        modelList.add(model9);
        Model model10=new Model("Velocity","Click to do Conversion of Velocity");
        modelList.add(model10);
        adapter=new myAdapter(modelList,this);
        recycle.setAdapter(adapter);

    }

}
