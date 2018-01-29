package com.javarush.task.task04.task0426;

/*
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 0)
            System.out.println("ноль");
        else System.out.println(positive(a) + even(a) + "число");


    }

    public static String even(int i) {
        String b;
        if((i%2)==0)
            b = "четное ";
        else b = "нечетное ";
        return b;

    }

    public static String positive(int i) {
        String b;
        if (i > 0)
            b = "положительное ";
        else b = "отрицательное ";
        return b;
    }
}



