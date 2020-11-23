package com.it.iths;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = {"com.it.code","com.it.pop"},
        plugin = {"pretty","html:target/cucumber-reports.html",
                "json:target/Cucumber.json",
                "junit:target/cucumber.xml"})


public class TestRunner {
}
