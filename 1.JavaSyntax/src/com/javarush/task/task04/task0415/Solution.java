//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public Solution() {
    }

    public static void main(String[] args) throws Exception {
        int[] list = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; ++i) {
            String side = reader.readLine();
            list[i] = Integer.parseInt(side);
        }

        if(list[0] + list[1] > list[2] && list[0] + list[2] > list[1] && list[1] + list[2] > list[0]) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}
