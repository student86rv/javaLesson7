package com.company;

public class Main {

    public static void main(String[] args) {
	
        IntMap map = new IntHashMap();
        map.put(2, 4);
        map.put(3, 11);
        map.put(18, 99);
        
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(18));
        System.out.println("Size: " + map.size());

        System.out.println("containsKey: "+map.containsKey(18));
        System.out.println("containsValue: "+map.containsValue(11));
        System.out.println(map);
    }
}
