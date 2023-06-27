package com.dataStructure;

import java.util.ArrayList;

public class containsArrayList {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("Scorpio");
        car.add("Fortuner");
        car.add("Thar");
        car.add("Rubicorn");

        System.out.println(car.contains("Rubicorn"));
    }
}
