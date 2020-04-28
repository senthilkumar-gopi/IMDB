Feature: User Signup and Signin 
		Create an account by filling the registration form.Verify whether the newly registered
		user was able to login to the application

  Scenario Outline: New User Sign Up
    Given User opens Imdb Page
    When User click Sign In link
    And User click 'Create a New Account' link
    When User enter name as '<name>'
    And User enter email as '<email>'
    And User enter password as '<password>'
    And User reenter password as '<password>'
    And User click create your IMDb account button
    Then User verify account created successfully with username as '<name>'
    
    Examples:
      | name           | email                  | password      |
      | AutomationUser | autousername@gmail.com | Password@1234 |
      
   Scenario Outline: Existing User Sign In
    Given User opens Imdb Page
    When User click Sign In link
    And User click 'Sign in with IMDb' link
    And User enter email as '<email>'
    And User enter password as '<password>'
		And User click Sign In button
		Then User verify account logged in successfully with username as '<name>'
    
    Examples:
      | name           | email                  | password      |
      | AutomationUser | autousername@gmail.com | Password@1234 |   
      