package src.tests.utils;


import org.junit.jupiter.api.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;
import utils.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;


@PrepareForTest(ConsoleReader.class)
class ConsoleReaderTest {

    @Test
    void readIntegerTest() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("1");

        ConsoleReader c = new ConsoleReader(bufferedReader);

        Integer expected = 1;
        Integer actual = c.readInteger();
        assertEquals(1, actual);
    }

    @Test
    void integersForArrayTest() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("3", "6", "9", "/");
        ConsoleReader c = new ConsoleReader(bufferedReader);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(6);
        expected.add(9);
        ArrayList<Integer> actual = c.integersForArray();
        assertIterableEquals(expected, actual);
    }

    @Test
    void integersForArrayWithCharTest() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("3", "h", "6", "9", "/");

        ConsoleReader c = new ConsoleReader(bufferedReader);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(6);
        expected.add(9);
        ArrayList<Integer> actual = c.integersForArray();
        assertIterableEquals(expected, actual);
    }

    @Test
    void isInteger() {
        boolean expectedResult = true;
        boolean actualResult = ConsoleReader.isInteger("55");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void isNotInteger() {
        boolean expectedResult = false;
        boolean actualResult = ConsoleReader.isInteger("55a");
        assertEquals(expectedResult, actualResult);
    }
}