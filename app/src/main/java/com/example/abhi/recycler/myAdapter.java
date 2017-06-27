package com.example.abhi.recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by abhi on 16/6/17.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.Viewholder> {


    private List<Model> listitems;
    private Context context;

    public myAdapter(List<Model> listitems, Context c) {
        this.listitems = listitems;
        this.context = c;
    }

    @Override
    public myAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new myAdapter.Viewholder(v);
    }

    @Override
    public void onBindViewHolder(myAdapter.Viewholder holder, final int position) {
        final Model listitem = listitems.get(position);
        holder.text1.setText(listitem.getHeading());
        holder.text2.setText(listitem.getDescription());
        int p=position;
        if(p==0){
            holder.img.setImageResource(R.mipmap.ic_length);
        }
        if(p==1){
            holder.img.setImageResource(R.mipmap.ic_area);
        }
        if(p==2){
            holder.img.setImageResource(R.mipmap.ic_w);
        }
        if(p==3){
            holder.img.setImageResource(R.mipmap.ic_temp);
        }
        if(p==4){
            holder.img.setImageResource(R.mipmap.ic_pressure);
        }
        if(p==5){
            holder.img.setImageResource(R.mipmap.ic_force);
        }
        if(p==6){
            holder.img.setImageResource(R.mipmap.ic_volume);
        }
        if(p==7){
            holder.img.setImageResource(R.mipmap.ic_time);
        }
        if(p==8){
            holder.img.setImageResource(R.mipmap.ic_energy);
        }
        if(p==9){
            holder.img.setImageResource(R.mipmap.ic_ve);
        }
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = position;
                switch (pos) {
                    case 0:
                        Intent in = new Intent(context, Length.class);
                        context.startActivity(in);
                        break;
                    case 1:
                        Intent in1 = new Intent(context, Area.class);
                        context.startActivity(in1);
                        break;
                    case 2:
                        Intent in2 = new Intent(context, Weight.class);
                        context.startActivity(in2);
                        break;
                    case 3:
                        Intent in3 = new Intent(context, Temperature.class);
                        context.startActivity(in3);
                        break;
                    case 4:
                        Intent in5 = new Intent(context, Pressure.class);
                        context.startActivity(in5);
                        break;
                    case 5:
                        Intent in6 = new Intent(context, Force.class);
                        context.startActivity(in6);
                        break;
                    case 6:
                        Intent in7 = new Intent(context, Volume.class);
                        context.startActivity(in7);
                        break;
                    case 7:
                        Intent in8 = new Intent(context, Time.class);
                        context.startActivity(in8);
                        break;
                    case 8:
                        Intent in9 = new Intent(context, Energy.class);
                        context.startActivity(in9);
                        break;
                    case 9:
                        Intent in10 = new Intent(context, Velocity.class);
                        context.startActivity(in10);
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        public TextView text1, text2;
        public LinearLayout linearLayout;
        public ImageView img;

        public Viewholder(View itemView) {
            super(itemView);

            text1 = (TextView) itemView.findViewById(R.id.txt1);
            text2 = (TextView) itemView.findViewById(R.id.txt2);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear);
            img= (ImageView) itemView.findViewById(R.id.img);
        }
    }
}







