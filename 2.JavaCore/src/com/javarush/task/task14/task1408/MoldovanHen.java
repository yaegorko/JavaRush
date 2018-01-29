package com.javarush.task.task14.task1408;

/**
 * Created by mysw3 on 17.05.2017.
 */
public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 7;
    }

    @Override
    public String getDescription(){
        String s = super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу "+
                getCountOfEggsPerMonth() + " яиц в месяц.";
        return s;
    }
}
