package com.javarush.task.task14.task1421;

/**
 * Created by mysw3 on 19.05.2017.
 */
class Singleton {

    private static Singleton instance;

    public static Singleton getInstance(){
        return Singleton.instance;
    }
}
