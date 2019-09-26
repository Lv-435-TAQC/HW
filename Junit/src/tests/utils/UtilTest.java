package src.tests.utils;

import org.junit.jupiter.api.Test;
import utils.Util;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void isNaturalPrimeNumberTest() {
        boolean expectedResult = true;
        boolean actualResult = Util.isNaturalPrimeNumber(3);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void isNaturalNumberFalseTest() {
        boolean expectedResult = false;
        boolean actualResult = Util.isNaturalPrimeNumber(1);
        assertEquals(expectedResult, actualResult);
    }
}