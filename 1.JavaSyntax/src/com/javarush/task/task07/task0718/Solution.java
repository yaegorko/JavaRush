package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listOfStrings = new ArrayList<>(10);

        for (int i = 0; i < 10; ++i)
            listOfStrings.add(reader.readLine());

        int minOfStrings = listOfStrings.get(0).length();

        for (int i = 0; i < listOfStrings.size(); ++i) {
            if (listOfStrings.get(i).length() < minOfStrings){
                System.out.println(i);
                break;
            }
            else {
                minOfStrings = listOfStrings.get(i).length();

            }
        }
    }
}

