package tests.chapter1;

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
        int expected = 12221;
        int actual = SimpleLoops.task88v(222);
        assertEquals(expected,actual);
    }

    @Test
    void task87(){
        assertEquals(7,SimpleLoops.task87(1234,2),"Simple example");
        assertEquals(46,SimpleLoops.task87(95743567,10), "Example when m more than in n digits");
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
}