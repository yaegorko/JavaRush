package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        byte[] buffer1 = new byte[0];
        byte[] buffer2 = new byte[0];
        if (fileInputStream1.available() > 0) {
            buffer1 = new byte[fileInputStream1.available()];
            fileInputStream1.read(buffer1);
        }
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        if (fileInputStream2.available() > 0) {
            buffer2 = new byte[fileInputStream2.available()];
            fileInputStream2.read(buffer2);
        }
        fileInputStream1.close();
        fileInputStream2.close();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        fileOutputStream.write(buffer2);
        fileOutputStream.flush();
        fileOutputStream.write(buffer1);
        fileOutputStream.close();

    }
}
