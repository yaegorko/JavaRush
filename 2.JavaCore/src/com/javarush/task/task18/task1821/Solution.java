package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    private static Map<Integer, Integer> sortByASCII(Map<Integer, Integer> unsortMap) {

        TreeMap<Integer, Integer>

        return sortedMap;
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ "=" + entry.getValue());
        }
    }

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        HashMap<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int key = fileInputStream.read();
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        printMap(sortByASCII(map));
    }
}
