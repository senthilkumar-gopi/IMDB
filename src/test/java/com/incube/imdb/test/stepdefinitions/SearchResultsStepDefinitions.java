package com.incube.imdb.test.stepdefinitions;

import com.incube.imdb.test.steps.SearchResultsSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class SearchResultsStepDefinitions {

	@Steps
	SearchResultsSteps searchResultsPageSteps;
	
	@Then("User verify title as '(.*)'")
	public void checkTitle(String searchResult) {
		searchResultsPageSteps.verifyTitle(searchResult);
	}
	
	@And("User verify rating as more than '(.*)'")
	public void checkRating(String value) {
		searchResultsPageSteps.verifyRating(value);
	}
	
	@And("User verify review count as more than '(.*)'")
	public void checkReview(String value) {
		searchResultsPageSteps.verifyReview(value);
	}
}
