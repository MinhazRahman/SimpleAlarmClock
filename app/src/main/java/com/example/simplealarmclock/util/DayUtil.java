package com.example.simplealarmclock.util;

import java.util.Calendar;

public final class DayUtil {
    public static String toDay(int day) throws Exception {
        if (day == Calendar.SUNDAY) {
            return "Sunday";
        } else if (day == Calendar.MONDAY) {
            return "Monday";
        } else if (day == Calendar.TUESDAY) {
            return "Tuesday";
        } else if (day == Calendar.WEDNESDAY) {
            return "Wednesday";
        } else if (day == Calendar.THURSDAY) {
            return "Thursday";
        } else if (day == Calendar.FRIDAY) {
            return "Friday";
        } else if (day == Calendar.SATURDAY) {
            return "Saturday";
        }
        throw new Exception("Could not locate day");
    }
}