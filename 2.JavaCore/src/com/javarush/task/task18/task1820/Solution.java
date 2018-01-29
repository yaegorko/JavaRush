package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        byte[] dataByte = new byte[fileInputStream.available()];
        char[] dataChar = new char[fileInputStream.available()];
        if (fileInputStream.available() > 0) {
            int size = fileInputStream.read(dataByte);
        }
        for (int i = 0; i < dataByte.length; i++) {
            dataChar[i] = (char) dataByte[i];
        }
        fileInputStream.close();
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < dataChar.length; i++) {
            if (dataChar[i] != 32) {
                stringBuffer.append(dataChar[i]);
            } else {
                arrayList.add(Double.parseDouble(stringBuffer.toString()));
                stringBuffer = new StringBuffer();
            }
        }
        arrayList.add(Double.parseDouble(stringBuffer.toString()));
        PrintStream out = new PrintStream(new FileOutputStream(fileName2));
        System.setOut(out); // Забиваем наш второй файл в System.out
        for (Double num : arrayList) {
            System.out.print(Math.round(num) + " "); // Выводим на консоль ( попадает в файл )
        }
        out.close();
        fileInputStream.close();
        reader.close();

    }
}
