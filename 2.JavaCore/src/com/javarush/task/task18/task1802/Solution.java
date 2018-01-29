package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int readByte = 0;
        int minByte = 128;
        while (fileInputStream.available() > 0) {
            readByte = fileInputStream.read();
            if (readByte < minByte) {
                minByte = readByte;
            }
        }
        System.out.println(minByte);
        fileInputStream.close();
        reader.close();
    }
}
