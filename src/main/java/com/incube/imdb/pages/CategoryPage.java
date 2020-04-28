package com.incube.imdb.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends PageObject {

  @FindBy(xpath = "//h1[@class='header']")
  private WebElement textTitle;

  public CategoryPage(WebDriver driver) {
    super(driver);
  }

  @WhenPageOpens
  public void waitForPage() {
	  element(textTitle).waitUntilVisible();
  }

  public String getPageHeaderTitle() {
	  return textTitle.getText();
  }
}
