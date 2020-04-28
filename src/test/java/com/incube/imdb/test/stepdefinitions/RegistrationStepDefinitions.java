package com.incube.imdb.test.stepdefinitions;

import com.incube.imdb.test.steps.RegistrationSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrationStepDefinitions {

	@Steps
	RegistrationSteps registrationPageSteps;
	
	
	@When("User enter name as '(.*)'")
	public void setName(String name) {
		registrationPageSteps.setUserName(name);
	}
	
	@When("User enter email as '(.*)'")
	public void setEmail(String email) {
		registrationPageSteps.setUserEmail(email);
	}
	
	@And("User enter password as '(.*)'")
	public void setPassword(String pwd) {
		registrationPageSteps.setPwd(pwd);
	}
	
	@And("User reenter password as '(.*)'")
	public void setConfirmPassword(String confirmpwd) {
		registrationPageSteps.setConfirmPwd(confirmpwd);
	}
	
	@And("User click create your IMDb account button")
	public void clickCreateButton() {
		registrationPageSteps.clickCreateNewAccount();
	}

	@When("User click Sign In button")
	public void clickSignInButton() {
		registrationPageSteps.clickSignInButton();
	}
}
