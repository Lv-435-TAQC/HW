package src.tests.utils;

import org.junit.jupiter.api.Test;
import utils.Util;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void factorial() {
    }

    @Test
    void isNumeric() {
    }

    @Test
    void isPrimeNumber() {
    }

    @Test
    void fillUpTheArray() {
    }

    @Test
    void showPascalTriangle() {
    }

    @Test
    void getSumtoFindPerfectNumbers() {
    }

    @Test
    void writeIntArrayToConsole() {
    }

    @Test
    void isNaturalNumber() {
        boolean expectedResult = true;
        boolean actualResult = Util.isNaturalNumber(3);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void isNaturalNumberFalse() {
        boolean expectedResult = false;
        boolean actualResult = Util.isNaturalNumber(1);
        assertEquals(expectedResult, actualResult);
    }
}