package org.automation.maven.examples.tests;

import org.automation.maven.examples.core.CalculatorTestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdhocCalculatorTests extends CalculatorTestBase {

    @Test
    public void testIntAdd(){
        assertEquals(calculator.add(5,3),8,"Addition Fail");
    }

    @Test
    public void testFloatAdd(){
        assertEquals(calculator.add(5.8,3.3),9.1,"Addition Fail");
    }
}