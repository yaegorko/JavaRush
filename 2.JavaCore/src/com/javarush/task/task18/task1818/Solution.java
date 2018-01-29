package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);

        if (fileInputStream2.available() > 0) {
            byte[] buffer = new byte[fileInputStream2.available()];
            fileInputStream2.read(buffer);
            fileOutputStream.write(buffer);
            fileOutputStream.flush();
        }
        fileInputStream2.close();

        if (fileInputStream3.available() > 0) {
            byte[] buffer = new byte[fileInputStream3.available()];
            fileInputStream3.read(buffer);
            fileOutputStream.write(buffer);
            fileOutputStream.flush();
        }
        fileInputStream3.close();
        fileOutputStream.close();
        reader.close();
    }
}
