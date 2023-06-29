package com.dataStructure.vector;

import java.util.Vector;

public class remove {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        System.out.println("original vector "+v);

        v.remove(1);

        System.out.println("removed vector "+v);



    }
}
