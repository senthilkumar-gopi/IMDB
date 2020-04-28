package com.incube.imdb.test.stepdefinitions;

import com.incube.imdb.test.steps.CategorySteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CategoryStepDefinitions {

	@Steps
	CategorySteps categoryPageSteps;
	
	
	@Then("User verify the page navigated to '(.*)'")
	public void checkPageNavigated(String page) {
		categoryPageSteps.verifyPageNavigation(page);
	}
}
