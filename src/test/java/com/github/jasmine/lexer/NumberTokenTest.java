package com.github.jasmine.lexer;


import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class NumberTokenTest {
    @DataPoints
    public static String[] getDataPoints() {
        List<String> dataPoints = new ArrayList<String>();
        dataPoints.add("1");
        dataPoints.add("1234567890");
        dataPoints.add("0");

        return dataPoints.toArray(new String[dataPoints.size()]);
    }

    @Theory
    public void testToken(String dataPoint) {
        assertTrue(dataPoint + " should be valid.", Token.NUMBER.matches(dataPoint));
    }
}
