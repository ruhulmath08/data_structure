package com.company.arrays.customArrayClass;

public class ImpCustomArrayClass {

    public static void main(String[] args){
        CustomArrayClass numbers = new CustomArrayClass(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(40);

        System.out.println(numbers.indexOf(40));
    }
}
