package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[3];
        int count = 0;
        for(int i = 0; i < arrayInt.length; ++i) {
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < arrayInt.length; ++i){
            if (arrayInt[i] > 0)
                ++count;

        }
        System.out.println(count);
        //напишите тут ваш код

    }
}
