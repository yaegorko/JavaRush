package com.javarush.task.task14.task1417;

/**
 * Created by mysw3 on 18.05.2017.
 */
public class Ruble extends Money {

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
