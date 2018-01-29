package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = reader.readLine();
        int amountOfDigit = numberString.length();
        int number = Integer.parseInt(numberString);
        int denom = 1;
        for (int i = 1; i <= amountOfDigit; ++i) {
            denom = (int) Math.pow(10, amountOfDigit - i);
            if ((number / denom)%2 == 0)
                ++even;
            else ++odd;
        }
        System.out.println("Even: " + even + " Odd: " + odd);


        //напишите тут ваш код
    }
}
