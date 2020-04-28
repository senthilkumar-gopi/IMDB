package com.incube.imdb.test.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import com.incube.imdb.pages.CategoryPage;

public class CategorySteps extends UIInteractionSteps {

  CategoryPage categoryPage;
  
  @Step
  public void verifyPageNavigation(String page) {
	  Assert.assertEquals("Mismatch in Page Category", page, categoryPage.getPageHeaderTitle());
  }
}