package com.incube.imdb.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject {

  @FindBy(id = "ap_customer_name")
  private WebElement textName;
  
  @FindBy(id = "ap_email")
  private WebElement textEmail;
  
  @FindBy(id = "ap_password")
  private WebElement txtPassword;
  
  @FindBy(id = "ap_password_check")
  private WebElement txtConfirmPassword;
  
  @FindBy(id = "continue")
  private WebElement btnCreateAccount;
  
  @FindBy(id = "signInSubmit")
  private WebElement btnSignIn;
  

  public RegistrationPage(WebDriver driver) {
    super(driver);
  }

  @WhenPageOpens
  public void waitForPage() {
	  element(btnCreateAccount).waitUntilVisible();
  }

  public RegistrationPage enterName(String name) {
	  element(textName).clear();
	  element(textName).type(name);

	  return this;
  }
  
  public RegistrationPage enterEmail(String email) {
	  element(textEmail).clear();
	  element(textEmail).type(email);

	  return this;
  }
  
  public RegistrationPage enterPwd(String pwd) {
	  element(txtPassword).clear();
	  element(txtPassword).type(pwd);

	  return this;
  }
  
  public RegistrationPage enterConfirmPwd(String confirmpwd) {
	  element(txtConfirmPassword).clear();
	  element(txtConfirmPassword).type(confirmpwd);

	  return this;
  }
  
  public HomePage clickCreateAccount() {
	  element(btnCreateAccount).click();

	  return new HomePage(getDriver());
  }
  
  public HomePage clickSignInButton() {
	  element(btnSignIn).click();

	  return new HomePage(getDriver());
  }
}
