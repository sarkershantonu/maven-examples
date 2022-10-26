package org.automation.maven.examples.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;


@SuiteDisplayName("Regression Tests for Calculator")
@Suite
@SelectClasses({org.automation.maven.examples.tests.AdhocCalculatorTests.class})
//@SelectPackages({"org.automation.maven.examples.tests"})
public class RegressionTestSuite {
}
