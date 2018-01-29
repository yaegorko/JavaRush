package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = reader.readLine();
        int number = Integer.parseInt(numberString);
        if (number == 0)
            System.out.println(0);
        else if (number > 0)
            System.out.println(2 * number);
        else System.out.println(number + 1);

    }

}