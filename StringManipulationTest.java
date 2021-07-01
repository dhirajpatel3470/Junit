package com.sr.cgi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    @DisplayName("vowelCountDemo")
    @ParameterizedTest
    @CsvSource({"Dhiraj,2","Vinay,3"})
    void vowelCount(String name,int count) {

        assertEquals(count,StringManipulation.vowelCount(name));
    }

    @Test
    @DisplayName("characterCountDemo")
    @ParameterizedTest
    @CsvSource({"Dhiraj,6","Vinay,10"})
    void characterCount(String name,int count) {

        assertEquals(count,StringManipulation.characterCount(name));
    }
}