package com.incube.imdb.test.stepdefinitions;

import com.incube.imdb.test.steps.SignInSteps;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class SignInStepDefinitions {

	
	@Steps
	SignInSteps signInPageSteps;
	
	@And("User click '(.*)' link")
	public void clickNewSignUp(String lnk) {
		signInPageSteps.clickNewAccountLink(lnk);
	}
}