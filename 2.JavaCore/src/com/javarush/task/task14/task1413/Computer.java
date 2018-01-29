package com.javarush.task.task14.task1413;

/**
 * Created by mysw3 on 18.05.2017.
 */
public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.mouse = mouse;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {

        return monitor;
    }

    public Keyboard getKeyboard() {

        return keyboard;
    }
}
