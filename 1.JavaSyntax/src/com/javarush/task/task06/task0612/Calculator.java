package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
       int i = a + b;
        return i;
    }

    public static int minus(int a, int b) {
        int i = a - b;//напишите тут ваш код
        return i;
    }

    public static int multiply(int a, int b) {
        int i =  a * b;//напишите тут ваш код
        return i;
    }

    public static double division(int a, int b) {
        double i = (double) a / b;//напишите тут ваш код
        return i;
    }

    public static double percent(int a, int b) {
        double i = (double) a / 100 * b;//напишите тут ваш код
        return i;
    }

    public static void main(String[] args) {

    }
}