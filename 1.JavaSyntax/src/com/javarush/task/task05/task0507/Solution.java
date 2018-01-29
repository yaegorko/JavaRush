package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
    int count = 0;
    double sum = 0;


        //напишите тут ваш код
    while (true){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number == -1) {
            sum = sum / count;
            break;
        }
        else sum = sum + number;
        ++count;
    }
        System.out.println(sum);
    }

}

