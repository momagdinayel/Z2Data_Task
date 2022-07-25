package org.example.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"org/example/stepDefinition"},
        plugin = {
                "pretty",
                "html:target/cucumberReports/cucumber-pretty.html",
                "json:target/cucumberReports/cucumber-TestReport.json",
                "rerun:target/cucumberReports/rerun.txt",
                "junit:target/cucumberReports/cukes.xml",
        },
        tags="@Runner"
)
public class Runner extends AbstractTestNGCucumberTests {
}
