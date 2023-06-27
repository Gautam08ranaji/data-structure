package com.dataStructure;

import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {



        java.util.ArrayList<String> animals = new java.util.ArrayList<String>();

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add(1,"hii");
        System.out.println("ArrayList: " + animals);
        animals.set(1,"hloo");
//        animals.clear();
        animals.indexOf("Dog");
        System.out.println(animals.contains("Dog"));
//      animals.remove("Dog");
        System.out.println(animals.lastIndexOf("Cat"));
        System.out.println("ArrayList: " + animals);
        System.out.println("kdlk  "+animals.get(2));

        for (String ele : animals){
            System.out.println(ele);
        }
        if (animals.contains("Dog")){
            System.out.println("true");
        }else System.out.println("false");
        System.out.println(animals);
        Collections.swap(animals,0,3);
        System.out.println(animals);
    }
}
