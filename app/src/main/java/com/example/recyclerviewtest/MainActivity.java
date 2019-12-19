package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycleview);
        ArrayList<Phone> phonelist = new ArrayList<>();
        Phone p1 = new Phone("p1",R.drawable.img1,25.25,"d1");
        phonelist.add(p1);
        Phone p2 = new Phone("p2",R.drawable.imag2,26.25,"d2");
        phonelist.add(p2);
        Phone p3 = new Phone("p3",R.drawable.imag3,25.255,"d3");
        phonelist.add(p3);
        Phone p4 = new Phone("p4",R.drawable.imag4,250.25,"d4");
        phonelist.add(p4);
        Phone p5 = new Phone("p5",R.drawable.imag5,205.25,"d5");
        phonelist.add(p5);

        PhoneAdapter adapter = new PhoneAdapter(phonelist,MainActivity.this);
        recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));


    }
}
