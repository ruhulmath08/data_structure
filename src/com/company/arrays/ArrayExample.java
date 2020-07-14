package com.company.arrays;

import java.util.Arrays;

//Use to store a list of item sequentially
/*
 runtime complexity
 LookUp O(1) => small array
 Insert O(n) => add new element in array => create a large array
 Delete O(1) => delete last item
 Delete O(n) => delete first itemdelete last item
*/
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        System.out.println(numbers); //[I@1540e19d
        System.out.println(Arrays.toString(numbers)); //[0, 0, 0]

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers)); //[10, 20, 30]

        int[] newNumbers = {40, 50, 60};
        System.out.println(Arrays.toString(newNumbers)); //[40, 50, 60]
    }
}
