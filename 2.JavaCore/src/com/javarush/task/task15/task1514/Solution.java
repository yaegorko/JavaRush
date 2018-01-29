package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(23d, "qwer");
        labels.put(24d, "qwert");
        labels.put(25d, "qwerty");
        labels.put(26d, "qwertyu");
        labels.put(27d, "qwertyui");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
