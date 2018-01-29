package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfArrayList= new ArrayList[3];
            for (int i = 0; i < arrayOfArrayList.length; ++i) {
                ArrayList<String> list = new ArrayList();
                list.add("1");
                list.add("2");
                list.add("3");
                arrayOfArrayList[i] = list;
            }

        return arrayOfArrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}