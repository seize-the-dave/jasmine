package com.github.jasmine.lexer;


import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;

@RunWith(Theories.class)
public class TypeReferenceTokenFailureTest {
    @DataPoints
    public static String[] getDataPoints() {
        List<String> dataPoints = new ArrayList<String>();
        dataPoints.add("example");
        dataPoints.add("Example-");
        dataPoints.add("Example--Test");

        return dataPoints.toArray(new String[dataPoints.size()]);
    }

    @Theory
    public void testTypeReference(String dataPoint) {
        assertFalse(dataPoint + " should be invalid.", Token.TYPE_REFERENCE.matches(dataPoint));
    }
}
