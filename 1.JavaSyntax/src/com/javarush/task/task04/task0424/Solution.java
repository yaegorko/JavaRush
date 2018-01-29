package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[3];
        //int[] arrayReady = new int[3];

        for(int i = 0; i < arrayInt.length; ++i)
            arrayInt[i] = Integer.parseInt(reader.readLine());
        if (arrayInt[0] == arrayInt[1] && arrayInt[0] != arrayInt[2])
            System.out.println(3);
        else if (arrayInt[2] == arrayInt[1] && arrayInt[2] != arrayInt[0])
            System.out.println(1);
        else if (arrayInt[2] == arrayInt[0] && arrayInt[2] != arrayInt[1])
            System.out.println(2);





    }
    //напишите тут ваш код
}

