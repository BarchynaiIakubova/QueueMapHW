package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, CarInfo> car = new HashMap<>();
        car.put(new Car(1, "ERS-8579"), new CarInfo("2018", "Skoda Octavia", 29000, "Black"));
        car.put(new Car(2, "586-5GX"), new CarInfo("2000", "Honda", 5000, "Gray"));
        car.put(new Car(3, "485-JKM"), new CarInfo("2022", "MG Hector", 13000, "Blue"));
        car.put(new Car(4, "NSG-857"), new CarInfo("2020", "Mahindra", 11000, "Red"));

//        for (Map.Entry elem: car.entrySet()) {
//            System.out.println(elem.getKey() + " " + elem.getValue());
//        }

        for (Car elem: car.keySet()) {
            System.out.println(elem + " " + car.get(elem));
        }
    }
}
