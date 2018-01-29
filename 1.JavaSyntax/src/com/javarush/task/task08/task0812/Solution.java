package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        ArrayList<Integer> listOfCounts = new ArrayList<>();
        int count = 1;

        for (int i = 0; i < 10; ++i)
            listOfNumbers.add(Integer.parseInt(reader.readLine()));

        for (int i = 1; i < listOfNumbers.size(); ++i)
            if (listOfNumbers.get(i) == listOfNumbers.get(i-1))
                ++count;
            else {
                listOfCounts.add(count);
                count = 1;
            }
        listOfCounts.add(count);

        for (int i = 1; i < listOfCounts.size(); ++i)
            if (listOfCounts.get(i-1) < listOfCounts.get(i))
                count = listOfCounts.get(i);
        System.out.println(count);



    }
}





