package com.example.leapyear;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

    private final LeapYearCalculator calculator = new LeapYearCalculator();

    @Test
    @DisplayName("Divisible by 4 but not by 100 should be leap year")
    void shouldReturnTrueForTypicalLeapYear() {
        assertTrue(LeapYearCalculator.isLeapYear(2024));
    }

    @Test
    @DisplayName("Divisible by 100 but not by 400 should not be leap year")
    void shouldReturnFalseForCenturyYear() {
        assertFalse(LeapYearCalculator.isLeapYear(1900));
    }

    @Test
    @DisplayName("Divisible by 400 should be leap year")
    void shouldReturnTrueForFourHundredRule() {
        assertTrue(LeapYearCalculator.isLeapYear(2000));
    }

    @Test
    @DisplayName("Not divisible by 4 should not be leap year")
    void shouldReturnFalseForCommonYear() {
        assertFalse(LeapYearCalculator.isLeapYear(2023));
    }

    @Test
    @DisplayName("Lower boundary year 1 should not be leap year")
    void shouldHandleLowerBoundary() {
        assertFalse(LeapYearCalculator.isLeapYear(1));
    }

    @Test
    @DisplayName("Year 4 should be leap year")
    void shouldHandleFirstLeapYear() {
        assertTrue(LeapYearCalculator.isLeapYear(4));
    }

    @Test
    @DisplayName("Zero year should throw exception")
    void shouldThrowExceptionForZeroYear() {
        assertThrows(IllegalArgumentException.class, () -> LeapYearCalculator.isLeapYear(0));
    }

    @Test
    @DisplayName("Negative year should throw exception")
    void shouldThrowExceptionForNegativeYear() {
        assertThrows(IllegalArgumentException.class, () -> LeapYearCalculator.isLeapYear(-2024));
    }

    @Test
    @DisplayName("Non-numeric input should throw exception")
    void shouldThrowExceptionForNonNumericInput() {
        assertThrows(IllegalArgumentException.class, () -> calculator.isLeapYear("abcd"));
    }

    @Test
    @DisplayName("Blank input should throw exception")
    void shouldThrowExceptionForBlankInput() {
        assertThrows(IllegalArgumentException.class, () -> calculator.isLeapYear("   "));
    }

    @Test
    @DisplayName("Extremely large numeric input should be handled or rejected safely")
    void shouldThrowExceptionForOverflowingNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.isLeapYear("999999999999999999999999"));
    }

    @Test
    @DisplayName("Numeric string input should be correctly evaluated as leap year")
    void shouldReturnTrueForNumericStringInput() {
        assertTrue(calculator.isLeapYear("2024"));
    }

    @Test
    @DisplayName("Null string input should throw IllegalArgumentException")
    void shouldThrowExceptionForNullStringInput() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.isLeapYear(null));
    }
}