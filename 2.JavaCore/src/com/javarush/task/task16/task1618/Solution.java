package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread newThread = new TestThread();
        newThread.start();
        newThread.interrupt();

        //Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{

        TestThread(){

        }

        public void run(){

        }


    }
}