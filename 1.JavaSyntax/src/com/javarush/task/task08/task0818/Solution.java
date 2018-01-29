package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bob1", 50);
        map.put("Bob2", 500);
        map.put("Bob3", 5000);
        map.put("Bob4", 5);
        map.put("Bob5", 50);
        map.put("Bob6", 500);
        map.put("Bob7", 5000);
        map.put("Bob8", 5000);
        map.put("Bob9", 500);
        map.put("Bob10", 5);

        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Map<String, Integer> mapCopy = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair : mapCopy.entrySet())
            if (pair.getValue() < 500)
                map.remove(pair.getKey());

    }//напишите тут ваш код


    public static void main(String[] args) {

        removeItemFromMap(createMap());

    }
}