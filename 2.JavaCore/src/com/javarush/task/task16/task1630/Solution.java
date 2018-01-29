package com.javarush.task.task16.task1630;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();//add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName = "";
        private String s = "";
        private ArrayList<String> listString = new ArrayList();

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }
        @Override
        public String getFileContent() throws IOException {
            return this.s.trim();
        }

        @Override
        public void run() {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (bufferedReader.ready()) {
                    listString.add(bufferedReader.readLine());
                }
                bufferedReader.close();
                fileReader.close();
            }
            catch (IOException x){
            }
            s = listString.get(0) + " ";
            for (int i = 1; i < listString.size(); i++)
                s = s + listString.get(i) + " ";

        }
    }
}
