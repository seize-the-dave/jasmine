package com.github.jasmine.lexer;

import java.util.regex.Pattern;

public enum Token {
    /**
     * T-REC-X.680 200811 §12.2.1
     *
     * A "typereference" shall consist of an arbitrary number (one or more) of letters, digits, and hyphens. The initial
     * character shall be an upper-case letter. A hyphen shall not be the last character. A hyphen shall not be
     * immediately followed by another hyphen.
     *
     * T-REC-X.680 200811 §12.2.5
     *
     * A "modulereference" shall consist of the sequence of characters specified for a "typereference" in 12.2. In
     * analyzing an instance of use of this notation, a "modulereference" is distinguished from a "typereference" by
     * the context in which it appears.
     */
    TYPE_REFERENCE("^[A-Z](-?[a-zA-Z0-9]+)*$"),
    /**
     * T-REC-X.680 200811 §12.3
     *
     * An "identifier" shall consist of an arbitrary number (one or more) of letters, digits, and hyphens. The initial
     * character shall be a lower-case letter. A hyphen shall not be the last character. A hyphen shall not be
     * immediately followed by another hyphen.
     *
     * T-REC-X.680 200811 §12.4
     *
     * A "valuereference" shall consist of the sequence of characters specified for an "identifier" in 12.3. In
     * analyzing an instance of use of this notation, a "valuereference" is distinguished from an "identifier" by the
     * context in which it appears.
     */
    IDENTIFIER("^[a-z](-?[a-zA-Z0-9]+)*$"),
    /**
     * T-REC-X.680 200811 §12.8
     *
     * A "number" shall consist of one or more digits. The first digit shall not be zero unless the "number"
     * is a single digit.
     */
    NUMBER("^\\d|[1-9]\\d*$");

    private final Pattern pattern;

    private Token(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public boolean matches(String input) {
        return pattern.matcher(input).matches();
    }
}
