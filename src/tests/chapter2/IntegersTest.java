package tests.chapter2;

import chapter2.Integers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegersTest {

    @Test
    void task554() {
        List<ArrayList<Integer>> expected  = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(4);
        values.add(5);
        expected.add(values);
        List<ArrayList<Integer>> actual = Integers.task554(5);
        assertIterableEquals(expected,actual);
    }
    @Test
    void task554WithNoullResult() {
        List<ArrayList<Integer>> expected  = new ArrayList<>();
        List<ArrayList<Integer>> actual = Integers.task554(1);
        assertIterableEquals(expected,actual);
    }
    @Test
    void task554NoCorrect() {
        List<ArrayList<Integer>> expected  = new ArrayList<>();
        List<ArrayList<Integer>> actual = Integers.task554(-1);
        assertIterableEquals(expected,actual);
    }

    @Test
    void task559(){
        assertEquals(new LinkedList<Integer>(Arrays.asList(1,3,7)), Integers.task559(19), "Simple example");

    }

    @Test
    void task562() {
        List<Integer> expected = Arrays.asList(153,370,371,407);
        List<Integer> actual = Integers.task562(1000);
        assertEquals(expected,actual);
    }

    @Test
    void task562returnEmpty() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Integers.task562(102);
        assertEquals(expected,actual);
    }
}