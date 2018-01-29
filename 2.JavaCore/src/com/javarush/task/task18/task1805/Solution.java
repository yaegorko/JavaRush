package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Integer> listOfBytes = new ArrayList<>();
        TreeSet<Integer> setOfBytes = new TreeSet<>();

        while (fileInputStream.available() > 0) {
            listOfBytes.add(fileInputStream.read());
        }

        fileInputStream.close();
        reader.close();
        setOfBytes.addAll(listOfBytes);
        for (Integer entry : setOfBytes) {
            System.out.print(entry + " ");
        }
    }
}
