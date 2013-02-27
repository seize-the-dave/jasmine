package com.github.jasmine.lexer;


import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Theories.class)
public class TypeReferenceTokenTest {
    @DataPoints
    public static String[] getDataPoints() {
        List<String> dataPoints = new ArrayList<String>();
        dataPoints.add("Example");
        dataPoints.add("EXAMPLE");
        dataPoints.add("Example-Test");
        dataPoints.add("Example123");

        return dataPoints.toArray(new String[dataPoints.size()]);
    }

    @Theory
    public void testToken(String dataPoint) {
        assertTrue(dataPoint + " should be valid.", Token.TYPE_REFERENCE.matches(dataPoint));
    }
}
