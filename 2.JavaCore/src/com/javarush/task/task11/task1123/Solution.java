package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        int buf = 0;

        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        else for (int i = 0; i < array.length; ++i){
                for (int j = 1; j <= array.length; ++j){
                    if (array[i] > array [j-1]){
                        buf = array[j-1];
                        array[j-1] = array [i];
                        array[i] = buf;
                    }

                }
        }
        //Напишите тут ваше решение

        return new Pair<>(array[array.length-1],  array[0]);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
