package tests.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import utils.ConsoleReader;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.powermock.api.mockito.PowerMockito.*;


class ConsoleReaderTest {

    @Test
    void readString() {
    }

 //   @Test
//    void readPositiveInteger() {
//    }
//    public class MockBufferReader extends BufferedReader{
//        public  String readLine(){
//            return "1";
//        }
//    };
//
//    public MockBufferReader setup(){
//
//        return new MockBufferReader();
//    }
//
//    @Test
//    void readInteger() {
//        InputStream in = mock(InputStream.class);
//        BufferedReader bufferedReader = mock(BufferedReader.class);
//        try {
//           whenNew(BufferedReader.class).withArguments(in).thenReturn(MockBufferReader.class);
//           when(bufferedReader.readLine()).thenReturn(new MockBufferReader().readLine());
//        }catch (java.lang.Exception ex ){
//
//        }
//        String expected = "1";
//        String actual = "1";
//        readInteger();
//        assertEquals(expected,actual);
//    }

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