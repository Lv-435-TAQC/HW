package tests.chapter1;
import chapter1.NestedLoops;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopsTest {

    @org.junit.jupiter.api.Test
    void task329() {
    }

    @org.junit.jupiter.api.Test
    void task331a() {
    }

    @org.junit.jupiter.api.Test
    void task330() {
    }

    @org.junit.jupiter.api.Test
    void task340() {
    }

    @Test
    void task323() {
        ArrayList<Integer>expected; new ArrayList<Integer>();
        Integer[] array =  {3,7};
        expected = new ArrayList<Integer>(Arrays.asList(array));
        ArrayList<Integer> actual = chapter1.NestedLoops.task323(10);
        assertIterableEquals(expected,actual);
    }

    @Test
    void task323MinValue() {
        ArrayList<Integer>expected; new ArrayList<Integer>();
        Integer[] array =  {0};
        expected = new ArrayList<Integer>(Arrays.asList(array));
        ArrayList<Integer> actual = chapter1.NestedLoops.task323(2);
        assertIterableEquals(expected,actual);
    }
}