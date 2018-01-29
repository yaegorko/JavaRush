package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            A = Integer.parseInt(reader.readLine());
            reader.close();

        } catch (IOException x){}


    }
    public static int B;
    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            B = Integer.parseInt(reader.readLine());
            reader.close();

        } catch (IOException x){}

    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) throws IOException {

        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
