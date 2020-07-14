package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    //---------------------------- (Constant) O(1) ----------------------------
    public void log1(int[] numbers) {
        //O(1+1) = O(2) = O(1)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    }

    //(Linear) O(n) n -> size of the input
    //---------------------------- (Linear) O(n) ----------------------------
    public void log2(int[] numbers) {
        //O(1 + n + 1) = O(2 + n) = O(n)
        System.out.println(); //O(1)
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println(); //O(1)
    }

    public void log2_a(int[] numbers) {
        //O(n + n) = O(2n) = O(n)
        for (int number : numbers) { //O(n)
            System.out.println(number);
        }

        for (int number : numbers) { //O(n)
            System.out.println(number);
        }
    }

    public void log2_b(int[] numbers, String[] names) {
        //O(n + m) = O(n)
        for (int number : numbers) { //O(n)
            System.out.println(number);
        }

        for (String name : names) { //O(m)
            System.out.println(name);
        }
    }

    //---------------------------- Quadratic O(n^2) ----------------------------
    //Quadratic O(n^2)
    public void log3(int[] numbers) {
        //O(n*n) = O(n^2)
        for (int first : numbers) { //O(n)
            for (int second : numbers) { //O(n)
                System.out.println(first + " " + second);
            }
        }
    }

    //O(n*n*n) = O(n^3)
    public void log3_a(int[] numbers) {
        //O(n*n*n) = O(n^3)
        for (int first : numbers) { //O(n)
            for (int second : numbers) { //O(n)
                for (int third : numbers) { //O(n)
                    System.out.println(first + " " + second + "" + third);
                }
            }
        }
    }

    //---------------------------- Logarithmic O(log n) ----------------------------
    //Example binary search

    /*
    Constant O(1)
    Logarithmic O(log n)
    Linear O(n)
    Quadratic O(n^2)
    Exponential O(2^n) -> opposite of Logarithmic
    */

    //---------------------------- SpaceComplexity O(n) ----------------------------
    public void spaceComplexity(String[] names){

        //O(n) space
        String[] copy = new String[names.length];

        //O(1) space -> here the loop variable i is independent of the size of input String[]
        for(int i = 0; i <= names.length; i++){
            System.out.println("Hi " + names[i]);
        }
    }
}
