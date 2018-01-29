package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String flyObject = reader.readLine();
        if (flyObject.equals("helicopter"))
            result = new Helicopter();
        else if (flyObject.equals("plane")) {
            int numberOfPassengers = Integer.parseInt(reader.readLine());
            result = new Plane(numberOfPassengers);
        }


        //add your code here - добавьте код тут
    }
}
