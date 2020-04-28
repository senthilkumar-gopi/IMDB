Feature: Menu navigation 
		As a new user navigates to IMDb home page, URL:​ ​http://www.imdb.com​, Click ‘Menu’ button, 
		displayed next to IMDb logo on left corner, select ‘Top Rated Shows’ link, appeared under 
		‘TV Shows’ category

  Scenario Outline: Navigate to TV Shows category from Menu
    Given User opens Imdb Page
    When User click submenu '<sub_menu>' from menu
    Then User verify the page navigated to '<landing_page>'
    
    Examples:
      | sub_menu        | landing_page       |
      | Top Rated Shows | Top Rated TV Shows |