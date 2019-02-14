package com.company;

public class IntHashMap implements IntMap{

    private class Entry {
        private int key;
        private int value;
        //private int hashCode;
        private Entry next;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 0;
    private Entry[] table = new Entry[16];
    private int[] localCount = new int[table.length];
    private double loadFactor;

    private int indexCalc(int key) {
        return Math.abs(key % table.length);
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean containsKey(int key) {
        return false;
    }

    @Override
    public boolean containsValue(int value) {
        return false;
    }

    @Override
    public int get(int key) {

        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void put(int key, int value) {
        Entry newEntry = new Entry(key, value);
        if (table[indexCalc(key)] == null) {
            table[indexCalc(key)] = newEntry;
        }
        else {
            Entry last = table[indexCalc(key)];
            table[indexCalc(key)] = newEntry;
            newEntry.next = last;
            //...
        }
        localCount[indexCalc(key)] ++;
        size++;
    }

    @Override
    public void remove(int key) {

    }

    @Override
    public int size() {
        return 0;
    }
}
