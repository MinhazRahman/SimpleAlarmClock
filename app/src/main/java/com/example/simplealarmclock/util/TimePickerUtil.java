package com.example.simplealarmclock.util;

import android.os.Build;
import android.widget.TimePicker;

/**
 * In order to get the hour and minute selected on the TimePicker to set the alarm TimePicker utility is created.
 * It handles some of the complexities when dealing with different versions of the Android API.
 *
 * Prior to Android API level 23 (Android 6.0, Marshmallow) to get the hour and minute from the TimePicker widget
 * you needed to use the getCurrentHour() and getCurrentMinute() methods.
 * Since then those methods have been deprecated and now you need to use the getHour() and getMinute() methods.
 * */

public final class TimePickerUtil {
    public static int getTimePickerHour(TimePicker tp) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return tp.getHour();
        } else {
            return tp.getCurrentHour();
        }
    }

    public static int getTimePickerMinute(TimePicker tp) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return tp.getMinute();
        } else {
            return tp.getCurrentMinute();
        }
    }
}
