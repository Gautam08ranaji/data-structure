package com.dataStructure.vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class addAll {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        System.out.println("original vector "+v);

        Collection<String> c = new ArrayList<>();

        c.add("geeks");
        c.add("for");
        c.add("geeks");

        v.addAll(c);
        System.out.println(v);

        Object Obj = v.clone();
        System.out.println("cloned vector : "+Obj);

        System.out.println(v.contains("geeks"));
        System.out.println(v.firstElement());

    }
}
