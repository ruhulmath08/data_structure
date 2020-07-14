package com.company.arrays.dynamic_array;

import java.util.ArrayList;

public class DynamicArray {
    /*
    * Java has two implementation of dynamic array
    * Vector and ArrayList
    * Vector -> grow by 100% of its size every time it is full
    *        -> synchronized -> thread safe
    *
    * ArrayList -> grow by 50% of its size every time it is full
    * */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println("indexOf: " + list.indexOf(20));
        System.out.println("lastIndexOf: " + list.lastIndexOf(30));
        System.out.println("contains: " + list.contains(40));
        System.out.println("size: " + list.size());
    }
}
