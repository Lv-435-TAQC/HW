package src.tests.utils;;

import org.junit.jupiter.api.Test;
import utils.Util;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void factorial() {
        int expected = 24;
        int actual = Util.factorial(4);
        assertEquals(expected,actual);
    }
    @Test
    void isNumeric() {
        boolean expected = true;
        boolean actual = Util.isNumeric("7");
        assertEquals(expected,actual);
    }

    @Test
    void isNotNumeric() {
        boolean expected = false;
        boolean actual = Util.isNumeric("Seven");
        assertEquals(expected,actual);
    }

    @Test
    void isPrimeNumber() {
        boolean expected = true;
        boolean actual = Util.isPrimeNumber(11);
        assertEquals(expected,actual);
    }

    @Test
    void isNotPrimeNumber() {
        boolean expected = false;
        boolean actual = Util.isPrimeNumber(12);
        assertEquals(expected,actual);
    }

    @Test
    void fillUpTheArray() {
        int [] expected = new int[19];
        int [] actual = Util.fillUpTheArray(19);
        assertEquals(expected.length,actual.length);
    }

    @Test
    void showPascalTriangle() {
    }

    @Test
    void getSumtoFindPerfectNumbers() {
        int expected = 6;
        int actual = Util.getSumtoFindPerfectNumbers(6);
        assertEquals(expected,actual);
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