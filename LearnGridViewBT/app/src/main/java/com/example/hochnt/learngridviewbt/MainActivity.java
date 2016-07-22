package com.example.hochnt.learngridviewbt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.hochnt.adapter.FruitAdapter;
import com.example.hochnt.model.Fruit;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvFruit;
    ArrayList<Fruit> dsFruit;
    FruitAdapter frAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    private void addEvent() {

    }

    private void addControl() {
        gvFruit = (GridView) findViewById(R.id.gvFruit);
        dsFruit = new ArrayList<Fruit>();
        dsFruit.add(new Fruit(1,"h1",3,R.drawable.h1));
        dsFruit.add(new Fruit(2,"h2",15,R.drawable.h2));
        dsFruit.add(new Fruit(3,"h3",22,R.drawable.h3));
        dsFruit.add(new Fruit(4,"h4",31,R.drawable.h4));
        dsFruit.add(new Fruit(5,"h5",1,R.drawable.h5));
        dsFruit.add(new Fruit(6,"h6",4,R.drawable.h6));
        dsFruit.add(new Fruit(7,"h7",6,R.drawable.h7));
        dsFruit.add(new Fruit(8,"h8",7,R.drawable.h8));

        frAdapter = new FruitAdapter(MainActivity.this,R.layout.item,dsFruit);
        gvFruit.setAdapter(frAdapter);
    }
}
