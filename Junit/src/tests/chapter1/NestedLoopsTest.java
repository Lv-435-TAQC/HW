package tests.chapter1;

import chapter1.NestedLoops;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopsTest {

    @org.junit.jupiter.api.Test
    void task329() {
        assertEquals(new LinkedList<Integer>(Arrays.asList(3)), NestedLoops.task329(5, 9), "Simple example");
        assertEquals(new LinkedList<Integer>(Arrays.asList()), NestedLoops.task329(5, 49), "Example with empty result");
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

    @Test
    void task331b() {
        List<Integer> expected = Arrays.asList(4,3,2);
        List<Integer> actual = NestedLoops.task331b(29);
        assertEquals(expected,actual);
    }

    @Test
    void task331bEmpty() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = NestedLoops.task331b(31);
        assertEquals(expected,actual);
    }
}