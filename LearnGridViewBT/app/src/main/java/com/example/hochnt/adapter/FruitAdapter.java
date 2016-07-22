package com.example.hochnt.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.hochnt.learngridviewbt.R;
import com.example.hochnt.model.Fruit;

import java.util.List;

/**
 * Created by hochnt on 7/22/2016.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
    Activity context;
    int resource;
    List<Fruit> objects;
    public FruitAdapter(Activity context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        //chuyen resource thanh code java => view
        View row = layoutInflater.inflate(this.resource,null);

        //get control
        EditText txtSoLuong = (EditText) row.findViewById(R.id.txtSoLuong);
        Button btnMua = (Button) row.findViewById(R.id.btnMua);
        ImageView imgFruit = (ImageView) row.findViewById(R.id.imgFruit);

        final Fruit fr = this.objects.get(position);
        txtSoLuong.setText(fr.getSoLuong()+"");
        imgFruit.setImageResource(fr.getImgFruit());


        return row;
    }
}
