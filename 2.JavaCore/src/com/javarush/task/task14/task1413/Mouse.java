package com.javarush.task.task14.task1413;

/**
 * Created by mysw3 on 18.05.2017.
 */
public class Mouse implements CompItem {
    @Override

    public String getName() {
        return Mouse.class.getSimpleName().toString();
    }
}
