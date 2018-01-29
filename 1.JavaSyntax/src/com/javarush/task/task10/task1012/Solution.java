package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }
        // ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        int[] countArray = new int[abcArray.length];
        for (int i = 0; i < alphabet.size(); ++i){
            int count = 0;
            for (int j = 0; j < list.size(); ++j){
                String s = list.get(j);
                char[] sArray = s.toCharArray();
                for (int t = 0; t < s.length(); ++t){
                    if (alphabet.get(i) == sArray[t])
                        ++count;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
    }
}
