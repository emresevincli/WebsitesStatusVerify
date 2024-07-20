package com.moontech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "json:target/cucumber.json",
                "html:target/default-html-reports.html"
        },
        features = "src/test/resources/features",
        glue = "com/moontech/step_Defs",
        dryRun = false,
        tags = "@moontech"
)
public class CukesRunner {
}