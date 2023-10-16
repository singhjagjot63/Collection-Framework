package com.collectionsPratice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(89);

        Integer[] arr = list.toArray(new Integer[0]);
        for(int x:arr) {
            System.out.println(x);
        }
        System.out.println("Size of the array is " + arr.length);
    }
}
