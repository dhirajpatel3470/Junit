package com.sr.cgi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    @DisplayName("addSumDemo")
    @ParameterizedTest
    @CsvSource({"1,2,3","2,3,4"})
    void addSum(int a,int b,int sum) {

        assertEquals(sum,Calculate.addSum(a,b));

    }

    @Test
    @DisplayName("isEvenDemo")
    @ParameterizedTest
    @CsvSource({"2,true","3,true"})
    void isEven(int num,boolean res) {

        assertEquals(res,Calculate.isEven(num));

    }
}