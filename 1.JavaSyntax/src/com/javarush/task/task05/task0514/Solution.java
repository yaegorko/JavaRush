package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
       Person person = new Person();
       person.initialize("Bob", 29);

        //напишите тут ваш код
    }

    static class Person {
        String name;//напишите тут ваш код
        int age;

        public void initialize(String name, int age){
            this.name = name;       // int age = 10;
            this.age = age;
    }

    }




}
