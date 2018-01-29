package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[3];
        int positiveCount = 0;
        int negativeCount = 0;

        int i;
        for(i = 0; i < arrayInt.length; ++i) {
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }

        for(i = 0; i < arrayInt.length; ++i) {
            if(arrayInt[i] > 0) {
                ++positiveCount;
            } else if (arrayInt[i] < 0)
                ++negativeCount;

        }
        System.out.println("количество отрицательных чисел: " + negativeCount);
        System.out.println("количество положительных чисел: " + positiveCount);
    }
}
