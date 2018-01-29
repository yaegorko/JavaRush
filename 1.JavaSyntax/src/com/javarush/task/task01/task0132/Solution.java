package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int firstNumber = number / 100;
        int secondNumber = (number - firstNumber * 100)/10;
        int thirdNumber = number - firstNumber * 100 - secondNumber * 10;
        int sum = firstNumber + secondNumber + thirdNumber;
        return sum;
        //напишите тут ваш код
    }
}