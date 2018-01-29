package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileNameIn = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileNameIn);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        int count = 0;
        for (byte elements : bytes) {
            if ((elements >= 65 && elements <= 90) || (elements >= 97 && elements <= 122)) {
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
