package com.collectionsPratice;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {
    private T[] shoes;
    private int sizeOfShoes;

    public OurGenericList() {
        sizeOfShoes = 0;
        shoes = (T[])new Object[100];
    }

    public void add(T shoesItem) {
        shoes[sizeOfShoes++] = shoesItem;
    }
    public T getItemAtIndex(int index) {
        return shoes[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T> {

        private OurGenericList<T> list;
        private int index = 0;
        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.sizeOfShoes;
        }

        @Override
        public T next() {
            return list.shoes[index ++];
        }
    }
}
