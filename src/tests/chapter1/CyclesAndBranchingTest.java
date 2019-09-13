package tests.chapter1;

import chapter1.CyclesAndBranching;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
}