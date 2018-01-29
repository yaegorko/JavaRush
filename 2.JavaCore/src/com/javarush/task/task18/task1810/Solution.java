package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void read() throws IOException, DownloadException {
        //boolean marker = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while(!fileName.isEmpty()){
        FileInputStream fileInputStream = new FileInputStream(fileName);
        //char[] buffer = new char[fileInputStream.available()];
        if (fileInputStream.available() < 1000) {
            fileInputStream.close();
            reader.close();
            throw new DownloadException();
        } else {
            read();
        }
        }
    }

    public static void main(String[] args) throws DownloadException, IOException {

        read();

    }

    public static class DownloadException extends Exception {

    }
}
