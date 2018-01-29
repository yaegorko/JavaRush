package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        while (!input.equals("exit")){
            try {
                if (input.indexOf('.') != -1)
                    print(Double.parseDouble(input.trim()));
                else if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 128 )
                    print((short) Integer.parseInt(input));
                else if (Integer.parseInt(input) <= 0 || Integer.parseInt(input) >= 128)
                    print(Integer.parseInt(input));

            } catch (NumberFormatException x){
                print(input);
            }
            input = reader.readLine();
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
