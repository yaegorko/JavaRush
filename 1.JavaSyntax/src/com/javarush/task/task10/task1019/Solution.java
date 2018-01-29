package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> newMap = new HashMap<>();
        while (true) {
            try {
                Integer id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                newMap.put(name, id);
            }
            catch (NumberFormatException e){
                break;
            }
        }

        for (HashMap.Entry<String, Integer> entry : newMap.entrySet())
            System.out.println(entry.getValue() + " " + entry.getKey());
    }
}
