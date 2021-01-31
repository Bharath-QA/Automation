Feature: feature to test google search functionality

  Scenario: validate google seach working
  
    Given browser is open and user is on google search
    When user enters text in search box
    And user clicks on search button
    Then user is navigated to search results
