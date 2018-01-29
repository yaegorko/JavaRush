package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = reader.readLine();
        int year = Integer.parseInt(numberString);

        System.out.println("количество дней в году: " + checkYear(year));



    }

    public static int checkYear(int year){
        float x = year%4;
        float checkFour = x /4;
        //System.out.println(checkFour);
        float y = year%100;
        float check100 = y / 100;
        //System.out.println(check100);
        float z = year%400;
        float check400 = z / 400;
        //System.out.println(check400);
        if (checkFour == 0 && check100 == 0 && check400 == 0)
            return 366;
        else if (check100 != 0 && checkFour == 0)
            return 366;
        else if (checkFour == 0 && check100 == 0 && check400 !=0)
            return 365;
        else return 365;

    }
}