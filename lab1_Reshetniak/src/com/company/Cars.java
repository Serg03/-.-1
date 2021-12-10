package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(){
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public void remove(Car car) {
        this.cars.remove(car);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            cars.add(Car.generate());
        }
    }

    public void RegisterThisYear(){
        System.out.println("\n\nАвтомобили произведенные до 2005-го года и зарегистрированные в этом году:\n");
        for (Car car : this.cars){
            if (car.getDate().getYear() == 2021 && car.getYear() < 2005){
                System.out.println(car);
            }
        }
    }

    @Override
    public String toString() {
        return "\n\n\nАвтомобили" + cars + "; ";
    }
}
