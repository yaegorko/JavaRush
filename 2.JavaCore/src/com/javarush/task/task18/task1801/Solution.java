package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int maxByte = 0;
        int readByte = 0;
        while (fileInputStream.available() > 0) {
            readByte = fileInputStream.read();
            if (readByte > maxByte) {
                maxByte = readByte;
            }
        }
        System.out.println(maxByte);
        fileInputStream.close();
        reader.close();
    }
}
