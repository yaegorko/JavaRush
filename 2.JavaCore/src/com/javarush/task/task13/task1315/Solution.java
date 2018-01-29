package com.javarush.task.task13.task1315;

/* 
Dog, Cat и Mouse
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    public static class Dog implements Movable, Eat{

        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }

    public static class Cat implements Movable, Eat, Eatable{
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }
    }
    public static class Mouse implements Movable, Eatable{
        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }
    }
}