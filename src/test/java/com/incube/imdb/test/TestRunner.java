package com.incube.imdb.test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        monochrome = true,        
        features = { "src/test/resources/features/profile.feature" }
)
public class TestRunner {}
