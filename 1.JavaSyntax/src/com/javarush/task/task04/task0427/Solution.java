package com.javarush.task.task04.task0427;

/*
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if(a > 0 && a < 1000)
            System.out.println(even(a) + digit(a) + "число");


    }

    public static String even(int i) {
        String b;
        if (i % 2 == 0) {
            b = "четное ";
        } else {
            b = "нечетное ";
        }
        return b;
    }

    public static String digit(int i){
        String b;
        if (i / 100 != 0)
            b = "трехзначное ";
        else if (i / 10 != 0)
            b = "двузначное ";
        else b = "однозначное ";
        return b;
    }
}
