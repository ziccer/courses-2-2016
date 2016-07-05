package com.courses.spalah;

import java.util.Arrays;

import com.courses.spalah.util.TestUtils;
import com.courses.spalah.util.Pair;
import com.courses.spalah.variables.StringTestVariables;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Ievgen Tararaka
 */
@RunWith(Parameterized.class)
public class HomeWork2StringTest {
    private Pair<Integer, String> countEvenEntry;
    private Pair<String, Pair<String, String>> removeSymbolFromStringEntry;

    public HomeWork2StringTest(Pair<Integer, String> countEvenEntry,
                               Pair<String, Pair<String, String>> removeSymbolFromStringEntry) {
        this.countEvenEntry = countEvenEntry;
        this.removeSymbolFromStringEntry = removeSymbolFromStringEntry;
    }

    @Parameterized.Parameters(name = "{index}: метод countEven:{0}, метод removeSymbolFromString:{1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(StringTestVariables.getAllRandom(), StringTestVariables.getAllRandom(), StringTestVariables.getAllRandom());
    }

    @Test
    public void testCountEven() {
        int expected = countEvenEntry.left;
        int result = HomeWork2String.countEvenInString(countEvenEntry.right);
        String arguments = countEvenEntry.right;
        Assert.assertTrue(TestUtils.buildMessage("countEven", arguments, String.valueOf(result), String.valueOf(expected)),
                HomeWork2String.countEvenInString(countEvenEntry.right) == countEvenEntry.left);
    }

    @Test
    public void testRemoveSymbolFromString() {
        Pair<String, String> arguments = removeSymbolFromStringEntry.right;
        String expected = removeSymbolFromStringEntry.left;
        String result = HomeWork2String.removeSymbolFromString(arguments.left, arguments.right);
        Assert.assertTrue(TestUtils.buildMessage("removeSymbolFromString", arguments.toArgumentsString(), result, expected),
                expected.equals(result));
    }
}
