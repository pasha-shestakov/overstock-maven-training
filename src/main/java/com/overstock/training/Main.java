package com.overstock.training;

import org.joda.time.Days;

public class Main {
    public static void main(String[] args){
        int daysTillBlackFriday = BlackFridayUtils.DaysToBlackFriday();
        System.out.println(daysTillBlackFriday);
    }
}
