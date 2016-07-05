package com.courses.spalah.variables;

import java.util.ArrayList;
import java.util.List;

import com.courses.spalah.util.RandomUtils;
import com.courses.spalah.util.ValueToArrayPair;

/**
 * @author Ievgen Tararaka
 */
public class LoopTestVariables {
    public static final List<ValueToArrayPair<Integer, Integer>> minArrays = new ArrayList<>();
    public static final List<ValueToArrayPair<Double, Double>> maxArrays = new ArrayList<>();
    public static final List<ValueToArrayPair<Float, Short>> averageArrays = new ArrayList<>();
    public static final List<ValueToArrayPair<char[], char[]>> reverseArrays = new ArrayList<>();

    static {
        LoopTestVariables.minArrays.add(new ValueToArrayPair<>(1, new Integer[]{7, 8, 10, 11, 12, 1}));
        LoopTestVariables.minArrays.add(new ValueToArrayPair<>(1, new Integer[]{1, 2, 3, 4, 8, 9, 9}));
        LoopTestVariables.minArrays.add(new ValueToArrayPair<>(6, new Integer[]{6, 6, 6, 6, 6}));
        LoopTestVariables.minArrays.add(new ValueToArrayPair<>(-111, new Integer[]{3, 2, 1, 0, -1, -111}));

        LoopTestVariables.maxArrays.add(new ValueToArrayPair<>(9.9999, new Double[]{1.0, 3.111, 2.2555, 9.9999}));
        LoopTestVariables.maxArrays.add(new ValueToArrayPair<>(123.123, new Double[]{-2.333, 123.123, 4.0}));
        LoopTestVariables.maxArrays.add(new ValueToArrayPair<>(100.0, new Double[]{3.33, 1.0, 2.0, 7.0, 100.0}));

        LoopTestVariables.averageArrays.add(new ValueToArrayPair<>(30.0F, new Short[]{10, 20, 30, 40, 50}));
        LoopTestVariables.averageArrays.add(new ValueToArrayPair<>(42.33F, new Short[]{2, 124, 1}));
        LoopTestVariables.averageArrays.add(new ValueToArrayPair<>(0F, new Short[]{23, 13, 23, -59}));
        LoopTestVariables.averageArrays.add(new ValueToArrayPair<>(4F, new Short[]{4, 4, 4, 4, 4, 4, 4}));

        LoopTestVariables.reverseArrays.add(new ValueToArrayPair(new char[]{'a'},
                new Character[]{'a'}));
        LoopTestVariables.reverseArrays.add(new ValueToArrayPair(new char[]{'e', 's', 'r', 'e', 'v', 'e', 'r'},
                new Character[]{'r', 'e', 'v', 'e', 'r', 's', 'e'}));
        LoopTestVariables.reverseArrays.add(new ValueToArrayPair(new char[]{'l', 'e', 'v', 'e', 'l'},
                new Character[]{'l', 'e', 'v', 'e', 'l'}));
    }

    public static Object[] getAllRandom() {
        return new Object[]{
                RandomUtils.getRandomFrom(LoopTestVariables.minArrays),
                RandomUtils.getRandomFrom(LoopTestVariables.maxArrays),
                RandomUtils.getRandomFrom(LoopTestVariables.averageArrays),
                RandomUtils.getRandomFrom(LoopTestVariables.reverseArrays)
        };
    }
}
