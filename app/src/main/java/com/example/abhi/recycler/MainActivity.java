package com.example.abhi.recycler;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycle;
    private LinearLayoutManager manager;
    private List<Model> modelList;
    private  myAdapter adapter;
    private MenuItem menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle = (RecyclerView) findViewById(R.id.recycle);
       recycle.setHasFixedSize(true);
        manager=new LinearLayoutManager(this);
        recycle.setLayoutManager(manager);
        modelList=new ArrayList<>();
        Model model=new Model("Length","Click to do Conversion of lengths");
        modelList.add(model);
        Model model6=new Model("Area","Click to do Conversion of Area");
        modelList.add(model6);
        Model model1=new Model("Weight","Click to do Conversion of Weight");
        modelList.add(model1);
        Model model2=new Model("Temperature","Click to do Conversion of Temperature");
        modelList.add(model2);
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

        NotificationCompat.Builder builder= (NotificationCompat.Builder) new NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher).setContentTitle("Thank You For Opening Our App")
        .setContentText("We are keep Updating the App so please keep Checking");
        NotificationCompat.InboxStyle n=new NotificationCompat.InboxStyle();
        n.setBigContentTitle("A very Good Morning User");
        n.addLine("new Tip");
        n.addLine("new Tip");
        n.addLine("new Tip");
        n.addLine("new Tip");
        builder.setStyle(n);
        int color=0x3D;
        builder.setColor(color);
        NotificationManager notificationManager= (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, builder.build());

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch (id){
            case R.id.menu_About:
                Intent in=new Intent(this,About.class);
                startActivity(in);
                return true;
            case R.id.menu_item_share:
                Toast.makeText(getApplicationContext(),"This is share button",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    int back_Flag=0;

    @Override
    public void onBackPressed(){
        long Start_Time=System.currentTimeMillis();
        back_Flag=back_Flag+1;
        String s="Press back Again to Exit";
        long End_Time=System.currentTimeMillis();
        if(back_Flag!=2)
        {
            Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();

        }
        else if(back_Flag==2 && (Start_Time-End_Time)<2)
        {
            back_Flag=0;
            super.onBackPressed();
        }
        else if(back_Flag>2)
        {
            back_Flag=0;
            Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
        }
    }

}
