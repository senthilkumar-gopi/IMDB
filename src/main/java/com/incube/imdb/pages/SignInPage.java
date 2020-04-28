package com.incube.imdb.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageObject {

  @FindBy(linkText = "Create a New Account")
  private WebElement lnkCreateAccount;

  public SignInPage(WebDriver driver) {
    super(driver);
  }

  @WhenPageOpens
  public void waitForPage() {
	  element(lnkCreateAccount).waitUntilVisible();
  }

  public RegistrationPage clickCreateNewAccount(String lnk) {
	  By xpathLoc = By.linkText(lnk);
	  element(xpathLoc).click();
	  
	  return new RegistrationPage(getDriver());
  }
}
