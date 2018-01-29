package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        HashMap<Integer, Integer> mapOfByteCounters = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int readByte = fileInputStream.read();
            if (mapOfByteCounters.containsKey(readByte)) {
                int counter = mapOfByteCounters.get(readByte);
                counter ++;
                mapOfByteCounters.put(readByte, counter);
            } else {
                mapOfByteCounters.put(readByte, 1);
            }
        }
        fileInputStream.close();
        reader.close();
        int defValue = 0;
        for (Map.Entry entry : mapOfByteCounters.entrySet()) {
            if ((Integer) entry.getValue() >=  defValue) {
                defValue = (Integer) entry.getValue();
            }
        }
        for (Map.Entry entry : mapOfByteCounters.entrySet()) {
            if ((Integer) entry.getValue() ==  defValue) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
