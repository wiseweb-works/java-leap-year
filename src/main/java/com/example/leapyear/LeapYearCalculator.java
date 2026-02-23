package com.example.leapyear;

import java.util.Scanner;

public final class LeapYearCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }

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

    public static boolean isLeapYear(long year) {
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