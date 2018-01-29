package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 0.5));
        System.out.println(convertEurToUsd(10, 0.6));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
       double dol = eur * course;
       return dol;
       //напишите тут ваш код
    }
}
