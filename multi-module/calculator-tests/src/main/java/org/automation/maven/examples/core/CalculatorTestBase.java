package org.automation.maven.examples.core;

import org.automation.maven.examples.Calculator;
import org.automation.maven.examples.reporting.TestLoggerExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestLoggerExtension.class)
public abstract class CalculatorTestBase {
    protected static Calculator calculator;
    @BeforeAll
    public static void initClass(){
        calculator = new Calculator();
    }
}
