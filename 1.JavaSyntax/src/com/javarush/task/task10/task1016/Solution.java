package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        HashMap<String, Integer> result2 = new HashMap<String, Integer>();
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext())
            result.put((String)iterator1.next(), 1);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() == 1) {
                Iterator iterator2 = list.iterator();
                int count = 0;
                while (iterator2.hasNext())
                    if (entry.getKey().equals(iterator2.next()))
                        ++count;
                result2.put(entry.getKey(), count);
            }
        }

        return result2;
    }

}

