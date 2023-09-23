package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Object,Object> map = new HashMap<>();

        map.put("key1", 1);
        map.put(2, "value2");
        map.put(true, 3.5f);

        HashMap<Object, Object> map1 = Reverse.reverse(map);

        System.out.printf(String.valueOf(map1));


    }
}
