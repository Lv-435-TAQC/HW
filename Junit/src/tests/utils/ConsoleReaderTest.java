package tests.utils;


import org.junit.jupiter.api.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;
import utils.ConsoleReader;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.powermock.api.mockito.PowerMockito.*;


@PrepareForTest(ConsoleReader.class)
class ConsoleReaderTest {

    @Test
    void readString() {
    }

    @Test
    void readPositiveIntegerTest() throws IOException {
//        BufferedReader bufferedReader = mock(BufferedReader.class);
//        when(bufferedReader.readLine()).thenReturn("-1");
//
//        ConsoleReader consoleReader = new ConsoleReader(bufferedReader);
//
//        Integer expected = 1;
//        Integer actual = consoleReader.readInteger();
//        assertEquals(expected,actual);
    }

    @Test
    void readIntegerTest() throws IOException {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("1");

        ConsoleReader c = new ConsoleReader(bufferedReader);

        Integer expected = 1;
        Integer actual = c.readInteger();
        assertEquals(1,actual);
    }

    @Test
    void integersForArray() {
    }
    @Test
    void isInteger(){
        boolean expectedResult = true;
        boolean actualResult = ConsoleReader.isInteger("55");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void isNotInteger(){
        boolean expectedResult = false;
        boolean actualResult = ConsoleReader.isInteger("55a");
        assertEquals(expectedResult, actualResult);
    }
}