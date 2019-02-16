package com.company;

public class Main {

    public static void main(String[] args) {
	
        IntMap map = new IntHashMap();
        map.put(2, 4);
        map.put(3, 11);
        
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println("size= " + map.size());

        System.out.println(map.containsKey(2));


    }
}
