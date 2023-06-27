package com.dataStructure;

import java.util.ArrayList;
import java.util.Comparator;

public class sortInReverseOrder {
    public static void main(String[] args) {
        java.util.ArrayList<String> car = new ArrayList<>();
        car.add("Scorpio");
        car.add("Fortuner");
        car.add("Thar");
        car.add("Rubicorn");

        car.sort(Comparator.reverseOrder());
        System.out.println(car);
    }
}
