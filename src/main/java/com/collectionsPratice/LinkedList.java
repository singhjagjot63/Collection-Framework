package com.collectionsPratice;

import java.util.List;
import java.util.ListIterator;

//LinkedList implements a dequeue
public class LinkedList {

    public static void main(String[] args) {
        List<Integer> lk = new java.util.LinkedList<>();
        lk.add(1);
        lk.add(5);
        lk.add(7);
        ListIterator<Integer> listIterator = lk.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        /* next --> it first returns the item and then increases the index
           previous --> it first decreases the index and the returns the item
         */
    }
}
