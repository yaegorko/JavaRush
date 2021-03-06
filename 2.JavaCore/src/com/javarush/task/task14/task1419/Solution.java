package com.javarush.task.task14.task1419;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try{
            throw new EOFException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new NullPointerException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new IOException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new RuntimeException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new IllegalStateException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new ArrayIndexOutOfBoundsException ();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new ClassCastException ();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new IllegalArgumentException ();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new SecurityException ();

        } catch (Exception e){
            exceptions.add(e);
        }


        //напишите тут ваш код

    }

}
