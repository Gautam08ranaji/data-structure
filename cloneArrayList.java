package com.dataStructure;

import java.util.ArrayList;

public class cloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("Scorpio");
        car.add("Fortuner");
        car.add("Thar");
        car.add("Rubicorn");

//        ArrayList<String> cloneList = (ArrayList<String>)car.clone();
//        System.out.println("cloned Array : "+cloneList);

        System.out.println(car.clone());
    }
}
