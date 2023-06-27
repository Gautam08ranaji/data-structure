package com.dataStructure;

import java.util.ArrayList;

public class removeElement {
    public static void main(String[] args) {
        java.util.ArrayList<String> car = new ArrayList<>();
        car.add("Scorpio");
        car.add("fortuner");
        car.add("Thar");
        car.add("Rubicorn");
        car.add("Swift");
        car.add("verna");

        System.out.println(car);

        car.remove("Swift");
        System.out.println(car);

        car.remove(4);
        System.out.println(car);


    }
}
