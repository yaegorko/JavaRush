package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; ++i) {
            String numberString = reader.readLine();
            array[i] = Integer.parseInt(numberString);//напишите тут ваш код
            if (i % 2 != 0)
                countOdd = countOdd + array[i];
            else countEven = countEven + array[i];
        }
        if (countEven > countOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
