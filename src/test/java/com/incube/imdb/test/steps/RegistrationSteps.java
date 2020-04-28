package com.incube.imdb.test.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import com.incube.imdb.pages.HomePage;
import com.incube.imdb.pages.RegistrationPage;

public class RegistrationSteps extends UIInteractionSteps {

  HomePage homePage;
  RegistrationPage registerPage;
  
  @Step
  public void setUserName(String name) {
	  registerPage.enterName(name);
  }
  
  @Step
  public void setUserEmail(String email) {
	  registerPage.enterEmail(email);
  }
  
  @Step
  public void setPwd(String pwd) {
	  registerPage.enterPwd(pwd);
  }
  
  @Step
  public void setConfirmPwd(String confirmpwd) {
	  registerPage.enterConfirmPwd(confirmpwd);
  }
  
  @Step
  public void clickCreateNewAccount() {
	  homePage = registerPage.clickCreateAccount();
  }
  
  @Step
  public void clickSignInButton() {
	  homePage = registerPage.clickSignInButton();
  }
}
