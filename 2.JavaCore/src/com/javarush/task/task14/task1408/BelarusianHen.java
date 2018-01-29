package com.javarush.task.task14.task1408;

/**
 * Created by mysw3 on 17.05.2017.
 */
public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 8;
    }

    @Override
    public String getDescription(){
        String s = super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу "+
                getCountOfEggsPerMonth() + " яиц в месяц.";
        return s;
    }


}
