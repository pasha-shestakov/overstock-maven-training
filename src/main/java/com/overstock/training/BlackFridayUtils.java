package com.overstock.training;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class BlackFridayUtils {
    public static int DaysToBlackFriday () {
        LocalDate today = LocalDate.now();
        return Days.daysBetween(today, new LocalDate("2022-11-25")).getDays();
    }
}
