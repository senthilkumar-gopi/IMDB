package com.incube.imdb.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageObject {

  @FindBy(xpath = "//div[@class='title_wrapper']/h1")
  private WebElement textTitle;
  
  @FindBy(xpath = "//span[@itemprop='ratingValue']")
  private WebElement textRating;
  
  @FindBy(xpath = "//span[@itemprop='ratingCount']")
  private WebElement textReviewCount;

  public SearchResultsPage(WebDriver driver) {
    super(driver);
  }

  @WhenPageOpens
  public void waitForPage() {
	  $("#quicklinksMainSection").waitUntilVisible();
  }

  public String getItemTitle() {
	  return textTitle.getText();
  }
  
  public String getRating() {
	  return textRating.getText();
  }
  
  public String getReviews() {
	  return textReviewCount.getText();
  }
}
