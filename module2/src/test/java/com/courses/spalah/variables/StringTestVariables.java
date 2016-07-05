package com.courses.spalah.variables;

import java.util.ArrayList;
import java.util.List;

import com.courses.spalah.util.RandomUtils;
import com.courses.spalah.util.Pair;

/**
 * @author Ievgen Tararaka
 */
public class StringTestVariables {
    public static final List<Pair<Integer, String>> countEvenList = new ArrayList<>();
    public static final List<Pair<String, Pair<String, String>>> removeSymbolFromStringList = new ArrayList<>();

    static {
        countEvenList.add(new Pair<>(3, "1_4_8_11_22"));
        countEvenList.add(new Pair<>(3, "1_4_8_11_22"));
        countEvenList.add(new Pair<>(3, "1_4_8_11_22"));
        countEvenList.add(new Pair<>(3, "1_4_8_11_22"));

        removeSymbolFromStringList.add(new Pair<>("aaa", new Pair<>("x", "aaa")));
        removeSymbolFromStringList.add(new Pair<>("axa", new Pair<>("a", "aaxa")));
        removeSymbolFromStringList.add(new Pair<>("cbc", new Pair<>("b", "cbc")));
        removeSymbolFromStringList.add(new Pair<>("1x1x1", new Pair<>("1", "1x1x1")));
    }

    public static Object[] getAllRandom() {
        return new Object[]{
                RandomUtils.getRandomFrom(countEvenList),
                RandomUtils.getRandomFrom(removeSymbolFromStringList)
        };
    }
}
