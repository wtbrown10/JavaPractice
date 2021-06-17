package com.will;

public class Challenge1 {

    public Boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                if (year % 400 != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
