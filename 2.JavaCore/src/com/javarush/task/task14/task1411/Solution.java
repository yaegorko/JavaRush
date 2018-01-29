package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = "";
        ArrayList<String> arrayListOfKeys = new ArrayList<>();
        //тут цикл по чтению ключей, пункт 1

        while (true) {
            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"))
                arrayListOfKeys.add(key);
            else break;
        }


        for (int i = 0; i< arrayListOfKeys.size(); ++i){
            if (arrayListOfKeys.get(i).equals("user")) {
                person = new Person.User();
                doWork(person);
            }
            if (arrayListOfKeys.get(i).equals("loser")) {
                person = new Person.Loser();
                doWork(person);
            }
            if (arrayListOfKeys.get(i).equals("coder")) {
                person = new Person.Coder();
                doWork(person);
            }
            if (arrayListOfKeys.get(i).equals("proger")) {
                person = new Person.Proger();
                doWork(person);
            }

            //создаем объект, пункт 2
        }
        //вызываем doWork


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User) person).live();
        if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder)
            ((Person.Coder) person).coding();
        if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();


        // пункт 3
    }
}
