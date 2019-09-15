package tests.chapter1;

import chapter1.CyclesAndBranching;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CyclesAndBranchingTest {

    @Test
    void task224() {
        ArrayList<Integer>expected; new ArrayList<Integer>();
        Integer[] array =  {1,2,4,5,10,20};
        expected = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer>actual = CyclesAndBranching.task224(20);
        assertIterableEquals(expected,actual);
    }
    @Test
    void task224MinValue() {
        ArrayList<Integer>expected; new ArrayList<Integer>();
        Integer[] array =  {1};
        expected = new ArrayList<>(Arrays.asList(array));
        ArrayList<Integer>actual = CyclesAndBranching.task224(1);
        assertIterableEquals(expected,actual);
    }

    @Test
    void task243b() {
        Map<Integer,Integer> expected = new HashMap();
        expected.put(8,6);
        Map<Integer,Integer> actual =  new HashMap();
        actual = CyclesAndBranching.task243b(100);
        assertEquals(expected,actual);
    }

    @Test
    void task243bReturnEmpty() {
        Map<Integer,Integer> expected = new HashMap();
        Map<Integer,Integer> actual =  new HashMap();
        actual = CyclesAndBranching.task243b(33);
        assertEquals(expected,actual);
    }
}