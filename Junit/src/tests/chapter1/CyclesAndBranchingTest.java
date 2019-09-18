package tests.chapter1;

import chapter1.CyclesAndBranching;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class CyclesAndBranchingTest {

    @Test
    void task224() {
        ArrayList<Integer> expected;
        new ArrayList<Integer>();
        Integer[] array = {1, 2, 4, 5, 10, 20};
        expected = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> actual = CyclesAndBranching.task224(20);
        assertIterableEquals(expected, actual);
    }

    @Test
    void task224MinValue() {
        ArrayList<Integer> expected;
        new ArrayList<Integer>();
        Integer[] array = {1};
        expected = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer> actual = CyclesAndBranching.task224(1);
        assertIterableEquals(expected, actual);
    }

    @Test
    void task243b() {
        Map<Integer, Integer> expected = new HashMap();
        expected.put(8, 6);
        Map<Integer, Integer> actual = new HashMap();
        actual = CyclesAndBranching.task243b(100);
        assertEquals(expected, actual);
    }

    @Test
    void task243bReturnEmpty() {
        Map<Integer, Integer> expected = new HashMap();
        Map<Integer, Integer> actual = new HashMap();
        actual = CyclesAndBranching.task243b(33);
        assertEquals(expected, actual);
    }

    @Test
    void task178b() {
        assertEquals(4, CyclesAndBranching.task178b(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 9, 12, 21))), "Simple example");
        assertEquals(0, CyclesAndBranching.task178b(new ArrayList<Integer>(Arrays.asList(2, 5, 10, 15))), "Example without multiples of 3");
    }

    @Test
    void task226() {
        assertEquals(new LinkedList<Integer>(Arrays.asList(36, 18)), CyclesAndBranching.task226(6, 9), "Simple example");
        assertEquals(new LinkedList<Integer>(Arrays.asList()), CyclesAndBranching.task226(5, 9), "Example with empty result");
    }

    @Test
    void task178d() {
        int expected = 1;
        int actual = CyclesAndBranching.task178d(40);
        assertEquals(expected, actual);
    }

    @Test
    void task178dReturnZero() {
        int expected = 0;
        int actual = CyclesAndBranching.task178d(3);
        assertEquals(expected, actual);
    }

    @Test
    public void task225Test() {
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(5));
        List<Integer> actualResult = CyclesAndBranching.task225(150);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void task225NegativeTest() {
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList());
        List<Integer> actualResult = CyclesAndBranching.task225(25);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void task178v() {
        int expected = 2;
        int actual = CyclesAndBranching.task178v();
        assertEquals(expected, actual);
    }

    @Test
    void task227() {
        List<Integer> expected = Arrays.asList(-9, -3, -1, 1, 3, 9);
        List<Integer> actual = CyclesAndBranching.task227(9, -9);
        assertEquals(expected, actual);
    }
}