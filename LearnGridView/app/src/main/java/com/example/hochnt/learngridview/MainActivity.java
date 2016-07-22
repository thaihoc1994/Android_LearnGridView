package com.example.hochnt.learngridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.hochnt.adapter.HinhAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvHinh;
    ArrayList<Integer> dsHinh;
    HinhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    private void addControl() {
        gvHinh = (GridView) findViewById(R.id.gvHinh);
        dsHinh = new ArrayList<>();
        dsHinh.add(R.drawable.h1);
        dsHinh.add(R.drawable.h2);
        dsHinh.add(R.drawable.h3);
        dsHinh.add(R.drawable.h4);
        dsHinh.add(R.drawable.h5);
        dsHinh.add(R.drawable.h6);
        dsHinh.add(R.drawable.h7);
        dsHinh.add(R.drawable.h8);

        adapter = new HinhAdapter(MainActivity.this,R.layout.item,dsHinh);
        gvHinh.setAdapter(adapter);

    }

    private void addEvent() {
    }
}
