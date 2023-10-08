package com.collectionsPratice;

import java.util.Iterator;

public class CollectionsTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(6);
        list.add(7);

        for(int i:list) {
            System.out.println(i);
        }
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
