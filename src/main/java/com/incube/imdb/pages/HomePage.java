package com.incube.imdb.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.serenitybdd.core.pages.PageObject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.imdb.com")
public class HomePage extends PageObject {

  @FindBy(id = "suggestion-search")
  private WebElement searchInputField;
  
  @FindBy(xpath = "//label[contains(@id,'imdbHeader-navDrawerOpen--desktop')]")
  private WebElement menuLink;
  
  @FindBy(xpath = "//ul[contains(@class,'suggestions-list')]//div")
  private List<WebElement> linkTitlesList;
  
  @FindBy(linkText = "Sign In")
  private WebElement signInLink;
  
  @FindBy(xpath = "//span[contains(@class,'logged-in')]")
  private WebElement loggedInUser;
  

  public HomePage(WebDriver driver) {
	  super(driver);
  }

  @WhenPageOpens
  public void waitUntilSearchAppears() {
	  $("#suggestion-search").waitUntilVisible();
  }

  public HomePage searchFor(String searchRequest) {
	  element(searchInputField).clear();
	  element(searchInputField).type(searchRequest);

	  return this;
  }
  
  public SearchResultsPage selectFromSuggestion(String searchRequest) {
	  for (WebElement element : linkTitlesList) {
		  System.out.println(element.getText());
		  if(element.getText().equalsIgnoreCase(searchRequest)) {
			 element.click();
			 break;
		  } 
	  }
	  return new SearchResultsPage(getDriver());
  }
  
  public CategoryPage clickSubMenuFromMenu(String submenu) {
	  element(menuLink).click();
	  By submenuLoc = By.linkText(submenu);
	  element(submenuLoc).waitUntilVisible().click();

	  return new CategoryPage(getDriver());
  }
  
  public SignInPage navigateSignIn() {
	  element(signInLink).waitUntilVisible().click();

	  return new SignInPage(getDriver());
  }
  
  public boolean isUserLoggedIn(String name) {
	  return name.contains(element(loggedInUser).getText());
  }
}
