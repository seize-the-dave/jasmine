package com.github.jasmine.lexer;

import java.util.regex.Pattern;

public enum Token {
    /**
     * T-REC-X.680 200811 §12.2.1
     *
     * A "typereference" shall consist of an arbitrary number (one or more) of letters, digits, and hyphens. The initial
     * character shall be an upper-case letter. A hyphen shall not be the last character. A hyphen shall not be
     * immediately followed by another hyphen.
     */
    TYPE_REFERENCE("^[A-Z](-?[a-zA-Z0-9]+)*$");

    private final Pattern pattern;

    private Token(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public boolean matches(String input) {
        return pattern.matcher(input).matches();
    }
}
