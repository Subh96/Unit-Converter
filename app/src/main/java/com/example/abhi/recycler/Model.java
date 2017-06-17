package com.example.abhi.recycler;

import android.support.v7.widget.RecyclerView;

import java.util.List;

public class Model{
    private String heading;
    private String Description;

    public Model(String heading,String Description) {
        this.heading = heading;
        this.Description=Description;
    }

    public String getHeading() {
        return heading;
    }

    public String getDescription() {
        return Description;
    }
}
