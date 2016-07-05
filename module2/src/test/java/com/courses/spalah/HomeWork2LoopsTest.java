package com.courses.spalah;

import java.util.Arrays;

import com.courses.spalah.util.TestUtils;
import com.courses.spalah.util.ValueToArrayPair;
import com.courses.spalah.variables.LoopTestVariables;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

/**
 * @author Ievgen Tararaka
 */
@RunWith(Parameterized.class)
public class HomeWork2LoopsTest {
    private static final float PRECISION = 0.001F;

    private ValueToArrayPair<Integer, Integer> minArrayEntry;
    private ValueToArrayPair<Double, Double> maxArrayEntry;
    private ValueToArrayPair<Short, Short> averageArrayEntry;
    private ValueToArrayPair<char[], Character> reverseArrayEntry;

    public HomeWork2LoopsTest(ValueToArrayPair<Integer, Integer> minArrayEntry, ValueToArrayPair<Double, Double> maxArrayEntry,
                              ValueToArrayPair<Short, Short> averageArrayEntry, ValueToArrayPair<char[], Character> reverseArrayEntry) {
        this.minArrayEntry = minArrayEntry;
        this.maxArrayEntry = maxArrayEntry;
        this.averageArrayEntry = averageArrayEntry;
        this.reverseArrayEntry = reverseArrayEntry;
    }

    @Parameterized.Parameters(name = "{index}: метод min:{0}, метод max:{1}, метод average:{2}, метод reverse:{3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(LoopTestVariables.getAllRandom(), LoopTestVariables.getAllRandom(), LoopTestVariables.getAllRandom());
    }

    @Test
    public void testMin() {
        int expected = minArrayEntry.left;
        Integer[] arguments = minArrayEntry.right;
        int result = HomeWork2Loops.min(ArrayUtils.toPrimitive(minArrayEntry.right));
        assertTrue(TestUtils.buildMessage("min", Arrays.toString(arguments), String.valueOf(result), String.valueOf(expected)),
                expected == result);
    }

    @Test
    public void testMax() {
        double expected = maxArrayEntry.left;
        Double[] arguments = maxArrayEntry.right;
        double result = HomeWork2Loops.max(ArrayUtils.toPrimitive(maxArrayEntry.right));
        assertTrue(TestUtils.buildMessage("max", Arrays.toString(arguments), String.valueOf(result), String.valueOf(expected)),
                expected == result);
    }

    @Test
    public void testAverage() {
        int expected = averageArrayEntry.left;
        Short[] arguments = averageArrayEntry.right;
        double result = HomeWork2Loops.average(ArrayUtils.toPrimitive(averageArrayEntry.right));
        assertTrue(TestUtils.buildMessage("average", Arrays.toString(arguments), String.valueOf(result), String.valueOf(expected)),
                Math.abs(expected - result) < PRECISION);

    }

    @Test
    public void testReverse() {
        char[] expected = reverseArrayEntry.left;
        Character[] arguments = reverseArrayEntry.right;
        char[] result = HomeWork2Loops.reverse(ArrayUtils.toPrimitive(reverseArrayEntry.right));
        assertTrue(TestUtils.buildMessage("reverse", Arrays.toString(arguments), String.valueOf(result), String.valueOf(expected)),
                Arrays.equals(expected, result));
    }
}
