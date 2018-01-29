package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] file = new byte[fileInputStream.available()];
        fileInputStream.read(file);
        float count = 0;
        for (byte simbols: file) {
            if (simbols == 32) {
                count ++;
            }
        }
        fileInputStream.close();
        if (count != 0)
        count = count / file.length * 100;
        String formattedDouble = String.format("%.2f", count);
        System.out.println(formattedDouble);
    }
}
