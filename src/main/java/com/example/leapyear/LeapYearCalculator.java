package com.example.leapyear;

public final class LeapYearCalculator {
    public boolean isLeapYear(String yearInput) {
        if (yearInput == null || yearInput.isBlank()) {
            throw new IllegalArgumentException("Year must be a non-empty value");
        }
        final long year;
        try {
            year = Long.parseLong(yearInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Year must be a numeric value", e);
        }
        return isLeapYear(year);
    }

    public boolean isLeapYear(long year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive AD value");
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}