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
        assertIterableEquals(expected, actual);
    }

    @Test

    void task323MinValueTest() {
        ArrayList<Integer>expected; new ArrayList<Integer>();
        expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = chapter1.NestedLoops.task323(1);
        assertIterableEquals(expected, actual);
    }

    @Test
    void task331b() {
        List<Integer> expected = Arrays.asList(4, 3, 2);
        List<Integer> actual = NestedLoops.task331b(29);
        assertIterableEquals(expected,actual);
    }

    @Test
    void task331bEmpty() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = NestedLoops.task331b(31);
        assertIterableEquals(expected,actual);
    }

    @Test
    void testTask330() {
        List<Integer> expected = Arrays.asList(6, 28);
        List<Integer> actual = NestedLoops.task330(30);
        assertEquals(expected, actual);
    }

    @Test
    public void testtask331a() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(6, 8, 30, 6, 30, 8, 8, 6, 30, 8, 30, 6, 10, 18, 24, 10, 24, 18, 18, 10, 24, 18, 24, 10, 24, 10, 18, 24, 18, 10, 30, 6, 8, 30, 8, 6));
        ArrayList<Integer> actual = NestedLoops.task331a(1000);
        assertEquals(expected, actual, "Something wrong");
    }

    @Test
    public void testtask331RetunEmpty() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = NestedLoops.task331a(4);
        assertEquals(expected, actual, "Something wrong");
    }
    @Test
    void testTask340() {
        int[] expectedResult = {1, 11, 15};
        int[] insert = {745, 51, 5, 13, 10, 4, 3, 2, 5, 1, 16, 235, 623, 235, 745, 27, 52, 234, 532, 63, 12};
        int[] actualResult = NestedLoops.task340(313, insert);
        assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    void zeroTestTask340() {
        int[] expectedResult = null;
        int[] insert = {745, 59, 193, 109, 49, 39, 42, 45, 41, 156, 623, 235, 745, 52, 234, 532, 67, 152, 532, 178};
        int[] actualResult = NestedLoops.task340(33, insert);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void task325Test() {
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(2, 5));
        List<Integer> actualResult = NestedLoops.task325(100);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void task325NegativeTest() {
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList());
        List<Integer> actualResult = NestedLoops.task325(1);
        assertEquals(expectedResult, actualResult);
    }
}