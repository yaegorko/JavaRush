package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(22, 56);
        closeToTen(7, 13);
    }

    public static void closeToTen(int a, int b) {
        //int firstArgument = 10 - a;
        //int secondArgument = 10 - b;
        if (abs(10-a) < abs(10-b))
            System.out.println(a);
        else if ((abs(10-a) > abs(10-b)))
            System.out.println(b);
        else System.out.println(a);
        //::CODE:

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}