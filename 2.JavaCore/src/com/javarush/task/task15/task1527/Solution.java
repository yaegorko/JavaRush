package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String url = reader.readLine().trim();
        int paramStart = url.indexOf('?');
        int[][] map = new int[2][url.length()];
        char[] chars = url.toCharArray();
        int x = 1;
        map[0][0] = 1;
        map[1][0] = paramStart;
        for (int i = paramStart; i < chars.length; i++) {
            if (chars[i] == '=') {
                map[0][x] = 2;
                map[1][x] = i;
                x++;
            } else if (chars[i] == '&') {
                map[0][x] = 1;
                map[1][x] = i;
                x++;
            } else if (i == chars.length - 1) {
                map[0][x] = 1;
                map[1][x] = i + 1;
            }
        }

        for (int y = 1; y <= map[0].length; y++){
            if (map[0][y-1] <= map[0][y] && map[0][y] != 0){
                System.out.print(url.substring(map[1][y-1] + 1, map[1][y]) + " ");
            }
            else if (map[0][y] == 0)
                break;
        }

        if (url.contains("obj")){
            String afterObj = url.substring(url.indexOf("obj") + 4, url.indexOf('&'));
            System.out.println();
            try {
                double a = Double.parseDouble(afterObj.trim());
                alert(a);
            } catch (NumberFormatException v){
                alert(afterObj);
            }

        }



    }

       /*
       ВАРИАНТ 1 (недодуман)
       int paramStart = url.indexOf('?');
       while (true){

            int paramEnd = url.indexOf('&', paramStart + 1);
            int paramEqual = url.indexOf('=', paramStart + 1);

            if (paramEnd == -1 && paramEqual == -1){
                System.out.print(url.substring(paramStart + 1));
                break;
            }
            else if (paramEqual != -1 && paramEnd != -1 && paramEqual < paramEnd) {
                System.out.print(url.substring(paramStart + 1, paramEqual) + " ");
                paramStart = paramEnd;
            }
            else if (paramEqual != -1 && paramEnd != -1 && paramEqual > paramEnd) {
                System.out.print(url.substring(paramStart + 1, paramEnd) + " ");
                paramStart = paramEnd;
            }
            else if (paramEqual != -1 && paramEnd == -1 && paramEqual < url.length()) {
                System.out.print(url.substring(paramStart + 1, paramEqual) + " ");
                paramStart = paramEqual;
            }
            else if (paramEqual == -1 && paramEnd != -1 && paramEnd < url.length()) {
                System.out.print(url.substring(paramStart + 1, paramEnd) + " ");
                paramStart = paramEnd;
            }
        }*/



    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
