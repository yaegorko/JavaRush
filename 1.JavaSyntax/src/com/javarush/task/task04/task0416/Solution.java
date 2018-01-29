

package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine().trim()); //ввод с клавиатуры вещественного числа, double.
        //String side = reader.readLine();
        //double minute = Integer.parseInt(side);

        //int partHour5 = (int) minute / 5; // целая  часть числа от деления
        double partHour = t - ((int) t / 5) * 5;
        if (partHour < 3)
            System.out.println("зелёный");
        else if (partHour >= 3 && partHour < 4)
            System.out.println("желтый");
        else
            System.out.println("красный");

    }
}