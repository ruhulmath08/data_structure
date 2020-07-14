package com.company.arrays.customArrayClass;

public class CustomArrayClass {

    private int[] items;
    private int count;

    public CustomArrayClass(int length) {
        items = new int[length];
    }

    //insert element
    public void insert(int item) {
        //if the array is full, resize it
        if (items.length == count) {
            //create a new array (twice the size)
            int[] newItems = new int[count * 2];

            //copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            //set "items" to this new array
            items = newItems;
        }
        //add the new item at the end
        items[count++] = item;
    }

    //delete element
    //runtime complexity of this method
    // if item at index 0 => O(1)
    // if item at last index => O(n)
    public void removeAt(int index) {
        //validate ihe index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        //shift the items to the left to fill the hole
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    //search element
    public int indexOf(int item){
        //if we find it, return index

        //otherwise, return -1
        for (int i = 0; i < count; i++){
            if (items[i] == item){
                return i;
            }
        }
        return -1;
    }

    //print array
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    //print the size of the array
    public void size() {
        System.out.println(items.length);
    }
}
