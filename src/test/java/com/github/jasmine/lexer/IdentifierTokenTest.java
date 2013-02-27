package com.github.jasmine.lexer;


import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class IdentifierTokenTest {
    @DataPoints
    public static String[] getDataPoints() {
        List<String> dataPoints = new ArrayList<String>();
        dataPoints.add("example");
        dataPoints.add("eXample");
        dataPoints.add("example123");
        dataPoints.add("example-test");

        return dataPoints.toArray(new String[dataPoints.size()]);
    }

    @Theory
    public void testToken(String dataPoint) {
        assertTrue(dataPoint + " should be valid.", Token.IDENTIFIER.matches(dataPoint));
    }
}
