package org.example;

import java.util.HashMap;
import java.util.Map;

public class Reverse {
    public static  <K,V> HashMap<V, K> reverse(Map<K,V> map){

        HashMap<V, K> swapped = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);
            swapped.put(value, key);
        }
        return swapped;
    }
}
