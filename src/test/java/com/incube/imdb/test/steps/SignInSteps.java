package com.incube.imdb.test.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import com.incube.imdb.pages.RegistrationPage;
import com.incube.imdb.pages.SignInPage;

public class SignInSteps extends UIInteractionSteps {

  SignInPage signInPage;
  RegistrationPage registerPage;
  

  @Step
  public void clickNewAccountLink(String lnk) {
	  registerPage = signInPage.clickCreateNewAccount(lnk);
  }
}
