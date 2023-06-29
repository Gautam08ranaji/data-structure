package com.dataStructure.vector;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        int n = 5;

        for (int i = 1; i <=n ; i++) {
            v.add(i);
        }

        System.out.println("vector elements are : "+ v);

        v.add(6);
        System.out.println("after adding new elements  are : "+ v);

        v.remove(3);
        System.out.println("after removing index elements  are : "+ v);

        System.out.print("vector throuh iteration : ");
        for (int i : v){
            System.out.print(i+" ");

        }
        System.out.println();
        v.set(1,12);
        System.out.println(v);
    }
}
