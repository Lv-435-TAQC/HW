package src.tests.chapter1;

import chapter1.NestedLoops;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopsTest {

    @Test
    void task329Simple() {
        LinkedList expected = new LinkedList<Integer>(Arrays.asList(3));
        LinkedList actual = NestedLoops.task329(5, 9);
        assertEquals(expected, actual, "Simple example");
    }

    @Test
    void task329EmptyRes() {
        LinkedList expected = new LinkedList<Integer>(Arrays.asList());
        LinkedList actual = NestedLoops.task329(5, 49);
        assertTrue(expected.equals(actual), "Example with empty result");
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
    void task323WithCorrectDataTest() {
        ArrayList<Integer>expected; new ArrayList<Integer>();
        Integer[] array =  {2,3,4,5,6,7,8,9,10,11,12};
        expected = new ArrayList<Integer>(Arrays.asList(array));
        ArrayList<Integer> actual = chapter1.NestedLoops.task323(13);
        assertIterableEquals(expected,actual);
    }

    @Test
    void task323MinValueTest() {
        ArrayList<Integer>expected; new ArrayList<Integer>();
        expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = chapter1.NestedLoops.task323(1);
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

    @Test
    void testTask330() {
        List<Integer> expected = Arrays.asList(6,28);
        List<Integer> actual = NestedLoops.task330(30);
        assertEquals(expected,actual);
    }
}