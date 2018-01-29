package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader readFilename = new BufferedReader(new InputStreamReader(System.in)); // считываем название файла с клавы
        InputStream readFile = new FileInputStream(readFilename.readLine()); // открываем поток (из файла по его названию )

        while (readFile.available() > 0){   //пока поток inStream не дошел до конца

            System.out.print((char) readFile.read()); // считываем побитно поток и сразу приводим его к символьному типу
        }

        readFile.close();
        readFilename.close();
        System.out.println();

    }
}