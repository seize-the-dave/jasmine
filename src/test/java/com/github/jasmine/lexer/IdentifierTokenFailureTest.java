package com.github.jasmine.lexer;


import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;

@RunWith(Theories.class)
public class IdentifierTokenFailureTest {
    @DataPoints
    public static String[] getDataPoints() {
        List<String> dataPoints = new ArrayList<String>();
        dataPoints.add("Example");
        dataPoints.add("example-");
        dataPoints.add("example--Test");

        return dataPoints.toArray(new String[dataPoints.size()]);
    }

    @Theory
    public void testToken(String dataPoint) {
        assertFalse(dataPoint + " should be invalid.", Token.IDENTIFIER.matches(dataPoint));
    }
}
