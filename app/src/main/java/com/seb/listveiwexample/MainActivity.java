package com.seb.listveiwexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import models.Car;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView ListViewNames;
    //private String[] names= {"diego", "santiago", "Franco"};
    public ArrayList<Car> listCars = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListViewNames = findViewById(R.id.ListViewNames);
        listCars.add(new Car("Ford Mustang", "2000", "2021", "140000000",null));
        listCars.add(new Car("Maclaren", "3000", "2000", "110000000",null));
        listCars.add(new Car("Citroen Saxo", "2000", "2007", "14000000",null));

        AdapterCar adapter = new AdapterCar(this, listCars);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        ListViewNames.setAdapter(adapter);
        ListViewNames.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "ha pulsado el elemento numero "+ position, Toast.LENGTH_SHORT).show();
    }
}