package com.dataStructure;

import java.util.ArrayList;

public class setElement {
    public static void main(String[] args) {
        java.util.ArrayList<String> car = new ArrayList<>();
        car.add("Scorpio");
        car.add("fortuner");
        car.add("Thar");
        car.add("Rubicorn");

        System.out.println(car);
        car.set(1,"Defender");
        System.out.println(car);
    }
}
