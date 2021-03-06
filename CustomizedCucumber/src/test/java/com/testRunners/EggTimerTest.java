package com.testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue= {"com.stepDefinitions"},
		tags = "@component",
		monochrome = true,
		plugin = {"pretty","html:Cucumberhtml",
                "json:Cucumberjson/cucumber.json",
                "junit:Cucumberxml/cucumber.xml"}
		)
public class EggTimerTest {
}