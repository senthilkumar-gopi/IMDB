package com.incube.imdb.test.stepdefinitions;

import com.incube.imdb.test.steps.HomeSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeStepDefinitions {

	@Steps
	HomeSteps homePageSteps;
	
	@Given("User opens Imdb Page")
	public void openPage() {
		homePageSteps.openImdbPage();
	}
	
	@When("User search for '(.*)'")
	public void searchText(String searchRequest) {
		homePageSteps.searchFor(searchRequest);
	}
	
	@And("User click link '(.*)' from suggestion window")
	public void iClickResultsLink(String searchResult) {
		homePageSteps.clickSearchResults(searchResult);
	}
	
	@And("User click submenu '(.*)' from menu")
	public void clickSubMenu(String submenu) {
		homePageSteps.clickSubmenu(submenu);
	}
	
	@When("User click Sign In link")
	public void clickSignIn() {
		homePageSteps.clickSignInLink();
	}
	
	@Then("User verify account created successfully with username as '(.*)'")
	public void verifySuccess(String name) {
		homePageSteps.verifyAccountSuccess(name);
	}
	
	@Then("User verify account logged in successfully with username as '(.*)'")
	public void verifyLoggedIn(String name) {
		homePageSteps.verifyAccountSuccess(name);
	}
}
