package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        //int minutes = seconds / 60;
        int currentHours = seconds / 60 / 60;
        int currentSeconds = seconds - currentHours * 60 * 60;
        return currentSeconds;
        //напишите тут ваш код
    }
}