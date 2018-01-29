package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
       Hen henBel = HenFactory.getHen(Country.BELARUS);
       Hen henRus = HenFactory.getHen(Country.RUSSIA);
       Hen henUkr = HenFactory.getHen(Country.UKRAINE);
       Hen henMol = HenFactory.getHen(Country.MOLDOVA);


    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country == "Russia")
                hen = new RussianHen();
            if (country == "Ukraine")
                hen = new UkrainianHen();
            if (country == "Belarus")
                hen = new BelarusianHen();
            if (country == "Moldova")
                hen = new MoldovanHen();
            return hen;
        }
    }





}
