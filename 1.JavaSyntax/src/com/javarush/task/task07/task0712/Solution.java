package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> spisok = new ArrayList();
        int bufValueMax = 0;
        int bufIndexMax = 0;
        int bufValueMin = 0;
        int bufIndexMin = 0;

        for (int i = 0; i < 10; ++i) {
            spisok.add(reader.readLine());
            if (spisok.get(i).length() > bufValueMax){
                bufValueMax = spisok.get(i).length();
                bufIndexMax = i;
            }

            if (i==0)
                bufValueMin = spisok.get(i).length();

            if (spisok.get(i).length() < bufValueMin){
                bufValueMin = spisok.get(i).length();
                bufIndexMin = i;
            }
        }
        if (bufIndexMin < bufIndexMax)
            System.out.println(spisok.get(bufIndexMin));
        else System.out.println(spisok.get(bufIndexMax));
    }
}
