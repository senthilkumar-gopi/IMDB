Feature: IMDB search
  Search for ‘Game of thrones’ and select ‘Game of Thrones: The Last Watch’ link from the suggestion window

  Scenario Outline: Search from suggestion and click particular result
    Given User opens Imdb Page
    When User search for '<search_request>'
    And User click link '<search_result>' from suggestion window
    Then User verify title as '<search_result>'
    And User verify rating as more than '7'
    And User verify review count as more than '5000'
    
    Examples:
      | search_request | search_result                   |
      | Game of thrones| Game of Thrones: The Last Watch |
