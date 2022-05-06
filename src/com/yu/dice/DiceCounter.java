package com.yu.dice;

import com.yu.dice.Dice;

public class DiceCounter {
    public static void main(String[] args) {
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            System.out.print(dice.point);
            System.out.println(dice.isMax() ? "*" : "");
           /* if (dice.isMax()) {
                System.out.println("*");
            } else {
                System.out.println();
            }*/
            counters[dice.point-1]++;
        }
        int max = 0;
        int point = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + " " + counters[i] + " times");
            if (counters[i] > max) {
                max = counters[i];
                point = i+1;
            }
        }
        //System.out.println(point + " " + max + " times");
    }
}
