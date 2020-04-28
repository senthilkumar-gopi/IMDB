package com.incube.imdb.test.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import java.math.BigDecimal;
import org.junit.Assert;
import com.incube.imdb.pages.SearchResultsPage;

public class SearchResultsSteps extends UIInteractionSteps {

  SearchResultsPage resultsPage;
  
  @Step
  public void verifyTitle(String searchResult) {
	  Assert.assertTrue("Mismatch in Title name", resultsPage.getItemTitle().startsWith(searchResult));
  }
  
  @Step
  public void verifyRating(String value) {
	  String rating = resultsPage.getRating();
	  BigDecimal expected = new BigDecimal(value);
	  BigDecimal actual = new BigDecimal(rating);
	  Assert.assertTrue("Rating value is not more than "+value, actual.compareTo(expected)==1);
  }
  
  @Step
  public void verifyReview(String value) {
	  String review = resultsPage.getReviews();
	  BigDecimal expected = new BigDecimal(value);
	  BigDecimal actual = new BigDecimal(review.replace(",", ""));
	  Assert.assertTrue("Review count is not more than "+value, actual.compareTo(expected)==1);
  }
}