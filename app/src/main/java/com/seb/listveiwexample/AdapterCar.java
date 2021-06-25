package com.seb.listveiwexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import models.Car;

public class AdapterCar extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Car> cars;

    public AdapterCar(Activity activity, ArrayList<Car> cars){
        this.activity = activity;
        this.cars =cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void addCar(ArrayList<Car> carsElements){
        cars.addAll(carsElements);
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater)  activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.car_item, null);
        }
        Car carElement = cars.get(position);
        TextView nameCar = v.findViewById(R.id.carName);
        nameCar.setText(carElement.getName());

        TextView carCylinderCapacity = v.findViewById(R.id.carCylinderCapacity);
        nameCar.setText(carElement.getName());

        TextView carModel = v.findViewById(R.id.carModel);
        nameCar.setText(carElement.getName());

        TextView carMoney = v.findViewById(R.id.carMoney);
        nameCar.setText(carElement.getName());

        return v;
    }
}
