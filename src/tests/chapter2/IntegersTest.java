package tests.chapter2;

import chapter2.Integers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class IntegersTest {

    @Test
    void task554() {
        List<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(4);
        values.add(5);
        expected.add(values);
        List<ArrayList<Integer>> actual = Integers.task554(6);
        assertIterableEquals(expected, actual);
    }

    @Test
    void task559() {
        assertEquals(new LinkedList<Integer>(Arrays.asList(1, 3, 7)), Integers.task559(19), "Simple example");

    }

    @Test
    void task569() {
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(30);
        expectedResult.add(60);
        expectedResult.add(90);

        List<Integer> actualResult = Integers.task569(3);
        assertEquals(expectedResult,actualResult);
    }
}