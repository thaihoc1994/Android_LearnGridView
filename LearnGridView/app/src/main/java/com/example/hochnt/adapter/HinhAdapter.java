package com.example.hochnt.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.hochnt.learngridview.R;

import java.util.List;

/**
 * Created by hochnt on 7/22/2016.
 */
public class HinhAdapter extends ArrayAdapter<Integer>{

    Activity context;
    int resource;
    List<Integer> objects;

    public HinhAdapter(Activity context, int resource, List<Integer> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }//do da co sẵn hình ==> chỉ cần id (có sẵn) =>> không cần model

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        ImageView img = (ImageView) row.findViewById(R.id.imgHinh);

        img.setImageResource(this.objects.get(position));

        return row;

    }
}
