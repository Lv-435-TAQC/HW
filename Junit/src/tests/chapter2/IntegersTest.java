package src.tests.chapter2;

import chapter2.Integers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegersTest {

    @Test
    void task554WithCorrectDataTest() {
        List<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(4);
        values.add(5);
        expected.add(values);
        List<ArrayList<Integer>> actual = Integers.task554(5);
        assertIterableEquals(expected, actual);
    }

    @Test
    void task554WithNullResultTest() {
        List<ArrayList<Integer>> expected = new ArrayList<>();
        List<ArrayList<Integer>> actual = Integers.task554(1);
        assertIterableEquals(expected, actual);
    }

    @Test
    void task554WithNoCorrectDataTest() {
        List<ArrayList<Integer>> expected = new ArrayList<>();
        List<ArrayList<Integer>> actual = Integers.task554(-1);
        assertIterableEquals(expected, actual);
    }

    @Test
    void task559Simple() {
        LinkedList expected = new LinkedList<Integer>(Arrays.asList(3, 7));
        LinkedList actual = Integers.task559(19);
        assertEquals(expected, actual, "Simple example");
    }

    @Test
    void task559MinValue() {
        LinkedList expected = new LinkedList<Integer>(Arrays.asList());
        LinkedList actual = Integers.task559(1);
        assertIterableEquals(expected, actual, "Example with min nature number");
    }

    @Test
    void task562() {
        List<Integer> expected = Arrays.asList(153, 370, 371, 407);
        List<Integer> actual = Integers.task562(1000);
        assertEquals(expected, actual);
    }

    @Test
    void task562returnEmpty() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Integers.task562(102);
        assertEquals(expected, actual);
    }

    @Test
    public void task555Test() {
        int[][] expectedResult = new int[][]{
                {1, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0},
                {1, 2, 1, 0, 0, 0, 0},
                {1, 3, 3, 1, 0, 0, 0},
                {1, 4, 6, 4, 1, 0, 0},
                {1, 5, 10, 10, 5, 1, 0},
                {1, 6, 15, 20, 15, 6, 1}
        };
        int[][] actualResult = Integers.task555(7);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void task555NegativeTest() {
        int[][] expectedResult = new int[][]{};
        int[][] actualResult = Integers.task555(0);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testtask561() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 5, 6, 25, 76));
        ArrayList<Integer> actual = Integers.task561(300);
        assertEquals(expected, actual, "Something wrong");
    }

    @Test
    public void testtask561RetunEmpty() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = Integers.task561(0);
        assertEquals(expected, actual, "Something wrong");
    }

    @Test
    public void testtask561Border() {
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1));
        ArrayList<Integer> actual = Integers.task561(1);
        assertEquals(expected, actual, "Something wrong");
    }
}