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
    //private int[] localCount = new int[table.length];
    private double loadFactor;

    private int indexCalc(int key) {
        return Math.abs(key % table.length);
    }

    @Override
    public void clear() {
		for (int i = 0; i < table.length; i++) {
			table[i] = null;
		}
		size = 0;
    }

    @Override
    public boolean containsKey(int key) {
		Entry tmp = table[indexCalc(key)];
		while (tmp.next != null){
            tmp = tmp.next;
			if (tmp.key == key) {
				return true;
			}
        }
        return false;
    }

    @Override
    public boolean containsValue(int value) {
        for (i = 0; i < table.length; i++) {
			Entry tmp = table[indexCalc(key)];
			while (tmp.next != null) {
				tmp = tmp.next;
				if (tmp.value == value) {
					return true;
				}
			}
		}
		return false;
    }

    @Override
    public int get(int key) {
        Entry tmp = table[indexCalc(key)];
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
        //localCount[indexCalc(key)] ++;
        size++;
    }

    @Override
    public void remove(int key) {
		Entry tmp = table[indexCalc(key)];

    }

    @Override
    public int size() {
        return size;
    }
}
