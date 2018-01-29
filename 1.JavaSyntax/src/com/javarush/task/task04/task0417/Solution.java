package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[3];
        int[] arrayReady = new int[3];
        for (int i = 0; i < arrayInt.length; i++)
            arrayInt[i] = Integer.parseInt(reader.readLine()); // заполняем массив тремя целыми числами
        for (int i = 0; i < arrayInt.length; i++)
            for (int j = 0; j < arrayInt.length; j++)
                if (arrayInt[i] == arrayInt[j] && i != j) {
                    arrayReady[i] = arrayInt[i];
                    arrayReady[j] = arrayInt[j];
                }
        for (int i = 0; i < arrayReady.length; i++)
            if (arrayReady[i] != 0)
                System.out.print(arrayReady[i] + " ");


        /* if (arrayInt[1] == arrayInt[2] && arrayInt[2] == arrayInt[3] && arrayInt[1] == arrayInt[3])
            System.out.println(arrayInt[1] +" "+ arrayInt[2] +" "+ arrayInt[3]);
        else if ()*/
    }
}