package src.tests.chapter1;

import chapter1.CyclesAndBranching;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


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
    void task178bSimple() {
        int expected = 4;
        int actual = CyclesAndBranching.task178b(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 9, 12, 21)));
        assertEquals(expected, actual, "Simple example");
    }

    @Test
    void task178bWithoutMultOf3() {
        int expected = 0;
        int actual = CyclesAndBranching.task178b(new ArrayList<Integer>(Arrays.asList(2, 5, 10, 19, 22)));
        assertEquals(expected, actual, "Example without multiples of 3");
    }

    @Test
    void task178bWithEmptyArray() {
        int expected = 0;
        int actual = CyclesAndBranching.task178b(new ArrayList<Integer>(Arrays.asList()));
        assertEquals(expected, actual, "Example with empty array");
    }

    @Test
    void task226Simple() {
        LinkedList expected = new LinkedList<Integer>(Arrays.asList(36, 18));
        LinkedList actual = CyclesAndBranching.task226(6, 9);
        assertEquals(expected, actual, "Simple example");
    }

    @Test
    void task226ExpectNotTrue() {
        LinkedList expected = new LinkedList<Integer>(Arrays.asList(3, 5));
        LinkedList actual = CyclesAndBranching.task226(5, 9);
        assertNotEquals(expected, actual);
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

    @Test
    void task184() {
        int[] expectedResult = {0, 12, 15, 0, 25, 24, 0};
        int[] insert = {16, 12, 15, 21, 25, 24, 26};
        int[] actualResult = CyclesAndBranching.task184(5, 1, insert);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testtask178hIsGood() {
        int expected = 2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(2, 5, 10, 15, 30));
        int actual = CyclesAndBranching.task178h(5, arrayList);
        assertEquals(expected, actual, "Something wrong");
    }

    @Test
    public void testtask178hBorder() {
        int expected = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int actual = CyclesAndBranching.task178h(7, arrayList);
        assertEquals(expected, actual, "Something wrong");
    }

    @Test
    public void task243a() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> actual = CyclesAndBranching.task243a(5);
        assertEquals(expected, actual, "Something wrong");
    }

    @Test
    public void task243aBigNumber() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(10, 30, 18, 26, 26, 18, 30, 10));
        ArrayList<Integer> actual = CyclesAndBranching.task243a(1000);
        assertEquals(expected, actual, "Something wrong");
    }

    @Test
    public void task243aReturnEmpty() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = CyclesAndBranching.task243a(3);
        assertEquals(expected, actual, "Something wrong");
    }

}