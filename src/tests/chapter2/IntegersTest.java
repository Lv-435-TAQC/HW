package tests.chapter2;

import chapter2.Integers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        List<ArrayList<Integer>> actual = Integers.task554(6);
        assertIterableEquals(expected,actual);
    }
}