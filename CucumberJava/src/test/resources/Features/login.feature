#Notes: Feature- A feature is to execute current test script that is available
#Notes: Scenario- only excutes one time and
#Notes: Scenario Outline- It excecutes multiple set of data. Bascially by loop(step by steps). data is provided by a tabular structure separated by(||).
#Notes: <>- conical bracket
#Notes: Gherkin lang-- given, when and then.
#Notes: Given: It specifies the context of text that has to be executed.
#Notes: When: It specifies the test action that has to performed.
#Notes: Then: The expected outcome of the test
#Notes: Tags -@smokescenario , @smoketest are used to execute only particular steps when defined 
#---------------
@smokescenario
Feature: feature to test login functionality

  @smoketest
  Scenario: Check Login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

  Scenario Outline: Check user Login is successfull with valid credentials
    Given user is on login page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then user navigated to the home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
