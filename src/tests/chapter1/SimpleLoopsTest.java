package tests.chapter1;

import chapter1.SimpleLoops;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}