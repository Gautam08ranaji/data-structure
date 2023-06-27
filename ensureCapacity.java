package com.dataStructure;

import java.util.ArrayList;

public class ensureCapacity {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();

        car.ensureCapacity(4);
        car.add("Scorpio");
        car.add("Fortuner");
        car.add("Thar");
        car.add("Rubicorn");
        car.add("Defender");

        System.out.println(car);


    }
}
