package src.tests.chapter1;

import chapter1.SimpleLoops;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleLoopsTest {

    @Test
    void task86a() {
        int expected = 3;
        int actual = SimpleLoops.task86a(222);
        assertEquals(expected, actual);
    }

    @Test
    void task107() {
        int expected = 2;
        int actual = SimpleLoops.task107(17);
        assertEquals(expected, actual);
    }

    @Test
    void task107MinValue() {
        int expected = 0;
        int actual = SimpleLoops.task107(2);
        assertEquals(expected, actual);
    }

    @Test
    public void task86btest() {
        int expectedResult = 5;
        int actualResult = SimpleLoops.task86b(32);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void task88v() {
        int expected = 334;
        int actual = SimpleLoops.task88v(433);
        assertEquals(expected,actual);
    }

    @Test
    void task88vOnlyOneDigit() {
        int expected = 5;
        int actual = SimpleLoops.task88v(5);
        assertEquals(expected,actual);
    }

    @Test
    void task87Simple(){
        int expected = 7;
        int actual = SimpleLoops.task87(1234,2);
        assertEquals(expected,actual,"Simple example");
    }

    @Test
    void task87CounterMoreThanDigits(){
        int expected = 15;
        int actual = SimpleLoops.task87(12345, 8);
        assertEquals(expected, actual, "Example when m more than in n digits");
    }

    @Test
    void task87CounterIsZero(){
        int expected = 0;
        int actual = SimpleLoops.task87(12345, 0);
        assertEquals(expected, actual, "Example when m is zero");
    }


    @Test
    void task88a() {
        boolean expected = true;
        boolean actual = SimpleLoops.task88a(18);
        assertEquals(expected,actual);
    }

    @Test
    void task88aNegative() {
        boolean expected = false;
        boolean actual = SimpleLoops.task88a(3);
        assertEquals(expected,actual);
    }
    @Test
    void task86h() {
        int expectedResult = 9;
        int actualResult = SimpleLoops.task86h(537);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void task108Test() {
        int expectedResult = 128;
        int actualResult = SimpleLoops.task108(76);
        assertEquals(expectedResult, actualResult);
    }
}