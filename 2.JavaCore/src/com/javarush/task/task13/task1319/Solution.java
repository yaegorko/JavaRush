package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in)); //считываем название файла с консоли
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(readFileName.readLine())); // открываем поток в фаил с данным названием
        //readFileName.close();
        String s ="";
        BufferedReader readStrings = new BufferedReader(new InputStreamReader(System.in));
        while (!s.equals("exit")){ //пока строка не равна exit
            s = readStrings.readLine(); //считывапем строки с консоли
            outputFile.write(s);// записываем в поток в фаил.
            outputFile.newLine();
            //outputFile.flush();
        }
        outputFile.close();
        readFileName.close();
        readStrings.close();
        //закрываем потоки (1 лишний)
    }
}
