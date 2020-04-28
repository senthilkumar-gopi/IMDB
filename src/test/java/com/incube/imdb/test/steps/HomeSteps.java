package com.incube.imdb.test.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import com.incube.imdb.pages.CategoryPage;
import com.incube.imdb.pages.HomePage;
import com.incube.imdb.pages.RegistrationPage;
import com.incube.imdb.pages.SearchResultsPage;
import com.incube.imdb.pages.SignInPage;

public class HomeSteps extends UIInteractionSteps {

  HomePage homePage;
  CategoryPage categoryPage;
  SignInPage signInPage;
  RegistrationPage registerPage;
  SearchResultsPage resultsPage;
  

  @Step
  public void openImdbPage() {
	  getDriver().manage().window().maximize();
	  homePage.open();
  }

  @Step
  public void searchFor(String searchRequest) {
	  homePage = homePage.searchFor(searchRequest);
  }
  
  @Step
  public void clickSearchResults(String searchResult) {
	  resultsPage = homePage.selectFromSuggestion(searchResult);
  }
   
  @Step
  public void clickSubmenu(String submenu) {
	  categoryPage = homePage.clickSubMenuFromMenu(submenu);
  }
 
  @Step
  public void clickSignInLink() {
	  signInPage = homePage.navigateSignIn();
  }
  
  @Step
  public void verifyAccountSuccess(String name) {
	  Assert.assertTrue("User Not created/LoggedIn", homePage.isUserLoggedIn(name));
  }
}