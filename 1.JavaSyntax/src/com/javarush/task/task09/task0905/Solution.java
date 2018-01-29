package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        int countStackTrace = 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            //System.out.println(element.getMethodName());
            ++countStackTrace;
        }
        System.out.println(countStackTrace);

        return countStackTrace;
        //напишите тут ваш код
    }
}

